package arrays;

import java.util.LinkedList;
import java.util.HashSet;

public class FewestFactors {

	public FewestFactors() {
		// TODO Auto-generated constructor stub
	}
	public static int number(int[] digits){
		LinkedList<Integer> adapter= new LinkedList<Integer>();
		for(int i=digits.length-1;i>=0;i--)
			adapter.addFirst(digits[i]);
		HashSet<LinkedList<Integer>> combinitions=combinate(adapter);
		int min=Integer.MAX_VALUE;
		int min_num=0;
		for(LinkedList<Integer> c:combinitions){
			int num=convertToInteger(c);
			int factors=2;
			for(int i=2;i<=num/2;i++){
				if(num%i==0) factors++;
			}
			if(factors<min){
				min=factors;
				min_num=num;
			}
			else if(factors==min){
				if(num<min_num) min_num=num;
			}
		}
		return min_num;
	}
	private static HashSet<LinkedList<Integer>> combinate(LinkedList<Integer> input){
		  if(input.size()==1){
			  HashSet<LinkedList<Integer>> b=new HashSet<LinkedList<Integer>>();
			  b.add(input);
			  return b;
		  }
		  HashSet<LinkedList<Integer>>ret= new HashSet<LinkedList<Integer>>();
		  int len=input.size();
		  for(int i=0;i<len;i++){
			  Integer a = input.remove(i);
			  HashSet<LinkedList<Integer>>temp=combinate(new LinkedList<Integer>(input));
			  for(LinkedList<Integer> t:temp)
				  t.addFirst(a);
			  ret.addAll(temp);
			  input.add(i, a);
		  }
		  return ret;
	  }
	private static int convertToInteger(LinkedList<Integer> input){
		if(input.size()==0) return 0;
		else{
			int value=(int) Math.pow(10, input.size()-1);
			value*=input.removeFirst();
			return value+convertToInteger(input);
			
		}
	}
}
