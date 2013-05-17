package hashtables_arrays_strings_sort;

public class MaxValueContiguousSubSeq {

	public static int[] maxSequence(int[] input){
		int curSeqLength=1;
		int maxSeqLength=1;
		int startIndex=0;
		for(int i=1;i<input.length;i++){
			if(input[i]==input[i-1]+1){
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
			startIndex=input.length-curSeqLength;
		}
		int []output= new int[maxSeqLength];
		for(int i=0;i<maxSeqLength;i++)
			output[i]=input[i+startIndex];
		return output;
	}
	public static int[] getMaxValueContiguousSubSeq(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
