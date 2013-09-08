package arrays;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

//https://www.hackerrank.com/challenges/unfriendly-numbers
public class UnfriendlyNumbers {
	private static long  gcd(long a, long b){
		if(b==0) return a;
		else return gcd(b,a%b);
	}
	public static long calc(long[]arr, long k){
		HashSet<Long> hs= new HashSet<Long>();
		for(int i=0;i<arr.length;i++){
			hs.add(gcd(arr[i],k));
		}
    	int count=0;
    	long div1;
    	long div2;
        boolean flag=false;
        for(int i=1;i<=Math.sqrt(k);i++){
            if(k%i==0){
            	div1=i;
            	div2=k/i;
                for(long h:hs){
                    if(h%div1 == 0){
                        flag=true;
                        break;
                    }
                }
                if(flag==false) count++;
                flag=false;
                if(div1!=div2){
	                for(long h:hs){
	                    if(h%div2 == 0){
	                        flag=true;
	                        break;
	                    }
	                }
	                if(flag==false) count++;
	                flag=false;
                }
            }
        }
        return count;
    }
	
    public static void main(String[] args) throws FileNotFoundException {
    	final long startTime = System.currentTimeMillis();
	   	System.setIn(new FileInputStream("/Users/rfaisal/github/hellouniverse/Java/src/arrays/input.txt"));
		Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        long k=Long.parseLong(in.next());
        long []arr= new long[n];
        for(int i=0;i<n;i++){
        	arr[i]=Long.parseLong(in.next());
        }
        System.out.print(calc(arr,k));
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
    }
}