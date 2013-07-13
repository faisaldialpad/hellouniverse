package strings;

import java.util.ArrayList;
import java.util.HashMap;

public class SimpleSpamDetector {
	
	public static boolean doesDuplicatingMatch(String s,int s_i, int s_j, String p,int p_i, int p_j){
		if(p_j-p_i>s_j-s_i) //if pattern is larger than the original string
			return false;
		else if(s_j-s_i==0 && p_j-p_i==0) //if both empty
			return true;
		else if(s_j<s_i||p_j<p_i)
			return false;
		else if(Character.toLowerCase(s.charAt(s_i)) == Character.toLowerCase(p.charAt(p_i)))
			return doesDuplicatingMatch(s,s_i+1,s_j,p,p_i+1,p_j)
							||doesDuplicatingMatch(s,s_i+1,s_j,p,p_i,p_j);
		else
			return false;
	}
	public static String getKey(String s, int i, int j){
		StringBuilder key = new StringBuilder();
		key.append(Character.toLowerCase(s.charAt(i)));
		for(int k=i+1;k<=j;k++){
			if(Character.toLowerCase(s.charAt(k)) != Character.toLowerCase(s.charAt(k-1)))
				key.append(Character.toLowerCase(s.charAt(k)));
		}
		return key.toString();
	}
	public static void insertToHash(HashMap<String, ArrayList<String>> hash, String value){
		if(value == "") return;
		String k=getKey(value,0,value.length()-1);
		if(hash.get(k)==null)
			hash.put(k, new ArrayList<String>());
		hash.get(k).add(value);
	}
	
	public static boolean check(HashMap<String, ArrayList<String>> hash, String s, int i, int j){
		String k=getKey(s,i,j);
		if(hash.get(k)==null)
			return false;
		else{
			for(String p:hash.get(k)){
				if(doesDuplicatingMatch(s,i,j,p,0,p.length()-1))
					return true;
			}
		}
		return false;
	}
	public static int countKeywords(String subjectLine, String[] keywords){
		HashMap<String, ArrayList<String>> hash= new HashMap<String, ArrayList<String>>();
		for(String p:keywords)
			insertToHash(hash,p);
		int s=0;
		int count=0;
		boolean isSpace=false;
		for(int i=0;i<subjectLine.length();i++){
			if(subjectLine.charAt(i)==' '){
				if(!isSpace){
					if(check(hash,subjectLine,s,i-1))
						count++;
				}
				isSpace=true;
			}
			else{
				if(isSpace){
					s=i;
					isSpace=false;
				}
			}
		}
		if(check(hash,subjectLine,s,subjectLine.length()-1))
			count++;
		return count;
	}
	/*//inefficient but easy to understand. 
	public static boolean doesDuplicatingMatch(String s,String p){
		if(p.length()>s.length()) //if pattern is larger than the original string
			return false;
		else if(s.length()==0 && p.length()==0) //if both empty
			return true;
		else if(s.length()==0 || p.length()==0) //if one empty
			return false;
		else if(Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(p.charAt(0)))
			return doesDuplicatingMatch(s.substring(1),p.substring(1))
							||doesDuplicatingMatch(s.substring(1),p);
		else
			return false;
	}
	public static int countKeywords(String subjectLine, String[] keywords){
		String[] words=subjectLine.split(" ");
		int count=0;
		for(String s:words){
			if(s!=""){
				for(String p:keywords){
					if(doesDuplicatingMatch(s,p)){
						count++;
						break;
					}
				}
			}
		}
		return count;
	}
	*/
}