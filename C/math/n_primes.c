/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<time.h>

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

int nth_prime_method_1(int n){
	clock_t begin, end;
	begin = clock();
	int i=1;
	int count=0;
	while(count<n){
		if(is_prime(i)){
			count++;
		}
		i++;
	}
	end = clock();
	printf("\nMethod 1: %d (time: %lu)",i - 1, end - begin);
}
//Method: Sieve of Eratosthenes
int nth_prime_method_2(int n){
	clock_t begin, end;
	int i;
	begin = clock();
	int upper_bound = 4 * n * log(n); // since the nth prime is apporx. nlogn. need to find a tighter upper bound
	int *table = calloc(upper_bound, sizeof(int));
	int p=2;
	int last_prime = p;
	int count =1;
	while(count<n){
		i=2;
		while(i*p < upper_bound){
			table[i*p] = 1;
			i++;
		}
		p++;
		while(p<upper_bound){
			if(table[p] == 0) {
				last_prime = p;
				count++;//found a new prime
				break;
			}
			p++;
		}
	}
	free(table);
	end = clock();
	printf("\nMethod 2: %d (time: %lu)",last_prime, end - begin);
}


/**
* USAGE: ./a.out 5
* the nth prime 
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	int n = atoi(argv[1]);
	nth_prime_method_1(n);
	nth_prime_method_2(n);
	return 0;
}
