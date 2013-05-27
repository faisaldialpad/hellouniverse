/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>
#include<string.h>

/**
* Takes 2 strings and removes everything from the 1st string that exists in 2nd string.
* Assuming the string consistis of chars in ASCII range 0-127.
**/
void remove_from_2nd_string(char* str,const char* rm){
	int int_size = sizeof(int);
	int hash_size=128/int_size;
	int *hash=malloc(hash_size*int_size);
	for(int i=0;i<hash_size;i++)
		*(hash+i)=0;
	while(*rm){
		int pos=*rm;
		hash[pos/int_size]|=(1<<(pos%int_size));
		rm++;
	}
	char* s=str;
	char* s1=str;
	while(*s){
		int pos=*s;
		if(!(hash[pos/int_size]&(1<<(pos%int_size)))){
			*s1++=*s;	
		}
		s++;
	}
	*s1='\0';
}
/**
* USAGE: ./a.out string1 
**/
int main(int argc, char *argv[]){
	if(argc<3) return 1;
	remove_from_2nd_string(argv[1],argv[2]);
	printf("%s",argv[1]);
	return 0;
}
