package dynamic_programming;
/**
 * Calculate the EditDistance between s1 and s2.
 * Class Contributors: Faisal Rahman
 * @author Faisal Rahman
 *
 */
public class EditDistance {
	/**
	 * Costs.
	 */
	private static final int c_i=1;
	private static final int c_d=1;
	private static final int c_s=1;
	private String s1;
	private String s2;
	/**
	 * Needed for dynamic programming algorithm.
	 */
	private int [][]table;
	private int getMin(int a,int b,int c){
		int min=a;
		if(min>b) min=b;
		if(min>c) min=c;
		return min;
	}
	private boolean emptyOrNull(String s){
		return s==null || s.equals("");
	}
	public EditDistance(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
		if(!(emptyOrNull(s1) || emptyOrNull(s2) || s1.equals(s2))) //cases we know the edit distance
			table= new int[s1.length()+1][s2.length()+1]; // a dummy 1st column and dummy 1st row
	}

	/**
	 * Calculate the edit distance between s1 and s2 by dynamic programming.
	 * @return edit distance
	 */
	public int calculate(){
		if(emptyOrNull(s1) && emptyOrNull(s2)) return 0;
		else if(emptyOrNull(s1)) return s2.length();
		else if(emptyOrNull(s2)) return s1.length();
		else if(s1.equals(s2)) return 0;
		
		for(int i=0;i<s1.length()+1;i++){
			table[i][0]=i;
		}
		for(int j=0;j<s2.length()+1;j++){
			table[0][j]=j;
		}
		for(int i=1;i<s1.length()+1;i++){
			for(int j=1;j<s2.length()+1;j++){
				int dis=s1.charAt(i-1)==s2.charAt(j-1)?0:c_s;
				table[i][j]=getMin(c_d+table[i-1][j], //deletion
						c_i+table[i][j-1], //insertion
						dis+table[i-1][j-1]); //substitution
			}
		}
		return table[s1.length()][s2.length()];
	}
}
