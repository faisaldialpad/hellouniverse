package dynamic_programming;
/**
 * Calculate the Longest Palindromic SubString of a string.
 * Class Contributors: Faisal Rahman
 * @author Faisal Rahman
 *
 */
public class LongestPalindromicSubString extends LongestCommonSubString {
	public LongestPalindromicSubString(String s) {
		super(s, reverse(s));
	}
	private static String reverse(String s){
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}
