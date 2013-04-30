package hashtables_arrays_strings_sort;
import java.util.ArrayList;
import java.util.HashSet;


public class ArraysHelper {
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
}
