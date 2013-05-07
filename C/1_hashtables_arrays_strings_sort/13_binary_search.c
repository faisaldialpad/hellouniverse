/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>

/**
* find n in sorted arr in logn time (returns the position). i=start_index j=end_index
* returns -1 if not found
**/
int binary_search(int *arr,int n, int i, int j){
	if(j<i) return -1;
	int mid = (i+j)/2;
	if(*(arr+mid)>n)
		return binary_search(arr,n,i,mid-1);
	else if(*(arr+mid)<n)
		return binary_search(arr,n,mid+1,j);
	else 
		return mid;
}

/**
* USAGE: ./a.out 4 5 6 7 5 [Array={4,5,6,7}, n=5] should return 1
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	int *arr=malloc((argc-2)*sizeof(int));
	for(int i=1;i<argc-1;i++)
		*(arr+i-1) = atoi(argv[i]);
	int n=atoi(argv[argc-1]);
	printf("%d",binary_search(arr,n,0,argc-3));
	free(arr);
	return 0;
}