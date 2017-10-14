package trees_graphs;

public class IsBalancedTree {
	public static boolean check(TNode<Integer> root) {
		return checkRecursive(root).isBalanced;
	}
	private static BalancedHeightPair checkRecursive(TNode<Integer> root){
		if(root == null) {
			return new BalancedHeightPair(0, true);
		}
		
		BalancedHeightPair leftCheck = checkRecursive(root.left);
		if(!leftCheck.isBalanced) {
			return leftCheck;
		}
		
		BalancedHeightPair rightCheck = checkRecursive(root.right);
		if(!rightCheck.isBalanced) {
			return rightCheck;
		}
		
		return new BalancedHeightPair(
				Math.max(leftCheck.height, rightCheck.height) + 1, 
				Math.abs(leftCheck.height - rightCheck.height) <= 1);
	}	
}

class BalancedHeightPair{
	public int height;
	public boolean isBalanced;
	
	public BalancedHeightPair(int height, boolean isBalanced) {
		this.height = height;
		this.isBalanced = isBalanced;
	}
}
