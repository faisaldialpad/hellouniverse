package strings;

public class SimpleRegEx {
	// O(n+m) solution
	/*
	 *   For each element in str
	 *      If str[s]==pattern[p] or pattern[p] == ? which means this is a match, then goes to next element s++ p++.
     *      If pattern[p]=='*', this is also a match, but one or many chars may be available, so let us save this *'s position and the matched s position.
     *      If not match, then we check if there is a * previously showed up,
     *          if there is no *,  return false;
     *          if there is an *,  we set current p to the next element of *, and set current s to the next saved s position.
	 */
	public static boolean matchIterate(String pattern, String str) {
		int s = 0;
		int p = 0;
		int lastP = -1;
		int lastS = 0;
		while (s < str.length()) {
			// increment both
			if (p < pattern.length() && (pattern.charAt(p) == '?' || pattern.charAt(p) == str.charAt(s))) {
				p++;
				s++;
			} else if (p < pattern.length() && pattern.charAt(p) == '*') {
				lastP = p;
				lastS = s;
				p++;
			} else if (lastP != -1) {
				p = lastP + 1;
				lastS++;
				s = lastS;
			} else {
				return false;
			}
		}

		while (p < pattern.length() && pattern.charAt(p) == '*') {
			p++;
		}

		return p == pattern.length();
	}

	public static boolean matchUsingDp(String pattern, String str) {
		// check null
		boolean[][] table = new boolean[str.length() + 1][pattern.length() + 1];

		table[str.length()][pattern.length()] = true; // this is similar to the 1st if in the recursive
		// the 2nd if is taken care of the array initialization that defaults to false

		// this is same as the 3rd if in the recursive solution
		for (int i = pattern.length() - 1; i >= 0; i--) {
			if (pattern.charAt(i) != '*') {
				break;
			} else {
				table[str.length()][i] = true;
			}
		}

		// this is similar to the recursive definition
		for (int i = str.length() - 1; i >= 0; i--) {
			for (int j = pattern.length() - 1; j >= 0; j--) {
				if (str.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '?') {
					table[i][j] = table[i + 1][j + 1];
				} else if (pattern.charAt(j) == '*') {
					table[i][j] = table[i + 1][j] || table[i][j + 1];
				} else {
					table[i][j] = false; // not necessary
				}
			}
		}

		return table[0][0];
	}

	// leetcode time limit exceeded
	public static boolean match(String pattern, String str) {
		if (pattern.length() == 0 && str.length() == 0) {
			return true;
		}

		if (pattern.length() == 0) { // means str is not empty
			return false;
		}

		if (str.length() == 0) { // means pattern is not empty
			return pattern.charAt(0) == '*' ? match(pattern.substring(1), str) : false;
		}

		// neither pattern nor str is empty
		if (pattern.charAt(0) == '?' || pattern.charAt(0) == str.charAt(0)) {
			return match(pattern.substring(1), str.substring(1));
		}

		// We can ignore * character and move to next character in the Pattern.
		// * character matches with one or more characters in Text. Here we will move to
		// next character in the string.
		if (pattern.charAt(0) == '*') {
			return match(pattern, str.substring(1)) || match(pattern.substring(1), str);
		}

		return false;
	}
}
