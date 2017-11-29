package strings;

public class ReverseWordsInSentence {
	public static String reverseInPlace(String str) {
		if (str == null || str.equals("")) {
			return str;
		}
		StringBuilder sb = new StringBuilder(str);
		int start = 0;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ' ') {
				reverse(sb, start, i - 1);
				start = i + 1;
			}
		}
		reverse(sb, start, sb.length() - 1);
		return sb.toString();
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

}
