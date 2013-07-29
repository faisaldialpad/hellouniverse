/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>

int no_of_bits(int a){
	int count=0;
	while(a){
		count++;
		a&=(a-1);
	}
	return count;
}
int total_number_of_bits_between(int a, int b){
	int count=0;
	while(a<=b)
		count+=no_of_bits(a++);
	return count;
}


int main(){
	int n;
	scanf("%d",&n);
	int a,b;
	for(int i=0;i<n;i++){
		scanf("%d %d",&a,&b);
		printf("%d\n",total_number_of_bits_between(a,b));
	}
	return 0;
}
