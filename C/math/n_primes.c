/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdio.h>
#include<stdlib.h>
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
* the nth prime 
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	int total = atoi(argv[1]);
	int i=1;
	int count=0;
	printf("\nOriginal: ");
	while(count<total){
		if(is_prime(i)){
			//printf("%d ",i);
			count++;
		}
		i++;
	}
	printf("%d ",i - 1);
        // method 2
	printf("\nOptimized: ");
        int* prime_arr = malloc(total*sizeof(int));
        prime_arr[0] = 2;
        count = 1;
	i = 3;
        while(count<total){
		int flag =0;
		for(int j=0;j<count;j++){
			if(i%prime_arr[j] == 0){
				flag =1; 
				break;
			}		
		}
		if(flag == 0){ 
			//printf("%d ",i);
			prime_arr[count] = i;	
			count++;
		}
		i++;
	}
	printf("%d ",prime_arr[count-1]);
	return 0;
}
