#include<stdlib.h>
#include<stdio.h>
#include<string.h>

/**
* Returns the first duplicate char of a string
* Assuming the string consistis of chars in ASCII range 0-127.
**/
char str_first_duplicate_char(const char* str){
	int int_size = sizeof(int);
	int hash_size=128/int_size;
	int *hash=malloc(hash_size*int_size);
	for(int i=0;i<hash_size;i++)
		*(hash+i)=0;
	while(*str){ 
		int pos=*str;
		if(hash[pos/int_size]&(1<<(pos%int_size)))
			return *str;
		hash[pos/int_size]|=(1<<(pos%int_size)); 
		str++;
	}
	return '\0';
}

/**
* USAGE: ./a.out string1 
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	printf("%c",str_first_duplicate_char(argv[1]));
	return 0;
}