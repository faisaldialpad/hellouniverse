package trees_graphs;

public class BSTfromSortedArray {
	private int[] array;
	public BSTfromSortedArray(int[] array) {
		this.array=array;
	}
	public TNode<Integer> construct(){
		return constructRecursive(array,0,array.length-1);
	}
	private TNode<Integer> constructRecursive(int[] array, int i, int j){
		if(j<i)
			return null;
		int mid = (i+j)/2;
		TNode<Integer> root= new TNode<Integer>(array[mid]);
		root.left=constructRecursive(array,i,mid-1);
		root.right=constructRecursive(array,mid+1,j);
		return root;
	}

}
