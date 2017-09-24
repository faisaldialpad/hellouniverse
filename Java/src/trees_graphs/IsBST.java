package trees_graphs;

public class IsBST {
	private TNode<Integer> root;
	public IsBST(TNode<Integer> root) {
		this.root=root;
	}
	public boolean check(){
		return checkRecursive(root,Long.MAX_VALUE,Long.MIN_VALUE);
	}
	private static boolean checkRecursive(TNode<Integer> root, long max, long min){
		if(root ==null) return true;
		return root.data<max && root.data>min && 
				checkRecursive(root.left,root.data,min) && checkRecursive(root.right,max,root.data);
	}

}
