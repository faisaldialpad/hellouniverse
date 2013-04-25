#include<stdlib.h>
#include<stdio.h>
#include<string.h>

/**
* assuming dest has enough memory for src
**/
void str_cpy(char *dest, const char* src){
	while(*dest++=*src++);
}

/**
* USAGE: ./a.out string1 
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	char* result = malloc(strlen(argv[1])*sizeof(char));
	str_cpy(result,argv[1]);
	printf("%s",result);
	free(result);
	return 0;
}