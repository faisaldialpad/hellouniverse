package project_euler;

import java.util.ArrayList;

public class EvenFibonacciSum {
	private int max;
	public EvenFibonacciSum(int max){
		this.max=max;
	}
	public int calculate(){
		ArrayList<Integer> table= new ArrayList<Integer>();
		table.add(1);
		table.add(2);
		int newValue=table.get(0)+table.get(1);
		int sum=2;
		int i=2;
		while(newValue<=max){
			if(newValue%2==0) sum+=newValue;
			table.add(i,newValue);
			i++;
			newValue=table.get(i-1)+table.get(i-2);
		}
		return sum;
	}
}
