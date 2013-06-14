/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdio.h>

/**
* Checks if anagram or not
* Assuming the string consistis of chars in ASCII range 0-127.
**/
int is_anagram(const char* s1,const char* s2){
	int hash[128]={0};
	int i;
	while(*s1) hash[*s1++]++;
	while(*s2) hash[*s2++]--;
	for(i=0;i<128;i++)
		if(hash[i]) 
			return 0;
	return 1;
}

/**
* USAGE: ./a.out string1 string2
**/
int main(int argc, char *argv[]){
	if(argc<3) return 1;
	printf("%d",is_anagram(argv[1],argv[2]));
	return 0;
}
