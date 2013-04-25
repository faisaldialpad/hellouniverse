#include<stdio.h>


/**
* Reverse a string.
**/
void str_rev(char* str){
	char* end=str;
	while(*end) end++;
	end--;
	char* start=str;
	while(start<end){
		char temp=*start;
		*start++=*end;
		*end--=temp;
	}
}

/**
* USAGE: ./a.out string1 
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	str_rev(argv[1]);
	printf("%s",argv[1]);
	return 0;
}