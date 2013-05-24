/**
 * 
 */
package unittests;

import static org.junit.Assert.*;
import linkedlists.CircularList;
import linkedlists.LNode;
import org.junit.BeforeClass;
import org.junit.Test;

public class CircularListTest {
	private CircularList cl;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		assertNotNull( new CircularList(null));
	}
	
	
	@Test
	public final void t_isCircular_null() {
		cl= new CircularList(null);
		assertFalse(cl.isCircular());
	}
	@Test
	public final void t_isCircular_one_element() {
		cl= new CircularList(new LNode<Character>('1'));
		assertFalse(cl.isCircular());
	}
	@Test
	public final void t_isCircular_non_circular() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('3');
		list.next.next.next=new LNode<Character>('4');
		list.next.next.next.next=new LNode<Character>('5');
		cl= new CircularList(list);
		assertFalse(cl.isCircular());
	}
	@Test
	public final void t_isCircular_circular() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('3');
		list.next.next.next=new LNode<Character>('4');
		list.next.next.next.next=list.next;
		cl= new CircularList(list);
		assertTrue(cl.isCircular());
	}
	
	@Test
	public final void t_startOfCircle_null() {
		cl= new CircularList(null);
		assertNull(cl.startOfCircle());
	}
	@Test
	public final void t_startOfCircle_one_element() {
		cl= new CircularList(new LNode<Character>('1'));
		assertNull(cl.startOfCircle());
	}
	@Test
	public final void t_startOfCircle_non_circular() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('3');
		list.next.next.next=new LNode<Character>('4');
		list.next.next.next.next=new LNode<Character>('5');
		cl= new CircularList(list);
		assertNull(cl.startOfCircle());
	}
	@Test
	public final void t_startOfCircle_circular() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('3');
		list.next.next.next=new LNode<Character>('4');
		list.next.next.next.next=list.next;
		cl= new CircularList(list);
		assertEquals(list.next,cl.startOfCircle());
	}
	
	@Test
	public final void t_isCircularAndDuplicate_null() {
		cl= new CircularList(null);
		assertFalse(cl.isCircularAndDuplicate());
	}
	@Test
	public final void t_isCircularAndDuplicate_one_element() {
		cl= new CircularList(new LNode<Character>('1'));
		assertFalse(cl.isCircularAndDuplicate());
	}
	@Test
	public final void t_isCircularAndDuplicate_non_circular_non_duplicate() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('3');
		list.next.next.next=new LNode<Character>('4');
		list.next.next.next.next=new LNode<Character>('5');
		cl= new CircularList(list);
		assertFalse(cl.isCircularAndDuplicate());
	}
	@Test
	public final void t_isCircularAndDuplicate_circular_duplicate_case1() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('1');
		list.next.next.next=new LNode<Character>('4');
		list.next.next.next.next=list.next;
		cl= new CircularList(list);
		assertTrue(cl.isCircularAndDuplicate());
	}
	@Test
	public final void t_isCircularAndDuplicate_circular_duplicate_case2() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('4');
		list.next.next.next=new LNode<Character>('4');
		list.next.next.next.next=list.next;
		cl= new CircularList(list);
		assertTrue(cl.isCircularAndDuplicate());
	}
	@Test
	public final void t_isCircularAndDuplicate_circular_non_duplicate() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('3');
		list.next.next.next=new LNode<Character>('4');
		list.next.next.next.next=list.next;
		cl= new CircularList(list);
		assertFalse(cl.isCircularAndDuplicate());
	}
	@Test
	public final void t_isCircularAndDuplicate_non_circular_duplicate() {
		LNode<Character> list= new LNode<Character>('1');
		list.next=new LNode<Character>('2');
		list.next.next=new LNode<Character>('3');
		list.next.next.next=new LNode<Character>('1');
		list.next.next.next.next=new LNode<Character>('5');
		cl= new CircularList(list);
		assertFalse(cl.isCircularAndDuplicate());
	}

}
