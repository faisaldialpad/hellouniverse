/**
 * 
 */
package unittest.linkedlists;

import static org.junit.Assert.*;
import linkedlists.LNode;
import linkedlists.LinkedListHelper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedListHelperTest {


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Before
	public void setUp() throws Exception {
	}
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void t_isCircular_null() {
		assertFalse(LinkedListHelper.isCircular(null));
	}
	@Test
	public final void t_isCircular_one_element() {
		assertFalse(LinkedListHelper.isCircular(new LNode(1)));
	}
	@Test
	public final void t_isCircular_non_circular() {
		LNode list= new LNode(1);
		list.next=new LNode(2);
		list.next.next=new LNode(3);
		list.next.next.next=new LNode(4);
		list.next.next.next.next=new LNode(5);
		assertFalse(LinkedListHelper.isCircular(list));
	}
	@Test
	public final void t_isCircular_circular() {
		LNode list= new LNode(1);
		list.next=new LNode(2);
		list.next.next=new LNode(3);
		list.next.next.next=new LNode(4);
		list.next.next.next.next=list.next;
		assertTrue(LinkedListHelper.isCircular(list));
	}

}
