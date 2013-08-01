package strings;

//import java.util.Scanner;

public class UtopianIdentificationNumber {

	public UtopianIdentificationNumber() {
		// TODO Auto-generated constructor stub
	}
	public static boolean test(String s){
		int stage=1;
		int count=0;
		for(int i=0;i<s.length();i++){
			char c= s.charAt(i);
			if(stage==1){
				if(!(c>='a' && c<='z')){
					if((i-count)>=0 && (i-count)<=3){
						count=i;
						stage=2;
					}
					else
						return false;
				}
			}
			if(stage==2){
				if(!(c>='0' && c<='9')){
					if((i-count)>=2 && (i-count)<=8){
						count=i;
						stage=3;
					}
					else
						return false;
				}
			}
			if(stage==3){
				if(!(c>='A' && c<='Z')){
						return false;
				}
			}
			
		}
		if(stage==1 || stage==2 || s.length()-count<3) return false;
		return true;
	}
	/*
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int n=scanner.nextInt();
		for(int i=0;i<n;i++){
			String s=scanner.next();
			if(test(s)) System.out.println("VALID");
			else System.out.println("INVALID");
		}
	}
	*/

}
