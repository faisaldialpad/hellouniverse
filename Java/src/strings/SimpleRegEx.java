package strings;

public class SimpleRegEx {
	public SimpleRegEx(){
		
	}
	public static boolean match(String pattern, String str){
		if(pattern.length()==0 && str.length()==0)
			return true;
		if((pattern.length()==0 && str.length()!=0)||(str.length()==0 && pattern.charAt(0)!='*'))
			return false;
		if(str.length()==0 && pattern.charAt(0)=='*')
			return match(pattern.substring(1),str);
		if(pattern.length()!=0 && str.length()!=0 && (pattern.charAt(0)=='?' || pattern.charAt(0)==str.charAt(0)))
			return match(pattern.substring(1),str.substring(1));
		if(pattern.charAt(0)=='*')
			return match(pattern,str.substring(1)) || match(pattern.substring(1),str);
		return false;
	}
}
