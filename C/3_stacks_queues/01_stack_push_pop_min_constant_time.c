/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>

/**
* This implementation assumes head is a dummy node.
**/
struct node{
	struct node *next;
	int v;
};
struct node *stack;
struct node *min_stack;

int pop(){
	if(stack->next){
	        struct node *del = stack->next;
			int ret=del->v;
			stack->next=del->next;
			free(del);
			
			struct node *min_del = min_stack->next;
			min_stack->next=min_del->next;
			free(min_del);
			
			return ret;
	}
	return -1; //failure
}

int min(){
	if(min_stack->next){
			return min_stack->next->v;
	}
	return -1; //failure
}

void push(int v){
	struct node *newnode=malloc(sizeof(struct node));
	newnode->v=v;
	newnode->next=stack->next;
	stack->next=newnode;
	
	struct node *newminnode=malloc(sizeof(struct node));
	newminnode->v=min_stack->next && v>min_stack->next->v?min_stack->next->v:v;
	newminnode->next=min_stack->next;
	min_stack->next=newminnode;
}
void print(){
    struct node *head=stack;
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
	stack=malloc(sizeof(struct node));
	min_stack=malloc(sizeof(struct node));
	push(4);
	printf("\nAfter pushing 4 = ");
	print();
	printf(", min = %d",min());
	push(3);
	printf("\nAfter pushing 3 = ");
	print();
	printf(", min = %d",min());
	push(2);
	printf("\nAfter pushing 2 = ");
	print();
	printf(", min = %d",min());
	push(5);
	printf("\nAfter pushing 5 = ");
	print();
	printf(", min = %d",min());
	push(7);
	printf("\nAfter pushing 7 = ");
	print();
	printf(", min = %d",min());
	pop();
	printf("\nAfter poping = ");
	print();
	printf(", min = %d",min());
	pop();
	printf("\nAfter poping = ");
	print();
	printf(", min = %d",min());
	pop();
	printf("\nAfter poping = ");
	print();
	printf(", min = %d",min());
	pop();
	printf("\nAfter poping = ");
	print();
	printf(", min = %d",min());
	pop();
	printf("\nAfter poping = ");
	print();
	printf(", min = %d (error)",min());
	free(stack);
	free(min_stack);
	return 0;
}