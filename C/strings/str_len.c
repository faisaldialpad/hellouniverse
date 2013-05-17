/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdio.h>

/**
* Length of a string.
*/
int str_len(const char* s){
	const char *end=s;
	while(*end) end++;
	return end - s; //since char is 1 byte
}

/**
* USAGE: ./a.out string1 
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	printf("%d",str_len(argv[1]));
	return 0;
}