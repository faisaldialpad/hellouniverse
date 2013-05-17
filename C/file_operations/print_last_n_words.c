/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdio.h>
#include<math.h>
#include<stdlib.h>

void print_last_n_words(const char * filename, int n){
	FILE *fp=fopen(filename,"r");
	FILE *fp1=fopen(filename,"r");
	char * line;
	int count=0;
	if (fp == NULL || fp1==NULL) {
	  printf("Can't open file.\n");
	  exit(1);
	}
	while(fscanf(fp,"%s",line)!=EOF)
		if(count++>=n-1)
			break;
	while(fscanf(fp,"%s",line)!=EOF)
		fscanf(fp1,"%s",line);
	while(fscanf(fp1,"%s",line)!=EOF)
		printf("%s\n",line);
}

/**
* USAGE: ./a.out file.txt 5 
**/
int main(int argc, char *argv[]){
	if(argc<3) return 1;
	int n = atoi(argv[2]);
	print_last_n_words(argv[1],n);
	return 0;
}