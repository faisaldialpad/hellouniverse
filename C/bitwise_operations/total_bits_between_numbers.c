/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdlib.h>
#include<stdio.h>
#include<time.h>
/*int no_of_bits(int i){
    i = i - ((i >> 1) & 0x55555555);
    i = (i & 0x33333333) + ((i >> 2) & 0x33333333);
    return (((i + (i >> 4)) & 0x0F0F0F0F) * 0x01010101) >> 24;
}
long long int total_number_of_bits_between(int a, int b){
	long long int count=0;
	while(a<=b)
		count+=no_of_bits(a++);
	return count;
}*/
int get_left_most_1(int n){
	int pos=0;
	while(n>1){
		n>>=1;
		pos++;
	}
	return pos;
}
long long int count_bits_upto(int n){
	if(n==0) return 0;
	int m = get_left_most_1(n);
	int k= (1<<m) -1;
	return count_bits_upto(n&k) + (long long int)(n-k) + (long long int)m*(1<<(m-1));
}
int get_left_most_0(unsigned int n){
	int pos=0;
	unsigned int cur=1<<31;
	while(n&cur){
		cur>>=1;
		pos++;
	}
	return 31-pos;
}
long long int count_zeros_upto(unsigned int n){
	if(n==~0) return 0;
	int m = get_left_most_0(n);
	int k= (~0)<<m;
	return count_zeros_upto(n|k) + (long long int)(k-n) + (long long int)(m)*(1<<(m-1));
}
long long int count_bits_upto_neg(int n){
	if(n==0) return 0;
	else if(n==-2147483648) return count_bits_upto_neg(n+1)+1;
	long long int abs_n=(long long int)abs(n)*32;
	return abs_n-count_zeros_upto(n);
}

long long int total_number_of_bits_between_opt(int a, int b){
	if(b<=-1){
		return count_bits_upto_neg(a) - count_bits_upto_neg(b+1);
	}
	else if(a>=1){
		return count_bits_upto(b) - count_bits_upto(a-1);
	}
	else return count_bits_upto_neg(a) + count_bits_upto(b);
}

int main(){
//	clock_t begin, end;
//	double time_spent;
//	begin = clock();
	int n;
	scanf("%d",&n);
	int a,b;
	for(int i=0;i<n;i++){
		scanf("%d %d",&a,&b);
	//	printf("%lld\n",total_number_of_bits_between(a,b));
		printf("%lld\n",total_number_of_bits_between_opt(a,b));
	}
//	end = clock();
//	time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
//	printf("\nTime spent=%lf",time_spent);
	return 0;
}
