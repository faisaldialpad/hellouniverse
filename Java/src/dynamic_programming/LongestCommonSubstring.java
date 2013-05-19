package dynamic_programming;
/**
 * Calculate the Longest Common SubString between s1 and s2.
 * Class Contributors: Faisal Rahman
 * @author Faisal Rahman
 *
 */
public class LongestCommonSubString {
	private String s1;
	private String s2;
	/**
	 * Needed for dynamic programming algorithm.
	 */
	private int [][]table;
	private boolean emptyOrNull(String s){
		return s==null || s.equals("");
	}
	public LongestCommonSubString(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
		if(!(emptyOrNull(s1) || emptyOrNull(s2) || s1.equals(s2))) //cases we know the edit distance
			table= new int[s1.length()+1][s2.length()+1]; // a dummy 1st column and dummy 1st row
	}
	/**
	 * Calculate the LongestCommonSubString between s1 and s2 by dynamic programming.
	 * @return LongestCommonSubString length
	 */
	public int calculate(){
		if(emptyOrNull(s1) && emptyOrNull(s2)) return 0;
		else if(s1.equals(s2)) return s1.length();
		for(int i=0;i<s1.length()+1;i++){
			table[i][0]=0;
		}
		for(int j=0;j<s2.length()+1;j++){
			table[0][j]=0;
		}
		int max=0;
		for(int i=1;i<s1.length()+1;i++){
			for(int j=1;j<s2.length()+1;j++){
				if(s1.charAt(i-1)==s2.charAt(j-1)){
					table[i][j]=table[i-1][j-1]+1;
					if(table[i][j]>max) max=table[i][j];
				}
				else{
					table[i][j]=0;
				}
			}
		}
		return max;
	}
	/**
	 * A recursive function to backtrack the table.
	 * @param i current index for table rows 
	 * @param j current index for table columns 
	 * @return LCS
	 */
	private String backTrack(int i, int j){
		if(i==0 || j==0){
			return "";
		}
		else if(s1.charAt(i-1)==s2.charAt(j-1)){
			return backTrack(i-1,j-1)+s1.charAt(i-1);
		}
		else{
			return "";
		}
	}
	/**
	 * returns the LongestCommonSubString
	 */
	public String toString(){
		if(emptyOrNull(s1) && emptyOrNull(s2)) return "";
		int max=0;
		int max_i=0;
		int max_j=0;
		for(int i=1;i<s1.length()+1;i++){
			for(int j=1;j<s2.length()+1;j++){
					if(table[i][j]>max){
						max=table[i][j];
						max_i=i;
						max_j=j;
					}
			}
		}
		return backTrack(max_i, max_j);
	}
}
