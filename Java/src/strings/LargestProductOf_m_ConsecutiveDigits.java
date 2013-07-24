package strings;

public class LargestProductOf_m_ConsecutiveDigits {
	public static int calculate(String s,int m) throws Exception{
		int max=0;
		for(int i=0;i<=s.length()-m;i++){
			int prod=getProd(s, i, m);
			if(prod>max) max=prod;
		}
		return max;
	}
	private static int getProd(String s, int i,int m) throws Exception{
		int prod=1;
		for(int j=i;j<i+m && j<=s.length()-1;j++){
			if(s.charAt(i)<'0' || s.charAt(i)>'9') throw new Exception("Faulty string");
			prod*=(int)(s.charAt(j)-'0');
		}
		return prod;
		
	}
}
