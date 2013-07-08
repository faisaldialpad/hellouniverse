package strings;

public class PalindromeMaker {
	public String make(String baseString) throws Exception{
		int[] hash= new int[26];
		for(int i=0;i<baseString.length();i++){
			char ch=baseString.charAt(i);
			if(ch<'A' || ch>'Z') throw new Exception("Wrong Input");
			hash[ch-'A']++;
		}
		boolean check=false;
		StringBuilder begin=new StringBuilder();
		StringBuilder end=new StringBuilder();
		for(int i=0;i<26;i++){
			if(hash[i]%2==1){
				if(check) return "";
				else check=true;
			}
			while(hash[i]>1){
				begin.append((char)(i+'A'));
				end.append((char)(i+'A'));
				hash[i]-=2;
			}
		}
		for(int i=0;i<26;i++){
			if(hash[i]==1){
				begin.append((char)(i+'A'));
				break;
			}
		}
		begin.append(end.reverse());
		return begin.toString();
	}
}
