package trees_graphs;

public class IsSubTree {

	/*
	 * Check the definition from leet code.
	 */
	public static boolean isSubtree(TreeNode bigTree, TreeNode smallTree) {
		return isSubtreeRecursive(bigTree, smallTree);
	}

	private static boolean isSubtreeRecursive(TreeNode bigTree, TreeNode smallTree) {
		if (bigTree == null) {
			return false;
		}

		return equals(bigTree, smallTree) || isSubtreeRecursive(bigTree.left, smallTree)
				|| isSubtreeRecursive(bigTree.right, smallTree);
	}

	private static boolean equals(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return true;
		}
		if (t1 == null || t2 == null) {
			return false;
		}

		return t1.val == t2.val && equals(t1.left, t2.left) && equals(t1.right, t2.right);
	}

	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int x) {
			val = x;
		}
	}

}
