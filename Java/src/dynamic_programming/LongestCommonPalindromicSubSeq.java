package dynamic_programming;
/**
 * Calculate the Longest Common Palindromic SubSequence between s1 and s2.
 * Class Contributors: Faisal Rahman
 * @author Faisal Rahman
 *
 */
public class LongestCommonPalindromicSubSeq extends LongestCommonSubSeq {
	public LongestCommonPalindromicSubSeq(String s) {
		super(s, reverse(s));
	}
	private static String reverse(String s){
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}
