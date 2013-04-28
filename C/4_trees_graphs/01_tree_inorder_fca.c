/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>


struct node{
	struct node *left;
	struct node *right;
	int v;
};
struct node *root;


void in_order(struct node *r){
	if(!r) return;
	in_order(r->left);
	printf("%d ", r->v);
	in_order(r->right);
}
void add_left(struct node *r,int v){
	if(r){
		if(r->left){
			free(r->left);
		}
		struct node *left=malloc(sizeof(struct node));
		left->v=v;
		r->left=left;
	}
}
void add_right(struct node *r,int v){
	if(r){
		if(r->right){
			free(r->right);
		}
		struct node *right=malloc(sizeof(struct node));
		right->v=v;
		r->right=right;
	}
}

int does_exists(struct node *cur_root, int v){
	if(!cur_root)
		return 0;
	else if(cur_root->v==v)
		return 1;
	else
		return does_exists(cur_root->left,v) || does_exists(cur_root->right,v);
}
int fca(struct node *cur_root, int v1, int v2){
	if(!cur_root || !does_exists(cur_root,v1) || !does_exists(cur_root,v2))
		return -1;//error
	if(does_exists(cur_root->left,v1) && does_exists(cur_root->left,v2))
		return fca(cur_root->left,v1,v2);
	else if(does_exists(cur_root->right,v1) && does_exists(cur_root->right,v2))
		return fca(cur_root->right,v1,v2);
	else return cur_root->v;
}
/**
* USAGE: ./a.out
**/
int main(){
	root=malloc(sizeof(struct node));
	root->v=8;
	
	add_left(root,4);
	add_right(root,12);
	
	add_left(root->left,2);
	add_right(root->left,6);
	add_left(root->right,10);
	add_right(root->right,14);
	
	add_left(root->left->left,1);
	add_right(root->left->left,3);
	add_left(root->left->right,5);
	add_right(root->left->right,7);
	add_left(root->right->left,9);
	add_right(root->right->left,11);
	add_left(root->right->right,13);
	add_right(root->right->right,15);
	
	in_order(root);
	printf("\nfca for 1 15=%d",fca(root, 1,15));
	printf("\nfca for 2 15=%d",fca(root, 2,15));
	printf("\nfca for 12 15=%d",fca(root, 12,15));
	printf("\nfca for 8 1=%d",fca(root, 8,1));
	printf("\nfca for 12 15=%d",fca(root, 12,15));
	printf("\nfca for 17 8=%d",fca(root, 17,8));
	free(root);
	return 0;
}