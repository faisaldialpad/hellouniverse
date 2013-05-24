package unittests;

import static org.junit.Assert.*;
import linkedlists.LNode;
import linkedlists.LinkedListAdd;


import org.junit.Test;

public class LinkedListAddTest {
	LinkedListAdd lla;

	@Test
	public void testLinkedListAdd() {
		lla= new LinkedListAdd(null, null);
		assertNotNull(lla);
	}

	@Test
	public void testAddBoundary1() throws Exception {
		LNode<Integer> n1= null;
		LNode<Integer> n2= null;
		lla= new LinkedListAdd(n1, n2);
		assertLNodeEqual(null,lla.add());
	}
	@Test
	public void testAddBoundary2() throws Exception {
		LNode<Integer> n1= null;
		LNode<Integer> n2= new LNode<Integer>(2);
		lla= new LinkedListAdd(n1, n2);
		assertLNodeEqual(new LNode<Integer>(2),lla.add());
	}
	@Test
	public void testAddBoundary3() throws Exception {
		LNode<Integer> n2= null;
		LNode<Integer> n1= new LNode<Integer>(2);
		lla= new LinkedListAdd(n1, n2);
		assertLNodeEqual(new LNode<Integer>(2),lla.add());
	}
	@Test
	public void testAddBoundary4()  {
		LNode<Integer> n2= null;
		LNode<Integer> n1= new LNode<Integer>(10);
		lla= new LinkedListAdd(n1, n2);
		try {
			assertLNodeEqual(new LNode<Integer>(2),lla.add());
		} catch (Exception e) {
			assertEquals("Bad List.", e.getMessage());
		}
	}
	@Test
	public void testAddBoundary5()  {
		LNode<Integer> n2= null;
		LNode<Integer> n1= new LNode<Integer>(1);
		n1.next=new LNode<Integer>(10);
		lla= new LinkedListAdd(n1, n2);
		try {
			assertLNodeEqual(new LNode<Integer>(2),lla.add());
		} catch (Exception e) {
			assertEquals("Bad List.", e.getMessage());
		}
	}
	public void testAddNormal1() throws Exception  {
		LNode<Integer> n1= new LNode<Integer>(1);
		n1.next=new LNode<Integer>(2);
		n1.next.next=new LNode<Integer>(3);
		LNode<Integer> r= new LNode<Integer>(2);
		r.next=new LNode<Integer>(4);
		r.next.next=new LNode<Integer>(6);
		lla= new LinkedListAdd(n1, n1);
		assertLNodeEqual(r,lla.add());
	}
	public void testAddNormal2() throws Exception  {
		LNode<Integer> n1= new LNode<Integer>(7);
		n1.next=new LNode<Integer>(8);
		n1.next.next=new LNode<Integer>(9);
		LNode<Integer> r= new LNode<Integer>(1);
		r.next=new LNode<Integer>(9);
		r.next.next=new LNode<Integer>(4);
		r.next.next.next=new LNode<Integer>(7);
		lla= new LinkedListAdd(n1, n1);
		assertLNodeEqual(r,lla.add());
	}
	public void testAddNormal3() throws Exception  {
		LNode<Integer> n1= new LNode<Integer>(7);
		n1.next=new LNode<Integer>(8);
		n1.next.next=new LNode<Integer>(9);
		LNode<Integer> r= new LNode<Integer>(0);
		r.next=new LNode<Integer>(9);
		r.next.next=new LNode<Integer>(9);
		lla= new LinkedListAdd(n1, new LNode<Integer>(3));
		assertLNodeEqual(r,lla.add());
	}
	
	private void assertLNodeEqual(LNode<Integer> n1, LNode<Integer> n2){
		while(n1!=null && n2!=null){
			assertEquals(n1.data, n2.data);
			n1=n1.next;
			n2=n2.next;
		}
		assertNull(n1);
		assertNull(n2);
	}

}
