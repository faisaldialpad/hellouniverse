package dynamic_programming;

public class MakingChange extends UnboundedKnapsack {
	public MakingChange(int money, int[] changes) throws Exception {
		super(money, changes, generateValuesforKnapSack(changes));
	}
	public static int[] generateValuesforKnapSack(int[] weights){
		if(weights==null || weights.length==0)
			return new int[0];
		int []ret= new int[weights.length];
		for(int i=0;i<weights.length;i++)
			ret[i]=-1;
		return ret;
	}
}
