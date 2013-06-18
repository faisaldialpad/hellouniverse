package arrays;

import java.util.ArrayList;

import java.util.HashSet;

public class ComplementPair {
	private int complementNumber;
	public ArrayList<HashSet<Integer>> result;
	private int[] hashTable;
	public ComplementPair(int complementNumber){
		this.complementNumber=complementNumber;
		result= new ArrayList<HashSet<Integer>>();
		hashTable= new int[complementNumber+1];
	}
	public void add(int n){
		if(n<0 || n>complementNumber) return;
		else if(hashTable[complementNumber-n]>0){
			hashTable[complementNumber-n]--;
			HashSet<Integer> h=new HashSet<Integer>();
			h.add(n);
			h.add(complementNumber-n);
			result.add(h);
		}
		else{
			hashTable[n]++;
		}
	}
}
