package unittests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import trees_graphs.IsBST;
import trees_graphs.TNode;

public class IsBSTTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testIsBST() {
		assertNotNull(new IsBST(null));
	}

	@Test
	public void testCheckNormal1() {
		TNode<Integer>root = new TNode<Integer>(8);
		root.left= new TNode<Integer>(4);
		root.right= new TNode<Integer>(12);
		
		root.left.left= new TNode<Integer>(2);
		root.left.right= new TNode<Integer>(6);
		root.right.left= new TNode<Integer>(10);
		root.right.right= new TNode<Integer>(14);
		root.left.left.left= new TNode<Integer>(1);
		root.left.left.right= new TNode<Integer>(3);
		root.left.right.left= new TNode<Integer>(5);
		root.left.right.right= new TNode<Integer>(7);
		root.right.left.left= new TNode<Integer>(9);
		root.right.left.right= new TNode<Integer>(11);
		root.right.right.left= new TNode<Integer>(13);
		root.right.right.right= new TNode<Integer>(15);
		assertTrue(new IsBST(root).check());
	}
	@Test
	public void testCheckNormal2() {
		TNode<Integer>root = new TNode<Integer>(8);
		root.left= new TNode<Integer>(4);
		root.right= new TNode<Integer>(12);
		
		root.left.left= new TNode<Integer>(2);
		root.left.right= new TNode<Integer>(6);
		root.right.left= new TNode<Integer>(10);
		root.right.right= new TNode<Integer>(14);
		root.left.left.left= new TNode<Integer>(1);
		root.left.left.right= new TNode<Integer>(3);
		root.left.right.left= new TNode<Integer>(5);
		root.left.right.right= new TNode<Integer>(100);
		root.right.left.left= new TNode<Integer>(9);
		root.right.left.right= new TNode<Integer>(11);
		root.right.right.left= new TNode<Integer>(13);
		root.right.right.right= new TNode<Integer>(15);
		assertFalse(new IsBST(root).check());
		assertTrue(new IsBST(root.left).check());
	}
	@Test
	public void testCheckNormal3() {
		TNode<Integer>root = new TNode<Integer>(8);
		root.left= new TNode<Integer>(4);
		root.right= new TNode<Integer>(12);
		
		root.left.left= new TNode<Integer>(2);
		root.left.right= new TNode<Integer>(6);
		assertTrue(new IsBST(root).check());
	}
	public void testCheckBoundary1() {
		assertTrue(new IsBST(null).check());
	}
	public void testCheckBoundary2() {
		assertTrue(new IsBST(new TNode<Integer>(8)).check());
	}

}
