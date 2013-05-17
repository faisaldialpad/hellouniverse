package dynamic_programming;

public class LCS {
	public static int getLCS(String s1, String s2, int[][]table){
		for(int i=0;i<s1.length()+1;i++){
			table[i][0]=0;
		}
		for(int j=0;j<s2.length()+1;j++){
			table[0][j]=0;
		}
		for(int i=1;i<s1.length()+1;i++){
			for(int j=1;j<s2.length()+1;j++){
				if(s1.charAt(i-1)==s2.charAt(j-1)){
					table[i][j]=table[i-1][j-1]+1;
				}
				else{
					table[i][j]=Math.max(table[i-1][j],table[i][j-1]);
				}
			}
		}
		return table[s1.length()][s2.length()];
	}
	public static String backTrack(String s1, String s2, int[][]table, int i, int j){
		if(i==0 || j==0){
			return "";
		}
		else if(s1.charAt(i-1)==s2.charAt(j-1)){
			return backTrack(s1,s2,table,i-1,j-1)+s1.charAt(i-1);
		}
		else{
			if(table[i][j-1]>table[i-1][j]){
				return backTrack(s1,s2,table,i,j-1);
			}
			else{
				return backTrack(s1,s2,table,i-1,j);
			}
		}
	}
	public static void main(String args[]){
		String s1= "AGCAT";
		String s2="GACT";
		int [][]table= new int[s1.length()+1][s2.length()+1];
		System.out.println(getLCS(s1,s2,table));
		System.out.println(backTrack(s1,s2,table,s1.length(),s2.length()));
	}
	
}
