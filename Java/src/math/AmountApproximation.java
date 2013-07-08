package math;

public class AmountApproximation {
	public static int approximate(int D, int p1, int p2){
		int max_p1=(int)(D/p1)+1;
		int max_p2=(int)(D/p2)+1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<=max_p1;i++){
			for(int j=0;j<=max_p2;j++){
				int sum=p1*i+p2*j;
				if(sum>=D && sum<min)
					min=sum;
			}
		}
		return min;
	}
}
