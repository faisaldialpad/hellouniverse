package dynamic_programming;

import java.util.ArrayList;

public class LongestIncreasingSubSeq {
	private int[] seq;
	/**
	 * Needed for backtracking. Since we are explicitly using this the table variable (look at other dp implementation) can be local in calculate function
	 */
	private int []path;
	private int max_i=0;
	private int max=0;
	private boolean isCalculated=false;
	public LongestIncreasingSubSeq(int[] seq){
		this.seq=seq;
		if(seq!=null && seq.length!=0){ 
			path= new int[seq.length];
		}
	}
	public static void backTrack(int[] input,int []path, int i){
		if(i<0)
			return;
		else
			backTrack(input,path,path[i]);
		System.out.print(input[i]+" ");
	}
	public int[] getLongestIncreasingSubSeq(){
		if(seq==null || seq.length == 0)
			return new int[0];
		if(!isCalculated) calculate();
		ArrayList<Integer> bt=backTrack(max_i);
		int []ret= new int[bt.size()];
		for(int i=0;i<bt.size();i++)
			ret[i]=bt.get(i);
		return ret;
	}
	private ArrayList<Integer> backTrack(int i){
		if(i<0)
			return new ArrayList<Integer>();
		else{
			ArrayList<Integer> ret=backTrack(path[i]);
			ret.add(seq[i]);
			return ret;
		}
	}
	public int calculate(){
		isCalculated=true;
		if(seq==null || seq.length == 0)
			return 0;
		int []table= new int[seq.length];
		for(int i=0;i<seq.length;i++){
			int t_max=0;
			path[i]=-1;
			for(int j=0;j<i;j++){
				if(seq[j]<seq[i] && table[j]>t_max){
					t_max=table[j];
					path[i]=j;
				}
			}
			table[i]=t_max+1;
			if(table[i]>max){
				max=table[i];
				max_i=i;
			}
		}
		return max;
	}
}
