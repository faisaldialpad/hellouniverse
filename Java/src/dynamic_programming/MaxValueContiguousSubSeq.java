package dynamic_programming;

import java.util.ArrayList;
/**
 * MVCS for {-1,-2,-3} is {} since an empty set adds to 0
 * @author rfaisal
 *
 */
public class MaxValueContiguousSubSeq {
	private int[] seq;
	/**
	 * Needed for dynamic programming algorithm.
	 */
	private int []table;
	private int max_i=0;
	private int max=0;
	private boolean isCalculated;
	public MaxValueContiguousSubSeq(int[] seq){
		this.seq=seq;
		isCalculated=false;
		if(seq!=null && seq.length!=0) 
			table= new int[seq.length]; 
	}
	/**
	 * Calculates the MVCS
	 * @return sum of the MVCS
	 */
	public int calculate(){
		isCalculated=true;
		if(seq==null || seq.length == 0)
			return max;
		table[0]=seq[0];
		max=Math.max(max, table[0]);
		for(int i=1;i<seq.length;i++){
			table[i]=Math.max(table[i-1]+seq[i], seq[i]);
			if(max<table[i]){
				max=table[i];
				max_i=i;
			}
		}
		return max;
	}
	public int[] getMaxValueContiguousSubSeq(){
		if(seq==null || seq.length == 0)
			return new int[0];
		if(!isCalculated) calculate();
		ArrayList<Integer> bt=backTrack(max_i,max);
		int []ret= new int[bt.size()];
		for(int i=0;i<bt.size();i++)
			ret[i]=bt.get(i);
		return ret;
	}
	private ArrayList<Integer> backTrack(int i,int sum){
		if(i<0 || sum<=0)
			return new ArrayList<Integer>();
		else{
			ArrayList<Integer> ret=backTrack(i-1,sum-seq[i]);
			ret.add(seq[i]);
			return ret;
		}
	}
}
