package dynamic_programming;

public class EditDistance {
	
	public static int getMin(int a,int b,int c){
		int min=a;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		return min;
		
	}
	public static int getEditDistance(String s1, String s2){
		int [][]table= new int[s1.length()][s2.length()];
		for(int i=0;i<s1.length();i++){
			table[i][0]=i;
		}
		for(int j=0;j<s2.length();j++){
			table[0][j]=j;
		}
		for(int i=1;i<s1.length();i++){
			for(int j=1;j<s2.length();j++){
				int dis=s1.charAt(i)==s2.charAt(j)?0:1;
				table[i][j]=getMin(1+table[i-1][j],1+table[i][j-1],dis+table[i-1][j-1]);
			}
		}
		return table[s1.length()-1][s2.length()-1];
	}
	public static void main(String[] args){
		System.out.print(getEditDistance("exponential", "polynomial"));
	}

}
