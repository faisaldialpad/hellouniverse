package dynamic_programming;

import java.util.ArrayList;

public class UnboundedKnapsack {
	private int[] weights;
	private int[] values;
	private int capacity;
	/**
	 * Needed for backtracking.
	 */
	private int []pathWeight;
	private int []pathIndex;
	private int []table;
	private boolean isCalculated=false;
	public UnboundedKnapsack(int capacity, int[] weights, int[] values) throws Exception{
		if(isNullOrEmpty(weights) || isNullOrEmpty(values) || weights.length!=values.length)
			throw new Exception("Wrong input.");
		this.capacity=capacity;
		this.weights=weights;
		this.values=values;
		pathWeight= new int[capacity+1];
		pathIndex= new int[capacity+1];
		table= new int[capacity+1];
	}
	private boolean isNullOrEmpty(int[] arr){
		return arr==null || arr.length==0;
	}
	public int[] getItems(){
		if(capacity==0)
			return new int[0];
		if(!isCalculated) calculate();
		ArrayList<Integer> bt=backTrack(capacity);
		int []ret= new int[weights.length];
		for(int i=0;i<bt.size();i++)
			ret[bt.get(i)]++;
		return ret;
	}
	private ArrayList<Integer> backTrack(int i){
		if(pathWeight[i]<0)
			return new ArrayList<Integer>();
		else{
			ArrayList<Integer> ret=backTrack(pathWeight[i]);
			ret.add(pathIndex[i]);
			return ret;
		}
	}
	public int calculate(){
		isCalculated=true;
		if(capacity==0)
			return 0;
		table[0]=0;
		pathWeight[0]=-1;
		for(int i=1;i<=capacity;i++){
			int max=0;
			pathWeight[i]=-1;
			for(int j=0;j<weights.length;j++){
				if(weights[j]<=i && table[i-weights[j]]+values[j]>max){
					max=table[i-weights[j]]+values[j];
					pathWeight[i]=i-weights[j];
					pathIndex[i]=j;
				}
			}
			table[i]=max;
		}
		return table[capacity];
	}
}
