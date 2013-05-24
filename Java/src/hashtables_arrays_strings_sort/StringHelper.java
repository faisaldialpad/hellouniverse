package hashtables_arrays_strings_sort;
/**
* Class owner: Faisal Rahman
* Class contributors: Faisal Rahman
**/
public class StringHelper {
	public StringHelper(){}
	public static String getRunningDuplicate(String s, String prefix){
		if(s.equals("")) return "";
		char c=s.charAt(0);
		prefix+=""+c+c;
		String next=getRunningDuplicate(s.substring(1),prefix);
		return next.equals("")?prefix:prefix+" "+next;
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
}
