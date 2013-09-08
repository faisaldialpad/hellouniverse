package strings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class StringSimilarity {
	/**
	 * This one runs faster
	 */
	public static int calculate(String s){
		char[]arr=s.toCharArray();
		int length=arr.length;
		int count=length;
		for(int i=1;i<length;i++){
			int len=length-i;
			int j=0;
			for(;j<len;j++)
				if(arr[j]!=arr[j+i]){
					break;
				}
			count+=j;
		}
		return count;
	}
	/**
	 * This one runs slower, but easier to understand
	 */
	public static int calculateOriginal(String s){
		int length=s.length();
		int count=length;
		for(int i=1;i<length;i++){
			count+=similarCountOpt(s,i,length);
		}
		return count;
	}
	private static int similarCountOpt(String s, int sub_i, int length){
		int len=length-sub_i;
		for(int i=0;i<len;i++)
			if(s.charAt(i)!=s.charAt(i+sub_i)) 
				return i;
		return len;
	}

   public static void main(String[] args) throws FileNotFoundException {
	    final long startTime = System.currentTimeMillis();
	   	System.setIn(new FileInputStream("/Users/rfaisal/github/hellouniverse/Java/src/strings/input.txt"));
		Scanner scanner = new Scanner( System.in );
		int n=scanner.nextInt();
		for(int i=0;i<n;i++){
			String s=scanner.next();
			System.out.println(calculate(s));
		}
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
	}
}
