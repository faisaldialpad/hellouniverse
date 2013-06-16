package arrays;
import java.util.ArrayList;
import java.util.HashSet;


public class Subset {
	public Subset() {}
	public static HashSet<ArrayList<Integer>> subset(ArrayList<Integer> set){
		if(set==null) return null;
		HashSet<ArrayList<Integer>> ret=new HashSet<ArrayList<Integer>>();
		ret.add( new ArrayList<Integer>(set));
		for(int i=0;i<set.size();i++){
			int temp=set.remove(i);
			ret.addAll(subset(set));
			set.add(i, temp);
		}
		return ret;
	}

}
