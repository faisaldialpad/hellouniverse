package unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import trees_graphs.Heap;

public class HeapTest {
	Heap h;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		assertNotNull(new Heap(null));
	}
	@Before
	public  void setUp(){
		h= new Heap(new int[]{3,5,1,8,4,5,6,9,2,0,34,23,6,-7,6,7});
	}
	@Test
	public void testInsert() throws Exception {
		h.insert(-50);
		assertEquals(-50, h.getMin());
		h.insert(-500);
		assertEquals(-500, h.getMin());
		h.insert(-5000);
		assertEquals(-5000, h.getMin());
		h.insert(-50000);
		assertEquals(-50000, h.getMin());
	}

	@Test
	public void testGetMin() throws Exception {
		assertEquals(-7, h.getMin());
		assertEquals(-7, h.getMin());
		assertEquals(-7, h.getMin());
		assertEquals(-7, h.getMin());
		assertEquals(-7, h.getMin());
	}

	@Test
	public void testRemoveMin() throws Exception {
		assertEquals(-7, h.removeMin());
		assertEquals(0, h.removeMin());
		assertEquals(1, h.removeMin());
		assertEquals(2, h.removeMin());
		assertEquals(3, h.removeMin());
		assertEquals(4, h.removeMin());
		assertEquals(5, h.removeMin());
		assertEquals(5, h.removeMin());
		assertEquals(6, h.removeMin());
		assertEquals(6, h.removeMin());
		assertEquals(6, h.removeMin());
		assertEquals(7, h.removeMin());
		assertEquals(8, h.removeMin());
		assertEquals(9, h.removeMin());
		assertEquals(23, h.removeMin());
		assertEquals(34, h.removeMin());
	}

}
