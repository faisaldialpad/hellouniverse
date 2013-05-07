/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>

/**
* Encoding a string by replacing every space with %20
**/
char* str_space_encode(char * str){
	int count=0;
	int length=0;
	char* s=str;
	while(*s){
		if(*s==' ') count++;
		else length++;
		s++;
	}
	char * ret=malloc((3*count+length+1)*sizeof(char));
	s=str;
	char *r=ret;
	while(*s){
		if(*s==' '){ *r++='%';*r++='2';*r++='0';}
		else *r++=*s;
		s++;
	}
	*r='\0';
	return ret;
}

/**
* USAGE: ./a.out " stri ng 1 " 
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	char* result = str_space_encode(argv[1]);
	printf("%s",result);
	free(result);
	return 0;
}