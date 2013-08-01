package strings;

import java.util.Arrays;
import java.util.HashSet;
//import java.util.Scanner;

public class HTMLTagsDetection {

	public HTMLTagsDetection() {
		// TODO Auto-generated constructor stub
	}
	public static String toStringLexicographically(String[] htmls){
		HashSet<String> tags= new HashSet<String>();
		for(int i=0;i<htmls.length;i++){
			detect(tags, htmls[i]);
		}
		String[] sorted=new String[tags.size()];
		tags.toArray(sorted);
		Arrays.sort(sorted);
		return implodeArray(sorted,";");
	}
	private static void detect(HashSet<String> tags, String html){
		for(int i=0;i<html.length();i++){
			if(html.charAt(i)=='<'){
				i++;
				StringBuilder sb= new StringBuilder();
				while(i<html.length() && html.charAt(i)==' ') i++;
				while(i<html.length() &&  html.charAt(i)!=' ' && html.charAt(i)!='>' && html.charAt(i)!='/'){
					sb.append(html.charAt(i));
					i++;
				}
				if(sb.length()!=0)
					tags.add(sb.toString());
			}
		}
	}
	public static String implodeArray(String[] inputArray, String glueString) {

		if (inputArray.length > 0) {
			StringBuilder sb = new StringBuilder();
			sb.append(inputArray[0]);

			for (int i=1; i<inputArray.length; i++) {
				sb.append(glueString);
				sb.append(inputArray[i]);
			}

			return sb.toString();
		}
		return "";
	}
	/*public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int n=scanner.nextInt();
		String htmls= "";
		
		while(scanner.hasNext()) htmls+=" "+scanner.next();
		
		System.out.print(toStringLexicographically(new String[]{htmls}));
	}*/
	
}
