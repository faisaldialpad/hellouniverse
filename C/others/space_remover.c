#include<stdio.h>
void space_remove(char *s)
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

main(int argc, char *argv[]){

space_remove(argv[1]);
printf("%s",argv[1]);

}

