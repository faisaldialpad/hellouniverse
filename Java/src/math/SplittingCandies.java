package math;

import java.util.Scanner;

public class SplittingCandies {

	public SplittingCandies() {
		// TODO Auto-generated constructor stub
	}
	public static long getStudentCandies(long N, long K){
		if(K==0) return 0; 
		return N/K;
	}
	public static long getTeacherCandies(long N, long K){
		if(K==0) return N;
		return N%K;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int t=scanner.nextInt();
		for(int i=0;i<t;i++){
			long n=scanner.nextLong();
			long k=scanner.nextLong();
			System.out.println(getStudentCandies(n,k)+" "+getTeacherCandies(n,k));
		}

	}

}
