#include<stdlib.h>
#include<stdio.h>
#include<string.h>

/**
* Removes dulicate chars from a string
* Assuming the string consistis of chars in ASCII range 0-127.
**/
void str_remove_dulicates(char* str){
    int int_size = sizeof(int);
	int hash_size=128/int_size;
	int *hash=malloc(hash_size*int_size);
	for(int i=0;i<hash_size;i++)
		*(hash+i)=0;
	char* s=str;
	char* s1=str;
	while(*s){
		int pos=*s;
		if(!(hash[pos/int_size]&(1<<(pos%int_size)))){
			*s1++=*s;
			hash[pos/int_size]|=(1<<(pos%int_size));	
		}
		s++;
	}
	*s1='\0';
}
/**
* USAGE: ./a.out string1 
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	str_remove_dulicates(argv[1]);
	printf("%s",argv[1]);
	return 0;
}