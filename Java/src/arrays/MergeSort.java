package arrays;



public class MergeSort {
	private int[] arr;
	public MergeSort(int[] arr) {
		this.arr=arr;
	}
	public int[] sort(){
		if(arr==null || arr.length==0) return arr;
		else return mergeSort(arr);
	}
	private int[] mergeSort(int[] arr){
		if(arr.length<=1) return arr;
		int half = (int)arr.length/2;
		int []left=new int[half];
		int []right=new int[arr.length-half];
		for(int i=0;i<half;i++)
			left[i]=arr[i];
		for(int i=half;i<arr.length;i++)
			right[i-half]=arr[i];
		left=mergeSort(left);
		right=mergeSort(right);
		return merge(left,right);
	}
	private int[] merge(int[]a, int[]b){
		int[] ret= new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length){
			if(a[i]<b[j]) ret[k++]=a[i++];
			else ret[k++]=b[j++];
		}
		if(i==a.length-1){
			while(j<b.length) ret[k++]=b[j++];
		}
		else if(j==b.length-1){
			while(i<a.length) ret[k++]=a[i++];
		}
		return ret;
	}
	
}
