/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>
#include<string.h>

/**
* Returns the first non-repeating char of a string
* Assuming the string consistis of chars in ASCII range 0-127.
**/
char str_first_non_repeating_char(const char* str){
	int *hash=malloc(128*sizeof(int));
	for(int i=0;i<128;i++)
		*(hash+i)=0;
        const char * temp = str;
	while(*temp)	hash[*temp++]++;
	while(*str)
		if(hash[*str++]==1) 
			return *(str-1);
	return '\0';
}

/**
* USAGE: ./a.out string1 
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	printf("%c",str_first_non_repeating_char(argv[1]));
	return 0;
}
