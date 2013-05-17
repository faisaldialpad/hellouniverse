/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdio.h>
void extra_space_remove(char *s)
{
    char *s1=s;
    while(*s){
    	*s1++=*s++;
    	if(*(s-1) == ' '){
    		while(*s ==' ') s++;
    	}
    }
    *s1='\0'; 
}
/**
* USAGE: ./a.out "     hd a    ash    dash   "
**/
int main(int argc, char *argv[]){
	extra_space_remove(argv[1]);
	printf("%s",argv[1]);
	return 0;
}

