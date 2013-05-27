package unittests;

import static org.junit.Assert.*;
import linkedlists.FlattenListWithChild;
import linkedlists.LNodeWithChild;

import org.junit.BeforeClass;
import org.junit.Test;

public class FlattenListWithChildTest {
	FlattenListWithChild fl;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testFlattenListWithChild() {
		assertNotNull(new FlattenListWithChild(null));
	}

	@Test
	public void testFlattenNormal() {
		LNodeWithChild<Integer> node= new LNodeWithChild<Integer>(1);
		node.next=new LNodeWithChild<Integer>(2);
		node.next.next=new LNodeWithChild<Integer>(3);
		node.next.next.next=new LNodeWithChild<Integer>(4);
		LNodeWithChild<Integer> node1= new LNodeWithChild<Integer>(7);
		node1.next=new LNodeWithChild<Integer>(8);
		node1.next.next=new LNodeWithChild<Integer>(9);
		node1.next.next.child=new LNodeWithChild<Integer>(100);
		node.next.child=node1;
		fl= new FlattenListWithChild(node);
		LNodeWithChild<Integer> result= new LNodeWithChild<Integer>(1);
		result.next= new LNodeWithChild<Integer>(2);
		result.next.next= new LNodeWithChild<Integer>(7);
		result.next.next.next= new LNodeWithChild<Integer>(8);
		result.next.next.next.next= new LNodeWithChild<Integer>(9);
		result.next.next.next.next.next= new LNodeWithChild<Integer>(100);
		result.next.next.next.next.next.next= new LNodeWithChild<Integer>(3);
		result.next.next.next.next.next.next.next= new LNodeWithChild<Integer>(4);
		assertLNodeWithChildEquals(result,fl.flatten());
	}
	private void assertLNodeWithChildEquals(LNodeWithChild<Integer> n1, LNodeWithChild<Integer> n2){
		if(n1==null){
			assertNull(n2);
			return;
		}
		if(n2==null){
			assertNull(n1);
			return;
		}
		while(n1!=null){
			assertNotNull(n2);
			assertEquals(n1.data, n2.data);
			if(n1.child!=null){
				assertLNodeWithChildEquals(n1.child,n2.child);
			}
			n1=n1.next;
			n2=n2.next;
		}
		assertNull(n2);
	}
}
