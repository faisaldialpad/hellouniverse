package math;

public class SumSquareDiff {
	public static long calculate(int n){
		int sum_of_sq=0;
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
			sum_of_sq+=i*i;
		}
		return sum*sum-sum_of_sq;
	}
}
