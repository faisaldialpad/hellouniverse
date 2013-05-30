package trees_graphs;

public class HeapSort {
	private int[] array;
	public HeapSort(int[] array) {
		this.array=array;
	}
	public int[] sort(){
		if(array==null || array.length==0)
			return new int[]{};
		int [] ret = new int[array.length];
		Heap h= new Heap(array);
		int i=0;
		while(!h.isEmpty()){
			try {
				ret[i++]=h.removeMin();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

}
