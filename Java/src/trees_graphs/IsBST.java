package trees_graphs;

public class IsBST {
	private TNode<Integer> root;
	public IsBST(TNode<Integer> root) {
		this.root=root;
	}
	public boolean check(){
		return checkRecursive(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
	}
	private static boolean checkRecursive(TNode<Integer> root, int max, int min){
		if(root ==null) return true;
		return root.data<max && root.data>min && 
				checkRecursive(root.left,root.data,min) && checkRecursive(root.right,max,root.data);
	}

}
