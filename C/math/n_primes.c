/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdio.h>
#include<math.h>

/**
* if p is prime or not.
**/
int is_prime(int p){
	if(p<=1) return 0;
	int i=2;
	int sqrt_p=sqrt(p);
	while(i<=sqrt_p)
		if(p%i++==0)
			return 0;
	return 1;
}

/**
* USAGE: ./a.out 5 
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	int total = atoi(argv[1]);
	int i=1;
	int count=0;
	while(count<total){
		if(is_prime(i)){
			printf("%d ",i);
			count++;
		}
		i++;
	}
	return 0;
}