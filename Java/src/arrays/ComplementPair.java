package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ComplementPair {
	public static ArrayList<HashSet<Integer>> GetAllComplementaryPairs(int[] nums, int target){
		ArrayList<HashSet<Integer>> result = new ArrayList<HashSet<Integer>>();
		if(nums == null || nums.length == 0) {
			return result;
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length;i++) {
			int complementKey = target - nums[i];
			if(map.containsKey(complementKey) && map.get(complementKey) >= 1) {
				map.put(complementKey, map.get(complementKey) - 1);
				result.add(MakePair(complementKey, nums[i]));
			}
			else {
				if(!map.containsKey(nums[i])) {
					map.put(nums[i], 1);
				}
				else {
					map.put(nums[i], map.get(nums[i]) + 1);
				}
			}
		}
		
		return result;
	}
	
	private static HashSet<Integer> MakePair(int num1, int num2){
		HashSet<Integer> pair=new HashSet<Integer>();
		pair.add(num1);
		pair.add(num2);
		return pair;
	}
	
	// this method is optimal as per leetcode
	public static int[] GetFirstComplementaryPairIndex(int[] nums, int target){
		if(nums == null || nums.length == 0) {
			return null;
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length;i++) {
			int complementKey = target - nums[i];
			if(map.containsKey(complementKey)) {
				return new int[] {map.get(complementKey), i};
			}
			else {
				map.put(nums[i], i); // save the index so that we can return it
			}
		}
		
		return null;
	}
	
}
 