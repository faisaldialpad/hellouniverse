package strings;

public class StringAdd {
	private String s1;
	private String s2;

	public StringAdd(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public String add() throws Exception {
		return addRecursive(s1, s2, 0);
		//return addIterative(s1, s2);
	}

	private static String addIterative(String s1, String s2) {
		if (nullOrEmpty(s1)) {
			return s2;
		}

		if (nullOrEmpty(s2)) {
			return s1;
		}

		int carry = 0;
		int index1 = s1.length() - 1;
		int index2 = s2.length() - 1;
		StringBuilder sb = new StringBuilder();
		while (index1 >= 0 && index2 >= 0) {
			int val1 = s1.charAt(index1) - '0'; // assuming no invalid char
			int val2 = s2.charAt(index2) - '0';
			int total = val1 + val2 + carry;
			sb.append(total % 10);
			carry = total / 10;
			index1--;
			index2--;
		}

		if (index2 > index1) { // s2 is bigger
			index1 = index2;
			s1 = s2;
		}

		while (index1 >= 0) {
			if (carry >= 1) {
				int val = s1.charAt(index1) - '0';
				int total = val + carry;
				sb.append(total % 10);
				carry = total / 10;
			} else {
				sb.append(s1.charAt(index1));
			}
			index1--;
		}
		
		sb.reverse();
		return sb.toString();
	}

	// add recursive overflows
	private String addRecursive(String s1, String s2, int carry) throws Exception {
		if (nullOrEmpty(s1) && nullOrEmpty(s2) && carry == 0) {
			return "";
		}
		int num1 = nullOrEmpty(s1) ? 0 : s1.charAt(s1.length() - 1) - '0';
		int num2 = nullOrEmpty(s2) ? 0 : s2.charAt(s2.length() - 1) - '0';
		if (num1 < 0 || num1 > 9 || num2 < 0 || num2 > 9)
			throw new Exception("Wrong Input.");
		int sum = num1 + num2 + carry;
		carry = sum / 10;
		sum = sum % 10;
		return addRecursive(nullOrEmpty(s1) ? "" : s1.substring(0, s1.length() - 1),
				nullOrEmpty(s2) ? "" : s2.substring(0, s2.length() - 1), carry) + sum;
	}

	private static boolean nullOrEmpty(String s) {
		return s == null || s.length() == 0;
	}
}
