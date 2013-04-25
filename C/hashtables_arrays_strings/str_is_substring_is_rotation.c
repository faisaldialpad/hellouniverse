#include<stdio.h>
#include<stdlib.h>
#include<string.h>


/**
* sub is a substring of str or not
**/
int is_substring(const char* str,const char* sub){
	const char* s1=str;
	const char*  s2=sub;
	int count=0;
	while(1){		
		if(*s2=='\0') return 1;
		else if(*s1=='\0') return 0;
		else if(*s1==*s2){
			count++;
			s2++;
		}	
		else{
			if(count!=0){
				s1-=count;
				count=0;
				s2=sub;
			}
		}
		s1++;
	}
	return 0;
}

/**
* s1 and s2 are rotations of eachother or not, given only the is_substring function.
**/
int is_rotation(const char* s1,const char* s2){
	int l1=strlen(s1);
	if(l1!=strlen(s2)) return 0;
	char* t=malloc(2*l1*sizeof(char));
	strcat(t,s1);
	strcat(t,s1);
	int r=is_substring(t,s2);
	free(t);
	return r;
}

/**
* USAGE: ./a.out string1 string2
**/
int main(int argc, char *argv[]){
	if(argc<3) return 1;
	printf("is_substring=%d",is_substring(argv[1],argv[2]));
	printf("\nis_rotation=%d",is_rotation(argv[1],argv[2]));
	return 0;
}