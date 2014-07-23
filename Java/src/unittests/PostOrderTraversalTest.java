package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import trees_graphs.InOrderTraversal;
import trees_graphs.PostOrderTraversal;
import trees_graphs.PreOrderTraversal;
import trees_graphs.TNode;

public class PostOrderTraversalTest {

	@Test
	public void testTraverse() {
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
		
		assertEquals(PostOrderTraversal.traverseWithRecursion(root), PostOrderTraversal.traverseWithoutRecursion(root));
	}


}
