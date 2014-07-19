package unittests;

import static org.junit.Assert.*;
import linkedlists.LNode;
import linkedlists.LinkedListCenter;

import org.junit.Test;

import trees_graphs.TNode;

public class LinkedListCenterTest {

	@Test
	public void testNull() {
		assertNull(LinkedListCenter.find(null));
	}
	@Test
	public void testOne() {
		LNode<Integer> list = new LNode<Integer>(5);
		assertNotNull(LinkedListCenter.find(list));
		assertEquals(list,LinkedListCenter.find(list));
	}
	@Test
	public void testTwo() {
		LNode<Integer> list = new LNode<Integer>(1);
		list.next= new LNode<Integer>(2);
		assertNotNull(LinkedListCenter.find(list));
		assertEquals((Integer)1,LinkedListCenter.find(list).data);
	}
	@Test
	public void testThree() {
		LNode<Integer> list = new LNode<Integer>(1);
		list.next= new LNode<Integer>(2);
		list.next.next= new LNode<Integer>(3);
		assertNotNull(LinkedListCenter.find(list));
		assertEquals((Integer)1,LinkedListCenter.find(list).data);
	}
	@Test
	public void testFour() {
		LNode<Integer> list = new LNode<Integer>(1);
		list.next= new LNode<Integer>(2);
		list.next.next= new LNode<Integer>(3);
		list.next.next.next= new LNode<Integer>(4);
		assertNotNull(LinkedListCenter.find(list));
		assertEquals((Integer)2,LinkedListCenter.find(list).data);
	}
	@Test
	public void testEven() {
		LNode<Integer> list = new LNode<Integer>(1);
		list.next= new LNode<Integer>(2);
		list.next.next= new LNode<Integer>(3);
		list.next.next.next= new LNode<Integer>(4);
		list.next.next.next.next= new LNode<Integer>(5);
		list.next.next.next.next.next= new LNode<Integer>(6);
		list.next.next.next.next.next.next= new LNode<Integer>(7);
		list.next.next.next.next.next.next.next= new LNode<Integer>(8);
		assertNotNull(LinkedListCenter.find(list));
		assertEquals((Integer)4,LinkedListCenter.find(list).data);
	}
	@Test
	public void testOdd() {
		LNode<Integer> list = new LNode<Integer>(1);
		list.next= new LNode<Integer>(2);
		list.next.next= new LNode<Integer>(3);
		list.next.next.next= new LNode<Integer>(4);
		list.next.next.next.next= new LNode<Integer>(5);
		list.next.next.next.next.next= new LNode<Integer>(6);
		list.next.next.next.next.next.next= new LNode<Integer>(7);
		list.next.next.next.next.next.next.next= new LNode<Integer>(8);
		list.next.next.next.next.next.next.next.next= new LNode<Integer>(9);
		assertNotNull(LinkedListCenter.find(list));
		assertEquals((Integer)5,LinkedListCenter.find(list).data);
	}
}
