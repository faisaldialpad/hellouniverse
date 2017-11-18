package math;

public class MultipleOf3And5 {
	private int max;
	public MultipleOf3And5(int max){
		this.max=max;
	}
	// why not use or?
	public int calculate(){
		int sum=0;
		int j=1;
		int i=15;
		while(i<max){
			sum+=i;
			i=15*++j;
		}
		j=1;
		i=3;
		while(i<max){
			if(i%15!=0)sum+=i;
			i=3*++j;
		}
		j=1;
		i=5;
		while(i<max){
			if(i%15!=0)sum+=i;
			i=5*++j;
		}
		return sum;
	}
}
