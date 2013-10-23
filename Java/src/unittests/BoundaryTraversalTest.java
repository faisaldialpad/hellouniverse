package unittests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import trees_graphs.BoundaryTraversal;
import trees_graphs.TNode;

public class BoundaryTraversalTest {

	@Test
	public void testPerform_boundary_1() {
		assertEquals(0, BoundaryTraversal.perform(null).size()); 
		TNode<Integer> r= new TNode<Integer>(100);
		assertEquals(1, BoundaryTraversal.perform(r).size()); 
		assertEquals(new Integer(100), BoundaryTraversal.perform(r).get(0).data); 
		r.left= new TNode<Integer>(50);
		assertEquals(2, BoundaryTraversal.perform(r).size()); 
		assertEquals(new Integer(100), BoundaryTraversal.perform(r).get(0).data); 
		assertEquals(new Integer(50), BoundaryTraversal.perform(r).get(1).data); 
		r.left= null;
		r.right= new TNode<Integer>(150);
		assertEquals(2, BoundaryTraversal.perform(r).size()); 
		assertEquals(new Integer(100), BoundaryTraversal.perform(r).get(0).data); 
		assertEquals(new Integer(150), BoundaryTraversal.perform(r).get(1).data); 
		r.left= new TNode<Integer>(50);
		assertEquals(3, BoundaryTraversal.perform(r).size()); 
		assertEquals(new Integer(100), BoundaryTraversal.perform(r).get(0).data); 
		assertEquals(new Integer(50), BoundaryTraversal.perform(r).get(1).data); 
		assertEquals(new Integer(150), BoundaryTraversal.perform(r).get(2).data); 
	}
	@Test
	public void testPerform_normal_1() {

		TNode<Integer> r= new TNode<Integer>(20);

		r.left= new TNode<Integer>(8);
		r.left.left= new TNode<Integer>(4);
		r.left.right= new TNode<Integer>(12);
		r.left.right.left= new TNode<Integer>(10);
		r.left.right.right= new TNode<Integer>(14);
		r.right= new TNode<Integer>(22);
		r.right.right= new TNode<Integer>(25);
		ArrayList<TNode<Integer>> ans=BoundaryTraversal.perform(r);
		assertEquals(new Integer(20), ans.get(0).data); 
		assertEquals(new Integer(8), ans.get(1).data); 
		assertEquals(new Integer(4), ans.get(2).data); 
		assertEquals(new Integer(10), ans.get(3).data); 
		assertEquals(new Integer(14), ans.get(4).data); 
		assertEquals(new Integer(25), ans.get(5).data); 
		assertEquals(new Integer(22), ans.get(6).data); 
		
	}

}
