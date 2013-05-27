package strings;


import java.util.HashSet;

public class StringPermutation {
	private String s;
	public StringPermutation(String s) {
		this.s=s;
	}
	public HashSet<String> combinate(){
		if(s==null) return null;
		else if(s.length()==0) return new HashSet<String>();
		else{
			return combinateRecursive(s);
		}
	}
	private static HashSet<String> combinateRecursive(String s){
		if(s.length()==1){
			HashSet<String> r1= new HashSet<String>();
			r1.add(s);
			return r1;
		}
		HashSet<String> r= new HashSet<String>();
		for(int i=0;i<s.length();i++){
			char c= s.charAt(i);
			StringBuilder sb= new StringBuilder(s);
			sb.deleteCharAt(i);
			HashSet<String> temp=combinateRecursive(sb.toString());
			for(String t:temp){
				StringBuilder tb= new StringBuilder(t);
				tb.append(c);
				r.add(tb.toString());
			}
		}
		return r;
	}
	

}
