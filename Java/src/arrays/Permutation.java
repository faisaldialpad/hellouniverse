package arrays;
import java.util.ArrayList;
import java.util.HashSet;

/**
* Class owner: Faisal Rahman
* Class contributors: Faisal Rahman
**/
public class Permutation {
	private ArrayList<Integer> list;
	public Permutation(ArrayList<Integer> list){
		this.list=list;
	}
	public HashSet<ArrayList<Integer>> permuteWithoutDuplicate(){
		if(list==null || list.size()==0)
			return new HashSet<ArrayList<Integer>>();
		else
			return permuteWithoutDuplicateRecursive(list);
	}
	private static HashSet<ArrayList<Integer>> permuteWithoutDuplicateRecursive(ArrayList<Integer> input){
		  if(input.size()==1){
			  HashSet<ArrayList<Integer>> b=new HashSet<ArrayList<Integer>>();
			  b.add(input);
			  return b;
		  }
		  HashSet<ArrayList<Integer>>ret= new HashSet<ArrayList<Integer>>();
		  int len=input.size();
		  for(int i=0;i<len;i++){
			  Integer a = input.remove(i);
			  HashSet<ArrayList<Integer>>temp=permuteWithoutDuplicateRecursive(new ArrayList<Integer>(input));
			  for(ArrayList<Integer> t:temp)
				  t.add(a);
			  ret.addAll(temp);
			  input.add(i, a);
		  }
		  return ret;
	  }
	public ArrayList<ArrayList<Integer>> permuteWithDuplicate(){
		if(list==null || list.size()==0)
			return new ArrayList<ArrayList<Integer>>();
		else
			return permuteWithDuplicateRecursive(list);
	}
	private static ArrayList<ArrayList<Integer>> permuteWithDuplicateRecursive(ArrayList<Integer> input){
		  if(input.size()==1){
			  ArrayList<ArrayList<Integer>> b=new ArrayList<ArrayList<Integer>>();
			  b.add(input);
			  return b;
		  }
		  ArrayList<ArrayList<Integer>>ret= new ArrayList<ArrayList<Integer>>();
		  int len=input.size();
		  for(int i=0;i<len;i++){
			  Integer a = input.remove(i);
			  ArrayList<ArrayList<Integer>>temp=permuteWithDuplicateRecursive(new ArrayList<Integer>(input));
			  for(ArrayList<Integer> t:temp)
				  t.add(a);
			  ret.addAll(temp);
			  input.add(i, a);
		  }
		  return ret;
	  }
	
	
}
