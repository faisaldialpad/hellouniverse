package arrays;

public class MoveZerosToEnd {
	public static int[] move(int[] arr){
		int current=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0)
				arr[current++]=arr[i];
		}
		while(current<arr.length)
			arr[current++]=0;
		return arr;
	}
}
