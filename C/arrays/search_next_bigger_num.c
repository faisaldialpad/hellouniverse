/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>

/**
* next bigger number in the array
**/
int next_bigger(int *arr,int len, int n){
	int begin=0;
	for(int i=0;i<len;i++){
		if(!begin&&arr[i]==n){
			begin=1;
		}
		else if(begin&&arr[i]>n){
			return arr[i];
		}
	}
	return -1;
}

/**
* USAGE: ./a.out 4 5 6 7 5 [Array={4,5,6,7}, n=5] 
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	int *arr=malloc((argc-2)*sizeof(int));
	for(int i=1;i<argc-1;i++)
		*(arr+i-1) = atoi(argv[i]);
	int n=atoi(argv[argc-1]);
	printf("%d",next_bigger(arr,argc-2,n));
	free(arr);
	return 0;
}