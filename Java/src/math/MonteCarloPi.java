package math;


public class MonteCarloPi {

	public MonteCarloPi() {
		// TODO Auto-generated constructor stub
	}
	public static double calculate(long iterations){
		long hitCount=0;
		for(int i=0;i<iterations;i++){
			if(!doesMiss()) hitCount++;
		}
		return 4.0*hitCount/iterations;
	}
	public static boolean doesMiss(){
		double x =Math.random() - 0.5;
		double y=Math.random()-0.5;
		double distance=Math.sqrt(x*x+y*y);
		if (distance<=0.5) return false;
		else return true;
	}
}
