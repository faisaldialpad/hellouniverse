package strings;

public class KindOfSimpleRegEx {
	public KindOfSimpleRegEx(){
		
	}
	public static boolean match(String pattern, String str){
		if(pattern.length()==0&&str.length()==0)
			return true;
		if(pattern.length()==0)
			return false;
		if(str.length()==0){
			if(pattern.length()>=2 && pattern.charAt(1)=='*')
				return match(pattern.substring(2),str);
			else
				return false;
		}
		if(pattern.charAt(0)=='.' || pattern.charAt(0)==str.charAt(0)){
			if(pattern.length()>=2 && pattern.charAt(1)=='*')
				return match(pattern,str.substring(1)) || match(pattern.substring(2),str);
			else
				return match(pattern.substring(1),str.substring(1));
		}
		if(pattern.length()>=2 && pattern.charAt(1)=='*')
			return match(pattern.substring(2),str);
		return false;
	}
}
