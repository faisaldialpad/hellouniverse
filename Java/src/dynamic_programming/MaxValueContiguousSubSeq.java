package dynamic_programming;

import java.util.LinkedList;

public class MaxValueContiguousSubSeq {
	private int[] seq;
	/**
	 * Needed for dynamic programming algorithm.
	 */
	private int []table;
	public MaxValueContiguousSubSeq(int[] seq){
		this.seq=seq;
		if(seq!=null && seq.length!=0) 
			table= new int[seq.length]; 
	}
	private void calculate(){
		table[0]=seq[0];
		for(int i=1;i<seq.length;i++){
			table[i]=Math.max(table[i-1]+seq[i], seq[i]);
		}
	}
	public LinkedList<Integer> getMaxValueContiguousSubSeq(){
		calculate();
		int max_i=0;
		int max=0;
		for(int i=0;i<table.length;i++){
			if(max<table[i]){
				max=table[i];
				max_i=i;
			}
		}
		return backTrack(max_i);
	}
	private LinkedList<Integer> backTrack(int i){
		if(i<0 || table[i]<0)
			return new LinkedList<Integer>();
		else{
			LinkedList<Integer> ret =backTrack(i-1);
			ret.addFirst(seq[i]);
			return ret;
		}
	}
}
