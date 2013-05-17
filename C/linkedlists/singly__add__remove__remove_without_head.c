/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>

/**
* This implementation assumes head is a dummy node. Otherwise, it would be tricky to implement remove all.
**/
struct node{
	struct node *next;
	int v;
};

int remove_node(struct node *head, int pos){
	while(pos-->0){
		if(!(head->next)) break;
		head=head->next;
	}
	if(head->next){
	        struct node *del = head->next;
			int ret=del->v;
			head->next=del->next;
			free(del);
			return ret;
	}
	return -1; //failure

}

int remove_node_without_head(struct node *cur_node){
    if(!cur_node || !(cur_node->next))
    	return -1; //failure
	else{
		struct node *next=cur_node->next;
		int ret=cur_node->v;
	    cur_node->v=next->v;
	    cur_node->next=next->next;
	    free(next);
		return ret;
	}
}
void add_node(struct node *head,int v, int pos){
	struct node *newnode=malloc(sizeof(struct node));
	newnode->v=v;
	while(pos-->0){
		if(!(head->next)) break;
		head=head->next;
	}
	newnode->next=head->next;
	head->next=newnode;
}
void print(struct node *head){
    printf("[ ");
	while(head->next){
		printf("%d ",head->next->v);
		head=head->next;
	}
	printf("]");
}

/**
* USAGE: ./a.out
**/
int main(){
	struct node *head=malloc(sizeof(struct node));
	printf("\nAfter creating = ");
	print(head);
	add_node(head,1,100);
	add_node(head,2,100);
	add_node(head,3,100);
	add_node(head,4,100);
	printf("\nAfter adding 1,2,3,4 in the end = ");
	print(head);
	add_node(head,5,0);
	add_node(head,6,2);
	printf("\nAfter adding 5 at pos 0 and 6 at pos 2 = ");
	print(head);
	remove_node(head,0);
	remove_node(head,0);
	printf("\nAfter removing 2 nodes from start = ");
	print(head);
	remove_node(head,2);
	printf("\nAfter removing node from pos 2 = ");
	print(head);
	remove_node_without_head(head->next->next);
	printf("\nAfter removing pos 1 without head = ");
	print(head);
	remove_node_without_head(head->next->next);
	printf("\nAfter removing last without head (failure) = ");
	print(head);
	free(head);
	return 0;
}