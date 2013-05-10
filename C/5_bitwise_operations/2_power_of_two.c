/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdio.h>

int power_of_2(int n) {
    return (n&(n-1))==0;
}

/**
* USAGE: ./a.out n
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	printf("%d",power_of_2(atoi(argv[1])));
	return 0;
}