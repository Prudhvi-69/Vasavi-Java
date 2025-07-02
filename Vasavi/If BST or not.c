#include<stdio.h>
#include<stdlib.h>
#include<limits.h>

struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
};

struct Node* create(int value)
{
    struct Node* newnode = (struct Node*)malloc(sizeof(struct Node));
    newnode->data = value;
    newnode->left = newnode->right = NULL;
    return newnode;
}

struct Node* insert(struct Node* root, int value)
{
    if(root == NULL)
        return create(value);
    if(value < root->data)
        root->left = insert(root->left, value);
    else
        root->right = insert(root->right, value);
    return root;    
}

int isBSTUtil(struct Node* root, int min, int max)
{
    if(root == NULL)
        return 1;
    if(root->data <= min || root->data >= max)
        return 0;
    return isBSTUtil(root->left, min, root->data) &&  
           isBSTUtil(root->right, root->data, max);   
}

int isBST(struct Node* root)
{
    return isBSTUtil(root, INT_MIN, INT_MAX);
}

void main()
{
    struct Node* root = NULL;
    root = insert(root, 11);
    root = insert(root, 45);
    root = insert(root, 78);
    root = insert(root, 2);
    root = insert(root, 6);
    root = insert(root, 33);
    root = insert(root, 69);
    root = insert(root, 96);
    root = insert(root, 42);

    if(isBST(root))
        printf("The tree is a BST.\n");
    else
        printf("The tree is NOT a BST.\n");
}

