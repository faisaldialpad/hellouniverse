/**
 * 
 */
package unittests;

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
		assertNotNull(new LinkedListHelper());
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
		assertFalse(LinkedListHelper.isCircular(new LNode<Integer>(1)));
	}
	@Test
	public final void t_isCircular_non_circular() {
		LNode<Integer> list= new LNode<Integer>(1);
		list.next=new LNode<Integer>(2);
		list.next.next=new LNode<Integer>(3);
		list.next.next.next=new LNode<Integer>(4);
		list.next.next.next.next=new LNode<Integer>(5);
		assertFalse(LinkedListHelper.isCircular(list));
	}
	@Test
	public final void t_isCircular_circular() {
		LNode<Integer> list= new LNode<Integer>(1);
		list.next=new LNode<Integer>(2);
		list.next.next=new LNode<Integer>(3);
		list.next.next.next=new LNode<Integer>(4);
		list.next.next.next.next=list.next;
		assertTrue(LinkedListHelper.isCircular(list));
	}
	
	@Test
	public final void t_startOfCircle_null() {
		assertNull(LinkedListHelper.startOfCircle(null));
	}
	@Test
	public final void t_startOfCircle_one_element() {
		assertNull(LinkedListHelper.startOfCircle(new LNode<Integer>(1)));
	}
	@Test
	public final void t_startOfCircle_non_circular() {
		LNode<Integer> list= new LNode<Integer>(1);
		list.next=new LNode<Integer>(2);
		list.next.next=new LNode<Integer>(3);
		list.next.next.next=new LNode<Integer>(4);
		list.next.next.next.next=new LNode<Integer>(5);
		assertNull(LinkedListHelper.startOfCircle(list));
	}
	@Test
	public final void t_startOfCircle_circular() {
		LNode<Integer> list= new LNode<Integer>(1);
		list.next=new LNode<Integer>(2);
		list.next.next=new LNode<Integer>(3);
		list.next.next.next=new LNode<Integer>(4);
		list.next.next.next.next=list.next;
		assertEquals(list.next,LinkedListHelper.startOfCircle(list));
	}
	
	@Test
	public final void t_isCircularAndDuplicate_null() {
		assertFalse(LinkedListHelper.isCircularAndDuplicate(null));
	}
	@Test
	public final void t_isCircularAndDuplicate_one_element() {
		assertFalse(LinkedListHelper.isCircularAndDuplicate(new LNode<Character>('1')));
	}
	@Test
	public final void t_isCircularAndDuplicate_non_circular_non_duplicate() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('3');
		list.next.next.next=new LNode<Character>('4');
		list.next.next.next.next=new LNode<Character>('5');
		assertFalse(LinkedListHelper.isCircularAndDuplicate(list));
	}
	@Test
	public final void t_isCircularAndDuplicate_circular_duplicate_case1() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('1');
		list.next.next.next=new LNode<Character>('4');
		list.next.next.next.next=list.next;
		assertTrue(LinkedListHelper.isCircularAndDuplicate(list));
	}
	@Test
	public final void t_isCircularAndDuplicate_circular_duplicate_case2() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('4');
		list.next.next.next=new LNode<Character>('4');
		list.next.next.next.next=list.next;
		assertTrue(LinkedListHelper.isCircularAndDuplicate(list));
	}
	@Test
	public final void t_isCircularAndDuplicate_circular_non_duplicate() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('3');
		list.next.next.next=new LNode<Character>('4');
		list.next.next.next.next=list.next;
		assertFalse(LinkedListHelper.isCircularAndDuplicate(list));
	}
	@Test
	public final void t_isCircularAndDuplicate_non_circular_duplicate() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('3');
		list.next.next.next=new LNode<Character>('1');
		list.next.next.next.next=new LNode<Character>('5');
		assertFalse(LinkedListHelper.isCircularAndDuplicate(list));
	}

}
