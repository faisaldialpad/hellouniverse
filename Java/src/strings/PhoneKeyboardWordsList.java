package strings;


import java.util.HashSet;

public class PhoneKeyboardWordsList {
	private String s;
	public PhoneKeyboardWordsList(String s) {
		this.s=s;
	}

	public HashSet<String> getPossibilities(){
		if(s==null) return null;
		else if(s.length()==0) return new HashSet<String>();
		else{
			return combinatePhoneWordsRecursive(s,s.length()-1);
		}
	}
	
	private static HashSet<String> combinatePhoneWordsRecursive(String s,int i){
		HashSet<String> r= new HashSet<String>();
		if(i==0){
			char []letters=numberToLetters(s.charAt(0));
			for(char l:letters){
				StringBuilder tb= new StringBuilder();
				tb.append(l);
				r.add(tb.toString());
			}
			return r;
		}
		else{
			char c= s.charAt(i);
			HashSet<String> temp=combinatePhoneWordsRecursive(s,i-1);
			for(String t:temp){
				char []letters=numberToLetters(c);
				for(char l:letters){
					StringBuilder tb= new StringBuilder(t);
					tb.append(l);
					r.add(tb.toString());
				}
			}
			return r;
		}
	}
	private static char[] numberToLetters(char number){
		switch(number){
			case '2':
				return new char[]{'A','B','C'};
			case '3':
				return new char[]{'D','E','F'};
			case '4':
				return new char[]{'G','H','I'};
			case '5':
				return new char[]{'J','K','L'};
			case '6':
				return new char[]{'M','N','O'};
			case '7':
				return new char[]{'P','Q','R','S'};
			case '8':
				return new char[]{'T','U','V'};
			case '9':
				return new char[]{'W','X','Y','Z'};
			default:
				return new char[]{number};
		}
	}

}
