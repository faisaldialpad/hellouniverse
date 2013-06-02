package arrays;

import java.util.ArrayList;

public class QuickSort {
	private int[] arr;
	public QuickSort(int[] arr) {
		this.arr=arr;
	}
	public int[] sort(boolean inplace){
		if(inplace) return sortInPlace();
		else return sortEasy();
	}
	private int[] sortEasy(){
		if(arr==null || arr.length==0) return arr;
		ArrayList<Integer> adapter= new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
			adapter.add(arr[i]);
		adapter = sortRecursive(adapter);
		for(int i=0;i<arr.length;i++)
			arr[i]=adapter.get(i);
		return arr;
	}
	private int[] sortInPlace(){
		if(arr==null || arr.length==0) return arr;
		sortRecursiveInPlace(arr,0,arr.length-1);
		return arr;
	}
	private static ArrayList<Integer> sortRecursive(ArrayList<Integer> arr){
		if(arr.size()<=1) return arr;
		ArrayList<Integer> left= new ArrayList<Integer>();
		ArrayList<Integer> right= new ArrayList<Integer>();
		int pivot=arr.get(0);
		for(int i=1;i<arr.size();i++){
			int t=arr.get(i);
			if(t<pivot) left.add(t);
			else right.add(t);
		}
		left=sortRecursive(left);
		right=sortRecursive(right);
		left.add(pivot);
		left.addAll(right);
		return left;
	}
	private static void sortRecursiveInPlace(int[] arr, int sIndex, int eIndex){
		if(eIndex<=sIndex) return;
		int pivot=arr[eIndex];
		int i=sIndex;
		int temp;
		for(int j=sIndex;j<=eIndex-1;j++){
			if(arr[j]<pivot){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}
		temp=arr[i];
		arr[i]=arr[eIndex];
		arr[eIndex]=temp;
		sortRecursiveInPlace(arr,sIndex,i-1); 
		sortRecursiveInPlace(arr,i+1,eIndex);
	}
}
