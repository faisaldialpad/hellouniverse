package arrays;



/**
 * Problem Link: http://codeforces.com/problemset/problem/6/C
 * Alice = getDivideIndex(..)+1;
 * Bob = arrayLength - Alice; 
 */
public class Codeforces6C {
	private static int getDivideIndexRec(int[] arr, int i, int j, boolean isLeft){
		if(i==j){
			if(isLeft) return i-1;
			else return i;
		}
		if(arr[i]<arr[j]){
			arr[j]-=arr[i];
			return getDivideIndexRec(arr,i+1,j,true);
		}
		else if(arr[i]>arr[j]){
			arr[i]-=arr[j];
			return getDivideIndexRec(arr,i,j-1,false);
		}
		else{
			return getDivideIndexRec(arr,i+1,j-1,false);
		}
	}
	public static int getDivideIndex(int[] arr){
		if(arr.length<1) return -1;//error
		return getDivideIndexRec(arr,0,arr.length-1,false);
	}
}
