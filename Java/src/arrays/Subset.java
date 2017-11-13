package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class Subset {
	//leet accepted
	public static List<List<Integer>> getSubsetsIteratively(int[] nums) {
		List<List<Integer>> ret = new ArrayList<>();
		ret.add(new ArrayList<Integer>());
		
		if(nums == null || nums.length == 0) {
			return ret;
		}
		// {1} -> {}, {1}
		// {1, 2} -> {}, {1}, {2}, {1,2} (so add the new item to the previous result)
		for(int i=0;i<nums.length;i++) {
			int lastIterationLength = ret.size();
			for(int j=0;j<lastIterationLength;j++) {
				List<Integer> newSubset = new ArrayList<Integer>(ret.get(j));
				newSubset.add(nums[i]);
				ret.add(newSubset);
			}
		}
		
		return ret;
	}
	
	//leet accepted
	public static List<List<Integer>> getSubsetsBacktracking(int[] nums) {
		if(nums == null) {
			return null;
		}
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		getSubsetsBacktracking(nums, 0, new ArrayList<Integer>(), result);
		
		return result;
	}
	public static void getSubsetsBacktracking(
			int[] nums, 
			int start, 
			ArrayList<Integer> currentResult,
			List<List<Integer>> totalResult) 
	{
		totalResult.add(new ArrayList<Integer>(currentResult));
		for(int i=start;i<nums.length;i++) {
			currentResult.add(nums[i]);
			getSubsetsBacktracking(nums, i + 1, currentResult, totalResult);
			currentResult.remove(currentResult.size() -1);
		}
	}
		
	//leet accepted
	public static List<List<Integer>> getSubsetsRecursively(int[] nums) {
		if(nums == null) {
			return null;
		}
		
		return getSubsetsRecursively(nums, nums.length);
	}
	
	//same concept as iterative but implemented recursively
	private static List<List<Integer>> getSubsetsRecursively(int[] nums, int arrayLength) {
		if(arrayLength == 0) {
			List<List<Integer>> ret = new ArrayList<>();
			ret.add(new ArrayList<Integer>());
			return ret;
		}
		
		List<List<Integer>> prev = getSubsetsRecursively(nums, arrayLength - 1);
		int prevLength = prev.size();
		for(int i=0;i<prevLength;i++) {
			List<Integer> copy = new ArrayList<Integer>(prev.get(i));
			copy.add(nums[arrayLength - 1]);
			prev.add(copy);
		}
		
		return prev;
	}
	public static HashSet<ArrayList<Integer>> getSubsetsRecursivelyOldWay(ArrayList<Integer> set){
		if(set==null) return null;
		HashSet<ArrayList<Integer>> ret=new HashSet<ArrayList<Integer>>();
		ret.add( new ArrayList<Integer>(set));
		for(int i=0;i<set.size();i++){
			int temp=set.remove(i);
			ret.addAll(getSubsetsRecursivelyOldWay(set));
			set.add(i, temp);
		}
		return ret;
	}

}
