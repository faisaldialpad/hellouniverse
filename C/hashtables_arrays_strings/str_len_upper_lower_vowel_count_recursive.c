#include<stdio.h>

int is_lower(char c){
	return c>=97 && c<=97+26;
}
int is_upper(char c){
	return c>=65 && c<=65+26;
}
int is_vowel(char c){
	char v[10]={'a','e','i','o','u','A','E','I','O','U'};
	int i;
	for(i=0;i<10;i++)
		if(v[i]==c) return 1;
	return 0;
}
int str_len(char * s){
	if(*s=='\0') return 0;
	else return str_len(++s)+1;
}
int lowercase_count(char *s){
	if(*s=='\0') return 0;
	else if(is_lower(*s)) return lowercase_count(++s)+1;
	else return lowercase_count(++s);
}
int uppercase_count(char *s){
	if(*s=='\0') return 0;
	else if(is_upper(*s)) return uppercase_count(++s)+1;
	else return uppercase_count(++s);
}
int vowel_count(char *s){
	if(*s=='\0') return 0;
	else if(is_vowel(*s)) return vowel_count(++s)+1;
	else return vowel_count(++s);
}

/**
* USAGE: ./a.out string1 
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	printf("length=%d, uppercase_count=%d, lowercase_count=%d, vowel_count=%d",
		str_len(argv[1]),uppercase_count(argv[1]),lowercase_count(argv[1]),vowel_count(argv[1]));
	return 0;
}