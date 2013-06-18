package unittests;

import static org.junit.Assert.*;
import linkedlists.LNode;
import linkedlists.ReverseList;

import org.junit.Test;

public class ReverseListTest {

	@Test
	public void testPerform() {
		assertNull(ReverseList.perform(null));
		LNode<Integer> head=new LNode<Integer>(1);
		assertEquals(head.data, ReverseList.perform(head).data);
		head.next=new LNode<Integer>(2);
		head.next.next=new LNode<Integer>(3);
		head.next.next.next=new LNode<Integer>(4);
		LNode<Integer> reversed=ReverseList.perform(head);
		assertEquals(new Integer(1), reversed.next.next.next.data);
		assertEquals(new Integer(2), reversed.next.next.data);
		assertEquals(new Integer(3), reversed.next.data);
		assertEquals(new Integer(4), reversed.data);
		
	}

}
