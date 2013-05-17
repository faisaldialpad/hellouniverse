/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>
#include<math.h>
#include<time.h>

#define MAX(a,b) (((a)>(b))?(a):(b))

void generate_sorted_matrix(int **mat, int m, int n){
	mat[0][0]=rand()%5;
	for(int i=1;i<m;i++)
		mat[i][0]=mat[i-1][0]+rand()%5;
	for(int j=1;j<n;j++)
		mat[0][j]=mat[0][j-1]+rand()%5;
	for(int i=1;i<m;i++){
		for(int j=1;j<n;j++){
			mat[i][j]=MAX(mat[i-1][j],mat[i][j-1])+rand()%5;
		}
	}
}
void print_mat(int **mat, int m, int n){
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			if(mat[i][j]<=9) printf("  ");
			else if(mat[i][j]>9 && mat[i][j]<=99) printf(" ");
			printf("%d ",mat[i][j]);
		}
		printf("\n");
	}
}

/**
* mat = sorted matrix, n= number to find
* row_s, row_e, column_s, column_e : start and end index for rows and columns in a linear search
* i,j answer.
**/
void linear_search(int **mat, int n, int row_s, int row_e, int column_s, int column_e, int *i, int *j){
	if(row_s>row_e || column_e<column_s){
		*i=-1;
		*j=-1;
	}
	else if(mat[row_s][column_e]==n){
		*i=row_s;
		*j=column_e;
	}
	else if(n>mat[row_s][column_e]){
		linear_search(mat,n,row_s+1,row_e,column_s,column_e,i,j);
	}
	else{
		linear_search(mat,n,row_s,row_e,column_s,column_e-1,i,j);
	}
}

/**
* USAGE: ./a.out 10 5 [m n]
**/
int main(int argc, char *argv[]){
	if(argc<3) return 1;
	srand(time(0));
	int M=atoi(argv[1]);
	int N=atoi(argv[2]);
	int **arr=malloc(M*sizeof(int*));
	for(int i=0;i<M;i++)
		arr[i]=malloc(N*sizeof(int));
	generate_sorted_matrix(arr,M,N);
	printf("\nInput=\n");
	print_mat(arr,M,N);
	
	int n;
	do{
		int r_i=-1;
		int r_j=-1;
		printf("\nSearch(-1 to stop)=");
		scanf("%d",&n);
		linear_search(arr,n,0,M-1,0,N-1,&r_i,&r_j);
		printf("\nFor n=%d : (%d,%d)",n,r_i,r_j);
	}while(n!=-1);
	
	for(int i=0;i<M;i++)
		free(arr[i]);
	free(arr);
	return 0;
}