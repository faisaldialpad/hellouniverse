package unittests;

import static org.junit.Assert.*;
import linkedlists.LNode;
import linkedlists.Last_N_Elements;

import org.junit.Test;

public class Last_N_ElementsTest {
	Last_N_Elements lne;

	@Test
	public void testLast_N_Elements() {
		lne= new Last_N_Elements(null);
		assertNotNull(lne);
	}

	@Test
	public void testCalculate() {
		LNode<Integer> node= new LNode<Integer>(1);
		node.next = new LNode<Integer>(2);
		node.next.next = new LNode<Integer>(3);
		node.next.next.next = new LNode<Integer>(4);
		node.next.next.next.next = new LNode<Integer>(5);
		node.next.next.next.next.next = new LNode<Integer>(6);
		node.next.next.next.next.next.next = new LNode<Integer>(7);
		lne= new Last_N_Elements(node);
		assertLNodeEqual(node,lne.calculate(100));
		assertLNodeEqual(new LNode<Integer>(7),lne.calculate(1));
		assertLNodeEqual(null,lne.calculate(0));
		assertLNodeEqual(node.next.next.next.next,lne.calculate(3));
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
