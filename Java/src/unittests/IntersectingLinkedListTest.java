package unittests;

import static org.junit.Assert.*;
import linkedlists.IntersectingLinkedList;
import linkedlists.LNode;

import org.junit.BeforeClass;
import org.junit.Test;

public class IntersectingLinkedListTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		assertNotNull(new IntersectingLinkedList());
	}


	@Test
	public void testDoesIntersectOneIsLonger() {
		LNode<Integer> tail= new LNode<Integer>(7);
		tail.next= new LNode<Integer>(8);
		tail.next.next= new LNode<Integer>(9);
		tail.next.next.next= new LNode<Integer>(10);
		LNode<Integer> l1= new LNode<Integer>(0);
		l1.next= new LNode<Integer>(1);
		l1.next.next= new LNode<Integer>(2);
		l1.next.next.next= new LNode<Integer>(3);
		l1.next.next.next.next= new LNode<Integer>(4);
		l1.next.next.next.next.next= new LNode<Integer>(5);
		l1.next.next.next.next.next.next= new LNode<Integer>(6);

		LNode<Integer> l2= new LNode<Integer>(100);
		l2.next= new LNode<Integer>(101);
		l2.next.next= new LNode<Integer>(102);
		l2.next.next.next= new LNode<Integer>(103);
		
		assertFalse(IntersectingLinkedList.doesIntersect(l1, l2));
		
		l1.next.next.next.next.next.next.next=tail;
		l2.next.next.next.next=tail;
		
		assertTrue(IntersectingLinkedList.doesIntersect(l1, l2));
		assertTrue(IntersectingLinkedList.doesIntersect(l2, l1));
	}
	@Test
	public void testDoesIntersectEqualLength() {
		LNode<Integer> tail= new LNode<Integer>(7);
		tail.next= new LNode<Integer>(8);
		tail.next.next= new LNode<Integer>(9);
		tail.next.next.next= new LNode<Integer>(10);
		LNode<Integer> l1= new LNode<Integer>(0);
		l1.next= new LNode<Integer>(1);
		l1.next.next= new LNode<Integer>(2);
		l1.next.next.next= new LNode<Integer>(3);

		LNode<Integer> l2= new LNode<Integer>(0);
		l2.next= new LNode<Integer>(1);
		l2.next.next= new LNode<Integer>(2);
		l2.next.next.next= new LNode<Integer>(3);
		
		assertFalse(IntersectingLinkedList.doesIntersect(l1, l2));
		
		l1.next.next.next.next=tail;
		l2.next.next.next.next=tail;
		
		assertTrue(IntersectingLinkedList.doesIntersect(l1, l2));
		assertTrue(IntersectingLinkedList.doesIntersect(l2, l1));
	}
	@Test
	public void testDoesIntersectBoundary() {
		LNode<Integer> tail= new LNode<Integer>(7);
		tail.next= new LNode<Integer>(8);
		tail.next.next= new LNode<Integer>(9);
		tail.next.next.next= new LNode<Integer>(10);
		assertFalse(IntersectingLinkedList.doesIntersect(null, null));
		assertFalse(IntersectingLinkedList.doesIntersect(null, tail));
		assertFalse(IntersectingLinkedList.doesIntersect(tail, null));
	}

	@Test
	public void testIntersectingNodeOneIsLonger() {
		LNode<Integer> tail= new LNode<Integer>(7);
		tail.next= new LNode<Integer>(8);
		tail.next.next= new LNode<Integer>(9);
		tail.next.next.next= new LNode<Integer>(10);
		LNode<Integer> l1= new LNode<Integer>(0);
		l1.next= new LNode<Integer>(1);
		l1.next.next= new LNode<Integer>(2);
		l1.next.next.next= new LNode<Integer>(3);
		l1.next.next.next.next= new LNode<Integer>(4);
		l1.next.next.next.next.next= new LNode<Integer>(5);
		l1.next.next.next.next.next.next= new LNode<Integer>(6);

		LNode<Integer> l2= new LNode<Integer>(100);
		l2.next= new LNode<Integer>(101);
		l2.next.next= new LNode<Integer>(102);
		l2.next.next.next= new LNode<Integer>(103);
		
		assertNull(IntersectingLinkedList.intersectingNode(l1, l2));
		
		l1.next.next.next.next.next.next.next=tail;
		l2.next.next.next.next=tail;
		
		assertEquals(tail,IntersectingLinkedList.intersectingNode(l1, l2));
		assertEquals(tail,IntersectingLinkedList.intersectingNode(l2, l1));
	}
	@Test
	public void testIntersectingNodeEqualLength() {
		LNode<Integer> tail= new LNode<Integer>(7);
		tail.next= new LNode<Integer>(8);
		tail.next.next= new LNode<Integer>(9);
		tail.next.next.next= new LNode<Integer>(10);
		LNode<Integer> l1= new LNode<Integer>(0);
		l1.next= new LNode<Integer>(1);
		l1.next.next= new LNode<Integer>(2);
		l1.next.next.next= new LNode<Integer>(3);

		LNode<Integer> l2= new LNode<Integer>(0);
		l2.next= new LNode<Integer>(1);
		l2.next.next= new LNode<Integer>(2);
		l2.next.next.next= new LNode<Integer>(3);
		
		assertNull(IntersectingLinkedList.intersectingNode(l1, l2));
		
		l1.next.next.next.next=tail;
		l2.next.next.next.next=tail;
		
		assertEquals(tail,IntersectingLinkedList.intersectingNode(l1, l2));
		assertEquals(tail,IntersectingLinkedList.intersectingNode(l2, l1));
	}
	@Test
	public void testIntersectingNodeBoundary() {
		LNode<Integer> tail= new LNode<Integer>(7);
		tail.next= new LNode<Integer>(8);
		tail.next.next= new LNode<Integer>(9);
		tail.next.next.next= new LNode<Integer>(10);
		assertNull(IntersectingLinkedList.intersectingNode(null, tail));
		assertNull(IntersectingLinkedList.intersectingNode(tail, null));
		assertNull(IntersectingLinkedList.intersectingNode(null, null));
	}

}
