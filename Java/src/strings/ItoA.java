package strings;

public class ItoA {
	private int num;
	public ItoA(int num) {
		this.num=num;
	}
	public String convert(){
		if(num==0) return "0";
		boolean isNeg= num<0;
		if(isNeg)
			num=num*(-1);
		StringBuilder sb = new StringBuilder();
		while(num>0){
			sb.append((char) (num%10 + '0'));
			num/=10;
		}
		if(isNeg) sb.append('-');
		sb.reverse();
		return sb.toString();
	}

}
