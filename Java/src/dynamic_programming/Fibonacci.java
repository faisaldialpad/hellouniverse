package dynamic_programming;

/**
 * Calculate the Fibonacci numbers up to n.
 * When calculated, any Fibonacci number <=n can be returned without recalculating.
 * Class Contributors: Faisal Rahman
 * @author Faisal Rahman
 *
 */
public class Fibonacci {
	private int n;
	/**
	 * Needed for dynamic programming algorithm.
	 */
	private int []table;
	public Fibonacci(int n) throws Exception {
		if(n<0)
			throw new Exception("Wrong value of n.");
		this.n=n;
		table= new int[n+1];
	}
	/**
	 * A dynamic programming implementation.
	 */
	public void calculate(){
		if(n>=0) table[0]=0;
	    if(n>=1) table[1]=1;
	    for(int j=2;j<=n;j++)
	        table[j]=table[j-1]+table[j-2];
	}
	public int get(int i) throws Exception{
		if(i>n)
			throw new Exception("Fibo up to "+i+" is not calculated.");
		else
			return table[i];
	}
}
