package dynamic_programming;
/**
 * Calculate the Longest Common SubSequence (LCS) between s1 and s2.
 * Class Contributors: Faisal Rahman
 * @author Faisal Rahman
 *
 */
public class LongestCommonSubSeq {
	private String s1;
	private String s2;
	/**
	 * Needed for dynamic programming algorithm.
	 */
	private int [][]table;
	private boolean emptyOrNull(String s){
		return s==null || s.equals("");
	}
	public LongestCommonSubSeq(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
		if(!(emptyOrNull(s1) || emptyOrNull(s2) || s1.equals(s2))) //cases we know the edit distance
			table= new int[s1.length()+1][s2.length()+1]; // a dummy 1st column and dummy 1st row
	}
	/**
	 * Calculate the LCS between s1 and s2 by dynamic programming.
	 * @return LCS length
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
	/**
	 * returns the LCS
	 */
	public String toString(){
		if(emptyOrNull(s1) && emptyOrNull(s2)) return "";
		return backTrack(s1.length(), s2.length());
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
			if(table[i][j-1]>table[i-1][j]){
				return backTrack(i,j-1);
			}
			else{
				return backTrack(i-1,j);
			}
		}
	}
}
