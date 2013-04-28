/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>
#include<string.h>

/**
* Concat a string. Given enough memory available after dest.
**/
void str_cat(char *dest, const char *src)
{
    while (*dest) dest++;
    while (*dest++ = *src++);
}

/**
* USAGE: ./a.out string1 string2
**/
int main(int argc, char *argv[]){
	if(argc<3) return 1;
	char* result = malloc((strlen(argv[1])+strlen(argv[2])+1)*sizeof(char));
	strcpy(result,argv[1]); // from c library
	str_cat(result,argv[2]);
	printf("%s",result);
	free(result);
	return 0;
}