package dynamic_programming;

import java.util.LinkedList;

public class MaxValueContiguousSubSeq {
	//its a different problem
	public static int[] maxSequence(int[] input){
		int curSeqLength=1;
		int maxSeqLength=1;
		int startIndex=0;
		for(int i=1;i<input.length;i++){
			if(input[i]==input[i-1]+1){
				curSeqLength++;
			}
			else{
				if(curSeqLength>maxSeqLength){
					maxSeqLength=curSeqLength;
					startIndex=i-curSeqLength;
				}
				curSeqLength=1;
			}
		}
		if(curSeqLength>maxSeqLength){
			maxSeqLength=curSeqLength;
			startIndex=input.length-curSeqLength;
		}
		int []output= new int[maxSeqLength];
		for(int i=0;i<maxSeqLength;i++)
			output[i]=input[i+startIndex];
		return output;
	}
	public static int[] getMaxValueContiguousSubSeq(int[] input){
		int []table=new int[input.length];
		table[0]=input[0];
		for(int i=1;i<input.length;i++){
			table[i]=Math.max(table[i-1]+input[i], input[i]);
		}
		int max_i=0;
		int max=0;
		for(int i=1;i<input.length;i++){
			if(max<table[i]){
				max=table[i];
				max_i=i;
			}
		}
		int s=max_i;
		while(s>0 && table[s]>0) s--;
		int []output= new int[max_i-s+1];
		for(int i=s;i<=max_i;i++){
			output[i-s]=input[i];
		}
		return output;
		
	}
	public static void main(String[] args) {
		int []a=getMaxValueContiguousSubSeq(new int[]{9,1,-2,-3,4,5,-6,4,1,1,-6});
		int []b=maxSequence(new int[]{9,1,-2,-3,4,5,-6,4,1,1,-6});
	//	System.out.println(getMaxValueContiguousSubSeq(new int[]{9,1,-2,-3,4,5,-6,4,1,1,-6}).equals();

	}

}
