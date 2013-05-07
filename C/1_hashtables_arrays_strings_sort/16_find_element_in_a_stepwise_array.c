/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>
#include<math.h>
#define MAX(a,b) (((a)>(b))?(a):(b))

/**
* arr is such that each element is either +1 or -1 to its preceding element. i=start_index j=end_index
* returns max
**/
int find_element_stepwise_array(int *arr, int n, int length){
	int current = 0;
	int difference = abs(arr[current]-n);

	while (difference != 0 && current < length){
		difference = abs(arr[current]-n);
		current += difference;
	}

	if (difference == 0){
		return current;
	}

	return -1;
}

/**
* USAGE: ./a.out 1 2 1 2 3 4 5 6 7 6 5 4 5 6 7 8 9 3 [Array={1 2 1 2 3 4 5 6 7 6 5 4 5 6 7 8 9}, n=3] should return 4
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	int *arr=malloc((argc-2)*sizeof(int));
	for(int i=1;i<argc-1;i++)
		*(arr+i-1) = atoi(argv[i]);
	int n=atoi(argv[argc-1]);
	printf("%d",find_element_stepwise_array(arr,n,argc-2));
	free(arr);
	return 0;
}