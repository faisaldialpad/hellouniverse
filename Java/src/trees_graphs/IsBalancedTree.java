package trees_graphs;

public class IsBalancedTree {
	private TNode<Integer> root;
	public IsBalancedTree(TNode<Integer> root) {
		this.root=root;
	}
	public boolean check(){
		return (maxHeight(root)-minHeight(root))<=1;
	}
	/**
	 * Maximum height of a leaf
	 * @param root
	 * @return
	 */
	private static int maxHeight(TNode<Integer> root){
		if(root==null) return 0;
		return Math.max(maxHeight(root.left), maxHeight(root.right))+1;
	}
	private static int minHeight(TNode<Integer> root){
		if(root==null) return 0;
		return Math.min(minHeight(root.left), minHeight(root.right))+1;
	}

}
