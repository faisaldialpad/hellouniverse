package arrays;

public class LittleElephantAndBooks {
	public static int getNumber(int[] pages, int number){
		int littleElephantMax=find(pages,number);//selection algorithm, O(n) worst case
		int lazyElephantMax=0;
		int sum=0;
		for(int i=0;i<pages.length;i++){ //O(n)
			if(pages[i]<=littleElephantMax){
				if(pages[i]>lazyElephantMax && pages[i]!=littleElephantMax){
					lazyElephantMax=pages[i];
				}
				sum+=pages[i];
			}
		}
		return sum-lazyElephantMax;
	}
	/**
	 * Copied from the selection algorithm
	 */
	private static int find(int[] arr, int m){
		if(m>=arr.length) return Integer.MAX_VALUE; //an error
		return findRecursive(arr,0,arr.length-1,m);
	}
	/**
	 * Copied from the selection algorithm
	 */
	private static int findRecursive(int[] arr,int sIndex, int eIndex,int m){
		if(sIndex==eIndex)
			return arr[sIndex];
		int pivot=arr[eIndex];
		int j=sIndex;
		int temp;
		for(int i=sIndex;i<=eIndex;i++){
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
