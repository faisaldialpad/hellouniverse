package hashtables_arrays_strings_sort;

public class StringAdd {
	private String s1;
	private String s2;
	public StringAdd(String s1, String s2){
		this.s1=s1;
		this.s2=s2;
	}
	public String add() throws Exception{
		return addRecursive(s1, s2, 0);
	}
	private String addRecursive(String s1, String s2, int carry) throws Exception{
		if(NullOrEmpty(s1) && NullOrEmpty(s2) && carry==0){
			return "";
		}
		int num1=NullOrEmpty(s1)?0:s1.charAt(s1.length()-1) - '0';
		int num2=NullOrEmpty(s2)?0:s2.charAt(s2.length()-1) - '0';
		if(num1<0 ||num1>9 ||num2<0||num2>9)
			throw new Exception("Wrong Input.");
		int sum=num1+num2+carry;
		carry=sum/10;
		sum=sum%10;
		return addRecursive(NullOrEmpty(s1)?"":s1.substring(0,s1.length()-1),NullOrEmpty(s2)?"":s2.substring(0,s2.length()-1),carry)+sum;
	}
	private boolean NullOrEmpty(String s){
		return s==null||s.length()==0;
	}
}
