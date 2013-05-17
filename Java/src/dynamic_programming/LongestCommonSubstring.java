package dynamic_programming;

public class LongestCommonSubstring {

	public static String getLongestCommonSubstring(String s1, String s2){
		int[][]table = new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<s1.length()+1;i++){
			table[i][0]=0;
		}
		for(int j=0;j<s2.length()+1;j++){
			table[0][j]=0;
		}
		int max=0;
		int max_i=1;
		int max_j=1;
		for(int i=1;i<s1.length()+1;i++){
			for(int j=1;j<s2.length()+1;j++){
				if(s1.charAt(i-1)==s2.charAt(j-1)){
					table[i][j]=table[i-1][j-1]+1;
					if(table[i][j]>max){//this is for even size
						max=table[i][j];
						max_i=i;
						max_j=j;
					}
				}
				else{
					table[i][j]=0;
				}
			}
		}
		return backTrack(s1,s2,table,max_i,max_j);
		
	}
	public static String backTrack(String s1, String s2, int[][]table, int i, int j){
		if(i==0 || j==0 || table[i][j]==0){
			return "";
		}
		else if(s1.charAt(i-1)==s2.charAt(j-1)){
			return backTrack(s1,s2,table,i-1,j-1)+s1.charAt(i-1);
		}
		else{
			return "";
		}
	}
	public static void main(String[] args) {
		String s1= "abcicbbcdefgagfed"; //plendomic
		StringBuffer sb= new StringBuffer(s1);
		sb.reverse();
		String s2=sb.toString();
		System.out.println(getLongestCommonSubstring(s1,s2));
		

	}

}
