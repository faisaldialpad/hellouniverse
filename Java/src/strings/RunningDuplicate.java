package strings;

public class RunningDuplicate {
	private String s;
	public RunningDuplicate(String s){
		this.s=s;
	}
	public String calculate(){
		return calculateRecursive(s,"");
	}
	private static String calculateRecursive(String s, String prefix){
		if(s.equals("")) return "";
		char c=s.charAt(0);
		prefix+=""+c+c;
		String next=calculateRecursive(s.substring(1),prefix);
		return next.equals("")?prefix:prefix+" "+next;
	}
}
