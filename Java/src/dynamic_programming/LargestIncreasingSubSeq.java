package dynamic_programming;

import java.util.ArrayList;

public class LargestIncreasingSubSeq {
	public static void backTrack(int[] input,int []path, int i){
		if(i<0)
			return;
		else
			backTrack(input,path,path[i]);
		System.out.print(input[i]+" ");
	}
	public static int getLargestIncSubSeq(int[] input){
		int []path= new int[input.length];
		int []distance= new int[input.length];
		distance[0]=0;
		path[0]=-1;
		for(int i=1;i<input.length;i++){
			int max=0;
			path[i]=-1;
			for(int j=0;j<i;j++){
				if(input[j]<input[i]){
					if(distance[j]>max){
						max=distance[j];
						path[i]=j;
					}
				}
			}
			distance[i]=max+1;
		}
		int max=0;
		int maxPath=0;
		for(int i=0;i<distance.length;i++){
			if(max<distance[i]){
				max=distance[i];
				maxPath=i;
			}
		}
		backTrack(input,path,maxPath);
		return max;
	}
	public static void main(String[] args){
		System.out.print(getLargestIncSubSeq(new int[]{5,2,8,6,3,6,9,7}));
	}
}
