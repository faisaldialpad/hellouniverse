package math;

public class SumOfPrimes {
	public static long calculate(int n){
		long sum=2;
		for(int i=3;i<n;i++)
			if(isPrime(i))
				sum+=i;
		return sum;
	}
	private static boolean isPrime(int p){
		for(int i=2;i<=Math.sqrt(p);i++)
			if(p%i==0) return false;
		return true;
	}
}
