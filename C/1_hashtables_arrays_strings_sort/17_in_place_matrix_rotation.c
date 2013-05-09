/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>
#include<math.h>
#include<time.h>


void print_mat(int **mat, int n){
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(mat[i][j]<=9) printf(" ");
			printf("%d ",mat[i][j]);
		}
		printf("\n");
	}
}

void rotate_90_degree(int **mat, int n, int level){
	if(level>=n/2)
		return;
	int first=level;
	int last = n-1-level;
	for(int i=first;i<last;i++){
		int offset=i-first;
		int t=mat[first][i]; //save top-left
		mat[first][i]=mat[last-offset][first]; //put bottom-left on top-left
		mat[last-offset][first]=mat[last][last-offset]; //put bottom-right on bottom-left
		mat[last][last-offset]=mat[i][last];//put top-right on bottom-right
		mat[i][last]=t; // restore saved to top-right
	}
	rotate_90_degree(mat,n,level+1);
}

/**
* USAGE: ./a.out 10
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	srand(time(0));
	int n=atoi(argv[1]);
	int **arr=malloc(n*sizeof(int*));
	for(int i=0;i<n;i++)
		arr[i]=malloc(n*sizeof(int));
	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
			arr[i][j]=rand()%100;
	printf("\nInput=\n");
	print_mat(arr,n);
	rotate_90_degree(arr,n,0);
	printf("\nOutput=\n");
	print_mat(arr,n);
	for(int i=0;i<n;i++)
		free(arr[i]);
	free(arr);
	return 0;
}