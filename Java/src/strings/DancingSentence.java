package strings;

public class DancingSentence {
	public static String convert(String s){
		StringBuilder sb = new StringBuilder(s);
		boolean dancingFlag=true;
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)==' ') 
				continue;
			else if(dancingFlag)
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
			else
				sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
			dancingFlag=!dancingFlag;
		}
		return sb.toString();
	}

}
