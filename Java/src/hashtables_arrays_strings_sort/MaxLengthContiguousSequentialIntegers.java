package hashtables_arrays_strings_sort;

public class MaxLengthContiguousSequentialIntegers {
	private int[] array;
	public MaxLengthContiguousSequentialIntegers(int[] array){
		this.array=array;
	}
	public int[] calculate(){
		if(array==null || array.length<=1)
			return array;
		int curSeqLength=1;
		int maxSeqLength=1;
		int startIndex=0;
		for(int i=1;i<array.length;i++){
			if(array[i]==array[i-1]+1){
				curSeqLength++;
			}
			else{
				if(curSeqLength>maxSeqLength){
					maxSeqLength=curSeqLength;
					startIndex=i-curSeqLength;
				}
				curSeqLength=1;
			}
		}
		if(curSeqLength>maxSeqLength){
			maxSeqLength=curSeqLength;
			startIndex=array.length-curSeqLength;
		}
		int []output= new int[maxSeqLength];
		for(int i=0;i<maxSeqLength;i++)
			output[i]=array[i+startIndex];
		return output;
	}
}
