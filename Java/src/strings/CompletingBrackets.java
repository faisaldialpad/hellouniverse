package strings;

public class CompletingBrackets {

	public CompletingBrackets() {
		// TODO Auto-generated constructor stub
	}
	public static String complete(String text){
		StringBuilder result= new StringBuilder();
		int count=0;
		for(int i=0;i<text.length();i++){
			if(text.charAt(i)=='[') count++;
			else if(text.charAt(i)==']') count--;
		}
		if(text.charAt(0)==']'){
			result.append('[');
			count++;
		}
		if(count>0){
			result.append(text);
			while(count-->0) result.append(']');
		}
		else{
			while(count++<0) result.append('[');
			result.append(text);
		}
		return result.toString();
			
	}

}
