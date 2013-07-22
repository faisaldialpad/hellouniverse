package arrays;


import java.util.*;

//https://www.hackerrank.com/challenges/unfriendly-numbers
public class UnfriendlyNumbers {
    public static long calc(long[]arr, long k){
    	LinkedList<Long> factors= new LinkedList<Long>();
        long max=(long) Math.sqrt(k);
        for(long i=1;i<=max;i++){
            if(k%i==0){
            	factors.addFirst(i);
            	if(i!=k/i)
            		factors.addFirst(k/i);
            }
        }
        for(int j=0;j<arr.length;j++){
        	if(factors.isEmpty()) break;
        	for(int i=0;i<factors.size();i++){
        		long div=factors.get(i);
	            if(arr[j]%div == 0){
	                factors.remove(i);
	                i--;
	            }
        	}
        }
        return factors.size();
    }
}