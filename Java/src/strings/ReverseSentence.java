package strings;

import java.util.Stack;

public class ReverseSentence {
	public static String perform(String str) {
		if (str == null || str.equals(""))
			return str;
		Stack<String> st = new Stack<String>();
		int start = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				st.push(str.substring(start, i));
				start = i + 1;
			}
		}
		st.push(str.substring(start));
		StringBuilder sb = new StringBuilder();
		while (!st.isEmpty()) {
			sb.append(st.pop());
			if (!st.isEmpty())
				sb.append(' ');
		}
		return sb.toString();
	}

	/**
	 * What constitutes a word? A sequence of non-space characters constitutes a
	 * word. Could the input string contain leading or trailing spaces? Yes.
	 * However, your reversed string should not contain leading or trailing spaces.
	 * How about multiple spaces between two words? Reduce them to a single space in
	 * the reversed string.
	 * 
	 * @param str
	 * @return
	 */
	public static String performInPlace(String str) {
		if (str == null || str.equals(""))
			return str;
		StringBuilder sb = new StringBuilder(str);
		reverse(sb, 0, sb.length() - 1);
		int start = 0;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ' ') {
				reverse(sb, start, i - 1);
				while (i < sb.length() && sb.charAt(i) == ' ') {
					i++;
				}

				start = i;
			}
		}
		reverse(sb, start, sb.length() - 1);
		return toStringTrimExtraSpace(sb);
	}

	private static void reverse(StringBuilder sb, int sIndex, int eIndex) {
		while (sIndex < eIndex) {
			char t = sb.charAt(sIndex);
			sb.setCharAt(sIndex, sb.charAt(eIndex));
			sb.setCharAt(eIndex, t);
			sIndex++;
			eIndex--;
		}
	}

	private static String toStringTrimExtraSpace(StringBuilder sb) {
		int toIndex = 0;
		int fromIndex = 0;
		// remove start space
		while (fromIndex < sb.length() && sb.charAt(fromIndex) == ' ') {
			fromIndex++;
		}

		while (fromIndex < sb.length()) {
			sb.setCharAt(toIndex, sb.charAt(fromIndex));
			toIndex++;

			if (sb.charAt(fromIndex) != ' ') {
				fromIndex++;
			} else {
				while (fromIndex < sb.length() && sb.charAt(fromIndex) == ' ') {
					fromIndex++;
				}
			}
		}

		// there could only be one space in the end
		if (toIndex > 0 && sb.charAt(toIndex - 1) == ' ') {
			toIndex--;
		}

		return sb.substring(0, toIndex); // 2nd param is index but exclusive
	}

	// more clean removeExtraSpace
	/*
	 * String cleanSpaces(char[] a, int n) { int i = 0, j = 0;
	 * 
	 * while (j < n) {
	 * 
	 * while (j < n && a[j] == ' ') j++; // skip spaces
	 * 
	 * while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
	 * 
	 * while (j < n && a[j] == ' ') j++; // skip spaces
	 * 
	 * if (j < n) a[i++] = ' '; // keep only one space
	 * 
	 * }
	 * 
	 * return new String(a).substring(0, i);
	 * 
	 * }
	 */
}
