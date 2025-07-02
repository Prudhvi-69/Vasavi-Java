#include<stdio.h>

struct Node{
	int data;
	struct Node *left;
	struct Node *right;
}
struct Node* createNode(struct Node* root, int value)
{
	struct Node* newnode=(struct Node*)malloc(sizeof(struct Node));
	newnode->data=value;
	newnode->left=NULL;
	newnode->right=NULL;
	
	if(root==NULL)
	{	
		root=newnode;
		return newnode;
	}
	if(value<root->data)
		root->left=newnode;
	else
		root->right=newnode;	
	return newnode;
}
//insertNodes()	{ 			}
//To display the Nodes you can use 3 ways
inorder(struct Node* root)			
{
	inorder(root->left);
	printf("%d ",root->data);
	inorder(root->right);	
}
preorder(struct Node* root)
{
	printf("%d ",root->data);
	preorder(root->left);
	preorder(root->right);
}
postorder(struct Node* root)
{
	postorder(root->left);
	postorder(root->right);
	printf("%d ",root->data);
}











