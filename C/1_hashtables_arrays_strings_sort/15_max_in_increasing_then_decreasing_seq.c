/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>
#include<math.h>
#define MAX(a,b) (((a)>(b))?(a):(b))

/**
* arr is increasing then decreasing. i=start_index j=end_index
* returns max
**/
int max_in_increasing_decreasing(int *arr, int i, int j){
	if(j-i<=1) //if only 2 element
		return MAX(*(arr+i),*(arr+j));
	int mid = (i+j)/2;
	if(*(arr+mid+1)>*(arr+mid)){ //derivative + must be in the 2nd half (including mid)
		return max_in_increasing_decreasing(arr,mid,j);
	}
	else{
		return max_in_increasing_decreasing(arr,i,mid);
	}
}

/**
* USAGE: ./a.out 4 5 6 7 5 [Array={4,5,6,7,5}] should return 7
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	int *arr=malloc((argc-1)*sizeof(int));
	for(int i=1;i<argc;i++)
		*(arr+i-1) = atoi(argv[i]);
	printf("%d",max_in_increasing_decreasing(arr,0,argc-2));
	free(arr);
	return 0;
}