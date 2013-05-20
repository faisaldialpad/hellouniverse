package dynamic_programming;
/**
 * Calculate the Longest Palindromic SubSequence of a string.
 * Class Contributors: Faisal Rahman
 * @author Faisal Rahman
 *
 */
public class LongestPalindromicSubSeq extends LongestCommonSubSeq {
	public LongestPalindromicSubSeq(String s) {
		super(s, reverse(s));
	}
	private static String reverse(String s){
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}
