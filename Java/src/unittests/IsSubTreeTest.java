package unittests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import trees_graphs.IsSubTree;
import trees_graphs.IsSubTree.TreeNode;

public class IsSubTreeTest {
	@Test
	public void testIsSubTree() {
		TreeNode t1 = new TreeNode(3);
		t1.left = new TreeNode(4);
		t1.right = new TreeNode(5);
		t1.left.left = new TreeNode(1);
		t1.left.right = new TreeNode(2);
		TreeNode t1sub = new TreeNode(4);
		t1sub.left = new TreeNode(1);
		t1sub.right = new TreeNode(2);
		assertTrue(IsSubTree.isSubtree(t1, t1sub));
		
		t1.left.right.left = new TreeNode(0);
		assertFalse(IsSubTree.isSubtree(t1, t1sub));
	}
}
