package math;

import java.util.Scanner;

public class HelloHello {
	private class Plan{
		int activation;
		double rates;
		int planNo;
		int minsPerMonths;
		int months;
		public Plan(int planNo,int activation,double rates,int minsPerMonths,int months){
			this.planNo=planNo;
			this.activation=activation;
			this.rates=rates;
			this.minsPerMonths=minsPerMonths;
			this.months=months;
		}
		public int getMonths(){
			return months;
		}
		private double getCost(int totalMonth){
			return activation*(totalMonth/months) + minsPerMonths*totalMonth*rates;
			
		}
		public boolean isWorse(Plan p){
			return this.getCost(months*p.getMonths())>p.getCost(months*p.getMonths());
		}
	}
	
	private int minitues;
	private Plan bestPlan;
	public HelloHello(double rates, int minitues) {
		this.minitues=minitues;
		bestPlan= new Plan(0, 0, rates,minitues,1);
	}
	public void addPlan(int planNo,int activation,double rates, int months){
		Plan p= new Plan(planNo, activation, rates,minitues,months);
		if(bestPlan.isWorse(p)){
			bestPlan=p;
		}
	}
	public int getBestPlanNo(){
		return bestPlan.planNo;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int t=scanner.nextInt();
		for(int i=0;i<t;i++){
			double d=scanner.nextDouble();
			int u=scanner.nextInt();
			HelloHello hh= new HelloHello(d,u);
			int n=scanner.nextInt();
			for(int j=0;j<n;j++){
				int months=scanner.nextInt();
				double rates=scanner.nextDouble();
				int activation=scanner.nextInt();
				hh.addPlan(j+1, activation, rates, months);
			}
			System.out.println(hh.getBestPlanNo());
		}
		
	}

}
