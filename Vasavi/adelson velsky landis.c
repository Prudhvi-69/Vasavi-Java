#include <stdio.h>
#include <stdlib.h>

// AVL Node structure
struct AVLNode {
    int key;
    struct AVLNode* left;
    struct AVLNode* right;
    int height;
};

// Get the height of a node
int getHeight(struct AVLNode* node) {
    if (node == NULL)
        return 0;
    return node->height;
}

// Get balance factor of a node
int getBalanceFactor(struct AVLNode* node) {
    if (node == NULL)
        return 0;
    return getHeight(node->left) - getHeight(node->right);
}

// Get the maximum of two numbers
int max(int a, int b) {
    return (a > b) ? a : b;
}

// Right Rotate (LL Case)
struct AVLNode* rightRotate(struct AVLNode* y) {
    struct AVLNode* x = y->left;
    struct AVLNode* T2 = x->right;

    // Perform rotation
    x->right = y;
    y->left = T2;

    // Update heights
    y->height = max(getHeight(y->left), getHeight(y->right)) + 1;
    x->height = max(getHeight(x->left), getHeight(x->right)) + 1;

    return x;
}

// Left Rotate (RR Case)
struct AVLNode* leftRotate(struct AVLNode* x) {
    struct AVLNode* y = x->right;
    struct AVLNode* T2 = y->left;

    // Perform rotation
    y->left = x;
    x->right = T2;

    // Update heights
    x->height = max(getHeight(x->left), getHeight(x->right)) + 1;
    y->height = max(getHeight(y->left), getHeight(y->right)) + 1;

    return y;
}

// Create a new node
struct AVLNode* createNode(int key) {
    struct AVLNode* node = (struct AVLNode*)malloc(sizeof(struct AVLNode));
    node->key = key;
    node->left = NULL;
    node->right = NULL;
    node->height = 1; // New node is initially at height 1
    return node;
}

// Insert a node into the AVL tree
struct AVLNode* insertNode(struct AVLNode* root, int key) {
    // Perform normal BST insertion
    if (root == NULL)
        return createNode(key);

    if (key < root->key)
        root->left = insertNode(root->left, key);
    else if (key > root->key)
        root->right = insertNode(root->right, key);
    else
        return root; // No duplicate keys allowed

    // Update height of current node
    root->height = max(getHeight(root->left), getHeight(root->right)) + 1;

    // Get balance factor
    int balance = getBalanceFactor(root);

    // Perform rotations if unbalanced
    if (balance > 1 && key < root->left->key) // LL Case
        return rightRotate(root);
    if (balance < -1 && key > root->right->key) // RR Case
        return leftRotate(root);
    if (balance > 1 && key > root->left->key) { // LR Case
        root->left = leftRotate(root->left);
        return rightRotate(root);
    }
    if (balance < -1 && key < root->right->key) { // RL Case
        root->right = rightRotate(root->right);
        return leftRotate(root);
    }

    return root;
}

// Find the node with minimum key value
struct AVLNode* minValueNode(struct AVLNode* node) {
    struct AVLNode* current = node;
    while (current->left != NULL)
        current = current->left;
    return current;
}

// Delete a node from AVL tree
struct AVLNode* deleteNode(struct AVLNode* root, int key) {
    if (root == NULL)
        return root;

    // Perform BST deletion
    if (key < root->key)
        root->left = deleteNode(root->left, key);
    else if (key > root->key)
        root->right = deleteNode(root->right, key);
    else {
        if ((root->left == NULL) || (root->right == NULL)) {
            struct AVLNode* temp = root->left ? root->left : root->right;
            if (temp == NULL) {
                temp = root;
                root = NULL;
            } else
                *root = *temp;
            free(temp);
        } else {
            struct AVLNode* temp = minValueNode(root->right);
            root->key = temp->key;
            root->right = deleteNode(root->right, temp->key);
        }
    }

    if (root == NULL)
        return root;

    // Update height
    root->height = max(getHeight(root->left), getHeight(root->right)) + 1;

    // Get balance factor
    int balance = getBalanceFactor(root);

    // Perform rotations if unbalanced
    if (balance > 1 && getBalanceFactor(root->left) >= 0)
        return rightRotate(root);
    if (balance > 1 && getBalanceFactor(root->left) < 0) {
        root->left = leftRotate(root->left);
        return rightRotate(root);
    }
    if (balance < -1 && getBalanceFactor(root->right) <= 0)
        return leftRotate(root);
    if (balance < -1 && getBalanceFactor(root->right) > 0) {
        root->right = rightRotate(root->right);
        return leftRotate(root);
    }

    return root;
}

// Inorder traversal (Left, Root, Right)
void inorderTraversal(struct AVLNode* root) {
    if (root != NULL) {
        inorderTraversal(root->left);
        printf("%d ", root->key);
        inorderTraversal(root->right);
    }
}

// Main function
int main() {
    struct AVLNode* root = NULL;

    // Insert elements
    root = insertNode(root, 10);
    root = insertNode(root, 20);
    root = insertNode(root, 30);
    root = insertNode(root, 40);
    root = insertNode(root, 50);
    root = insertNode(root, 25);

    printf("Inorder Traversal: ");
    inorderTraversal(root);
    printf("\n");

    // Delete a node
    root = deleteNode(root, 30);

    printf("After Deletion: ");
    inorderTraversal(root);
    printf("\n");

    return 0;
}

