package hashtables_arrays_strings_sort;
import java.util.ArrayList;
import java.util.HashSet;

/**
* Class owner: Faisal Rahman
* Class contributors: Faisal Rahman
**/
public class ArraysHelper {
	
	public ArraysHelper(){}
	public static HashSet<ArrayList<Integer>> permuteWithoutDuplicate(ArrayList<Integer> input){
		  if(input.size()==1){
			  HashSet<ArrayList<Integer>> b=new HashSet<ArrayList<Integer>>();
			  b.add(input);
			  return b;
		  }
		  HashSet<ArrayList<Integer>>ret= new HashSet<ArrayList<Integer>>();
		  int len=input.size();
		  for(int i=0;i<len;i++){
			  Integer a = input.remove(i);
			  HashSet<ArrayList<Integer>>temp=permuteWithoutDuplicate(new ArrayList<Integer>(input));
			  for(ArrayList<Integer> t:temp)
				  t.add(a);
			  ret.addAll(temp);
			  input.add(i, a);
		  }
		  return ret;
	  }
	
	public static int rotations(String s){
		if(s=="") return 1;
		int []hash= new int[256];
		int max=0;
		for(int i=0;i<s.length();i++){
			hash[s.charAt(i)]++;
		}
		max=hash[s.charAt(0)];
		for(int i=1;i<s.length();i++){
			if(max!=hash[s.charAt(i)])
				return 1;
		}
		return max;
	}
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
}
