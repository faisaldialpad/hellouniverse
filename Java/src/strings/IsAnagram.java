package strings;

import java.util.HashMap;

public class IsAnagram {
	public static boolean determine(String s1, String s2){
		if(s1.length()!=s2.length()) return false;
		HashMap<Character, Integer> table= new HashMap<Character, Integer>();
		for(int i=0;i<s1.length();i++){
			char current=s1.charAt(i);
			if(table.get(current)==null){
				table.put(current, 1);
			}
			else{
				table.put(current, table.get(current)+1);
			}
			current=s2.charAt(i);
			if(table.get(current)==null){
				table.put(current, -1);
			}
			else{
				table.put(current, table.get(current)-1);
			}
		}
		for(int i=0;i<s1.length();i++){
			if(table.get(s1.charAt(i))!=0 || table.get(s2.charAt(i))!=0 ){
				return false;
			}
		}
		return true;
	}
}

