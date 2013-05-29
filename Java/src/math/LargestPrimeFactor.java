package math;


public class LargestPrimeFactor {
	private long num;
	public LargestPrimeFactor(long num){
		this.num=num;
	}
	public long calculate(){
		long i=(long) Math.sqrt(num);
		while(i>1){
			if(num%i==0 && isPrime(i)) return i;
			i--;
		}
		return 1;
	}
	private static boolean isPrime(long num){
		for(long i=2;i<=(long)Math.sqrt(num);i++){
			if(num%i==0) return false;
		}
		return true;
	}
}
