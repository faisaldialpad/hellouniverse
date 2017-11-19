package arrays;

import trees_graphs.HeapSort;

public class SelectionAlgorithm {
	private int[] arr;
	public SelectionAlgorithm(int[] arr) {
		this.arr=arr;
	}
	public int find_inefficient(int m){
		if(m>=arr.length) return Integer.MAX_VALUE; //an error
		int []sorted=new HeapSort(arr).sort();
		return sorted[m];
	}
	public int find(int m){
		if(m>=arr.length) return Integer.MAX_VALUE; //an error
		int[] cloneArr=arr.clone(); //do not want to change the original array
		return findRecursive(cloneArr,0,cloneArr.length-1,m);
	}
	
	// this solution was good all along. It was rejected by leet code 
	// because the definition of kth largest was different. Leet code was right, 
	// kth largest means there are k-1 items larger than the expected item.
	private static int findRecursive(int[] arr,int sIndex, int eIndex,int m){
		if(sIndex==eIndex)
			return arr[sIndex];
		int pivot=arr[eIndex];
		int j=sIndex;
		int temp;
		for(int i=sIndex;i<eIndex;i++){
			if(arr[i]<pivot){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		temp=arr[j]; 
		arr[j]=arr[eIndex];
		arr[eIndex]=temp;
		if(j==m) return arr[j];
		else if(j<m) return findRecursive(arr,j+1,eIndex,m); //in the right side
		else return findRecursive(arr,sIndex,j-1,m); //in the left side
	}

}
