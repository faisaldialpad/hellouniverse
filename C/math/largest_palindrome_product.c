/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdio.h>
#include<math.h>
#include<stdlib.h>
int is_palindrome(int n){
	int len=0;
	while(n/(int)pow(10,len)) len++;
	while(len>1){
		int mul=pow(10,len-1);
		int d1=n/mul;
		int d2=n%10;
		if(d1!=d2) return 0;
		n-=d1*mul;
		n/=10;
		len-=2;
	}
	return 1;
}
int largest_palendrome_product(int digit){
	int max=(int)pow(10,digit)-1;
	int min=(int)pow(10,digit-1);
	int ret=-1;
	for(int i=max;i>=min;i--){
		for(int j=max;j>=min;j--){
			int num=i*j;
			if(num>ret && is_palindrome(num)) ret=num;
		}
	}
	return ret; 
}
/**
* USAGE: ./a.out 5 
* largest_palendrome_product(1)=9
* largest_palendrome_product(2)=9009
* largest_palendrome_product(3)=906609
* largest_palendrome_product(4)=99000099
* largest_palendrome_product(5)=2147447412
**/
int main(int argc, char *argv[]){
	if(argc<2) return 1;
	int digit = atoi(argv[1]);
	printf("%d",largest_palendrome_product(digit));
	return 0;
}
