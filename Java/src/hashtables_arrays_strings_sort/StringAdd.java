package hashtables_arrays_strings_sort;

public class StringAdd {
	public static String add(String s1, String s2, int carry){
		if(s1.length()==0 || s2.length()==0){
			if(carry==0)
				return s1.length()==0?s2:s1;
			else
				return ""+carry;
		}
		int num1=s1.charAt(s1.length()-1) - '0';
		int num2=s2.charAt(s2.length()-1) - '0';
		int sum=num1+num2+carry;
		carry=sum/10;
		sum=sum%10;
		return add(s1.substring(0,s1.length()-1),s2.substring(0,s2.length()-1),carry)+sum;
	}
	public static void main(String[] args) {
		System.out.println(add("9","9",0));
	}
}
