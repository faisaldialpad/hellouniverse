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
}
