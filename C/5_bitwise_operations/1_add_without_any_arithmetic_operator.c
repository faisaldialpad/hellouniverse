/**
* Problem owner: Faisal Rahman
* Problem contributors: Faisal Rahman
**/
#include<stdio.h>
#include<math.h>


/**
* The Algorithm:
*    Step 1: Add 2 numbers as if there were no carry operation in the bit positions (an XOR operation).
*    Step 2: Generate a number by only doing the carry operations (an AND followed by a LEFT SHIFT).
*    Step 3: Add operation of the original 2 numbers will be same as the add operation of Step 1 and 2. So, recurse.
*    Step 4: Stop when the 2nd number is 0.
*
*
* Convergence proof:
*    For convergence, step2, i.e., (a & b) << 1, must have same or less number of 1 bits compared to the 2nd number, i.e., b for all the recursive iterations (the necessary condition) and step2, i.e., (a & b) << 1, must have less number of 1 bits compared to the 2nd number, i.e., b for some of the recursive iterations (the sufficient conditions). The necessary condition is obvious because of the AND operation, and the worst case for occurring the sufficient condition required number of times is O(k),which is guaranteed by the LEFT SHIFT operation, where k is the size of int in bits for the system.
**/

int add(int a, int b) {
    if (b == 0) return a;
    return add(a ^ b, (a & b) << 1);
}

/**
* USAGE: ./a.out num1 num2
**/
int main(int argc, char *argv[]){
	if(argc<3) return 1;
	printf("%d",add(atoi(argv[1]),atoi(argv[2])));
	return 0;
}