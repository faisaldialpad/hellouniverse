package trees_graphs;

public class TreeDepth {
	public static int calculate(TNode<Integer> root) {
        if(root==null) return 0;
		return Math.max(calculate(root.left), calculate(root.right))+1;
    }
}
