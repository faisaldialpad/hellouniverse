/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>

long int gcd(long int a, long int b){
	if(b==0) return a;
	else return gcd(b,a%b);
}

long int gcd_arr(long int *arr, long int n){
	if(n==1) return arr[0];
	else{
		arr[n-2]=gcd(arr[n-1],arr[n-2]);
		return gcd_arr(arr,n-1);
	}
}
long int lcm(long int a, long int b){
	return a*b/gcd(a,b);
}
long int lcm_arr(long int *arr, int n){
        if(n==1) return arr[0];
        else{
                arr[n-2]=lcm(arr[n-1],arr[n-2]);
                return lcm_arr(arr,n-1);
        }
}
/**
* USAGE: ./a.out 4 5 6 7 5 
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	long int *arr=malloc((argc-2)*sizeof(long int));
	long int *arr1=malloc((argc-2)*sizeof(long int));
	for(int i=1;i<argc;i++){
		*(arr+i-1) = atoi(argv[i]);
		*(arr1+i-1)=*(arr+i-1);
	}
	printf("gcd=%ld",gcd_arr(arr,argc-1));
	printf("lcm=%ld",lcm_arr(arr1,argc-1));
	free(arr);
	free(arr1);
	return 0;
}
