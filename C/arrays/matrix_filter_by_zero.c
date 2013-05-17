/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>
#include<math.h>
#include<time.h>


void print_mat(int **mat, int m, int n){
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			if(mat[i][j]<=9) printf(" ");
			printf("%d ",mat[i][j]);
		}
		printf("\n");
	}
}

/**
* For each cell that is zero, make the entire row and column zero.
* m=rows, n=columns
**/
void filter_by_zero(int **mat, int m, int n){
	int row[m];
	int column[n];
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			if(mat[i][j]==0){
				row[i]=1;
				column[j]=1;
			}
		}
	}
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			if(row[i]==1 || column[j]==1){
				mat[i][j]=0;
			}
		}
	}
}

/**
* USAGE: ./a.out 10 5 [m n]
**/
int main(int argc, char *argv[]){
	if(argc<3) return 1;
	srand(time(0));
	int m=atoi(argv[1]);
	int n=atoi(argv[2]);
	int **arr=malloc(m*sizeof(int*));
	for(int i=0;i<m;i++)
		arr[i]=malloc(n*sizeof(int));
	for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
			arr[i][j]=rand()%100;
	printf("\nInput=\n");
	print_mat(arr,m,n);
	filter_by_zero(arr,m,n);
	printf("\nOutput=\n");
	print_mat(arr,m,n);
	for(int i=0;i<m;i++)
		free(arr[i]);
	free(arr);
	return 0;
}