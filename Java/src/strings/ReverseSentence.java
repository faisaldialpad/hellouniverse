package strings;

import java.util.Stack;

public class ReverseSentence {
	private String str;
	public ReverseSentence(String str) {
		this.str=str;
	}
	public String perform(){
		if(str==null || str.equals(""))
			return str;
		Stack<String> st= new Stack<String>();
		int start=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == ' '){
				st.push(str.substring(start, i));
				start=i+1;
			}
		}
		st.push(str.substring(start));
		StringBuilder sb = new StringBuilder();
		while(!st.isEmpty()){
			sb.append(st.pop());
			if(!st.isEmpty())
				sb.append(' ');
		}
		return sb.toString();
	}
	public String performInPlace(){
		if(str==null || str.equals(""))
			return str;
		StringBuilder sb = new StringBuilder(str);
		reverse(sb,0,sb.length()-1);
		int start=0;
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i) == ' '){
				reverse(sb,start,i-1);
				start=i+1;
			}
		}
		reverse(sb,start,sb.length()-1);
		return sb.toString();
	}
	private static void reverse(StringBuilder sb, int sIndex, int eIndex){
		while(sIndex<eIndex){
			char t=sb.charAt(sIndex);
			sb.setCharAt(sIndex, sb.charAt(eIndex));
			sb.setCharAt(eIndex, t);
			sIndex++;
			eIndex--;
		}
	}

}
