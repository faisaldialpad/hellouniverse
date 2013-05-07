/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>

/**
* find n in sorted (increasing) arr that is rotated unknown times (logn time)
* (returns the position). i=start_index j=end_index
* returns -1 if not found
**/
int rot_binary_search(int *arr,int n, int i, int j){
	if(j<i) return -1;
	int mid = (i+j)/2;
	if(n == *(arr+mid)){
		return mid;
	}
	else if(*(arr+i)<*(arr+mid)){ // 1st half is normally sorted
		if(n<*(arr+mid) && n>=*(arr+i)){ //if n is in the 1st half, since this half is normally sorted
			return rot_binary_search(arr,n,i,mid-1);
		}
		else{
			return rot_binary_search(arr,n,mid+1,j);
		}
	}
	else{ //if 1st half is not normally sorted, then 2nd half must be normally sorted
		if(n<=*(arr+j) && n>*(arr+mid)){ //if n is in the 2nd half, since this half is normally sorted
			return rot_binary_search(arr,n,mid+1,j);
		}
		else{
			return rot_binary_search(arr,n,i,mid-1);
		}
	}
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
	printf("%d",rot_binary_search(arr,n,0,argc-3));
	free(arr);
	return 0;
}