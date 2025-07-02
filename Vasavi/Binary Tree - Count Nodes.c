#include<stdio.h>
#include<stdlib.h>

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

void preorder(struct Node* root)
{
	if(root == NULL) return;
	printf("%d ", root->data);
	preorder(root->left);
	preorder(root->right);
}

void inorder(struct Node* root)
{
	if(root == NULL) return;
	inorder(root->left);
	printf("%d ", root->data);
	inorder(root->right);
}

int count(struct Node* root)
{
	if(root == NULL)
		return 0;
	return 1 + count(root->left) + count(root->right);
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

	printf("\nRoot values in Preorder : ");
	preorder(root);

	printf("\nRoot values in Inorder : ");
	inorder(root);

	printf("\nNumber of nodes in the tree : %d\n", count(root));
}

