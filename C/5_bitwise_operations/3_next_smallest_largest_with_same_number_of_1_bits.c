/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdio.h>

/**
* Find the first 0 from LSB and swap it with the next 1 
**/
int next_smallest(int n) {
    int mask = 1;
    while(n & mask ) mask<<=1;
    n |=mask;
    mask<<=1;
    while(!(~(n & ~mask)) ) mask<<=1;
    n&=~mask;
    return n;
}

/**
* USAGE: ./a.out n
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	printf("%d",next_smallest(atoi(argv[1])));
	return 0;
}