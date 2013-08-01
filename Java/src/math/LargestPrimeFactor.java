package math;


public class LargestPrimeFactor {
	private long num;
	public LargestPrimeFactor(long num){
		this.num=num;
	}
	public long calculate(){
		for(long i=1;i<=num/2;i++)
			if(num%i==0)
				if(isPrime(num/i)) 
					return num/i;
			
		return 1;
	}
	private static boolean isPrime(long num){
		for(long i=2;i<=(long)Math.sqrt(num);i++){
			if(num%i==0) return false;
		}
		return true;
	}
}
