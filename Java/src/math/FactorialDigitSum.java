package math;

import java.math.BigInteger;


public class FactorialDigitSum {

	public FactorialDigitSum() {
		// TODO Auto-generated constructor stub
	}
	public static int  calculate(int n){
        return digitSum(factorial(new BigInteger(""+n))).intValue();
	}
	private static BigInteger digitSum(BigInteger  n){
        if(n.compareTo(BigInteger.TEN)==-1) 
        	return n;
        else{
            return n.mod(BigInteger.TEN).add(digitSum(n.divide(BigInteger.TEN)));
        }
	}
	private static BigInteger factorial(BigInteger n){
        if(n.equals(BigInteger.ONE)) return BigInteger.ONE;
        else return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}
}
