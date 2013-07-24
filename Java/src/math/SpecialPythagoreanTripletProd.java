package math;

public class SpecialPythagoreanTripletProd {
	public static int calculate(int n){
		for(int a=2;a<n;a++){
			if((n*n-2*n*a)%(2*n-2*a)==0){
				int b=(n*n-2*n*a)/(2*n-2*a);
 				int ret= a*b*(n-a-b);
 				if(ret>0) return ret;
			}
		}
		return 0;//no Triplet
	}
}
