package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import trees_graphs.BTLeavesToDLL;
import trees_graphs.TNode;

public class BTLeavesToDLLTest {

	@Test
	public void testGetLeaves() {
		TNode<Integer> r= new TNode<Integer>(20);
		r.left= new TNode<Integer>(8);
		r.left.left= new TNode<Integer>(4);
		r.left.right= new TNode<Integer>(12);
		r.left.right.left= new TNode<Integer>(10);
		r.left.right.right= new TNode<Integer>(14);
		r.right= new TNode<Integer>(22);
		r.right.right= new TNode<Integer>(25);
		TNode<Integer> leaves=BTLeavesToDLL.getLeaves(r);
		assertEquals(new Integer(4), leaves.data);
		assertEquals(new Integer(10), leaves.right.data);
		assertEquals(new Integer(14), leaves.right.right.data);
		assertEquals(new Integer(25), leaves.right.right.right.data);
		assertEquals(new Integer(14), leaves.right.right.right.left.data);
		assertEquals(new Integer(10), leaves.right.right.right.left.left.data);
		assertEquals(new Integer(4), leaves.right.right.right.left.left.left.data);
	}

}
