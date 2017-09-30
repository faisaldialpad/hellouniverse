package unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import trees_graphs.IsBalancedTree;
import trees_graphs.TNode;

public class IsBalancedTreeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAllRight() {
		TNode<Integer> root = new TNode<Integer>(8);
		root.right = new TNode<Integer>(9);
		root.right.right = new TNode<Integer>(10);
		assertFalse(IsBalancedTree.check(root));
	}
	
	@Test
	public void testAllLeft() {
		TNode<Integer> root = new TNode<Integer>(8);
		root.left = new TNode<Integer>(9);
		root.left.left = new TNode<Integer>(10);
		assertFalse(IsBalancedTree.check(root));
	}

	@Test
	public void testCheck() {
		assertTrue(IsBalancedTree.check(null));
		assertTrue(IsBalancedTree.check(new TNode<Integer>(8)));
	}

}
