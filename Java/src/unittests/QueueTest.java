package unittests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import stacks_queues.Queue;

public class QueueTest {
	Queue<Integer> q;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		assertNotNull(new Queue<Integer>());
	}

	@Test
	public void testBoundary() {
		q= new Queue<Integer>();
		assertNull(q.remove());
		assertTrue(q.isEmpty());
		q.insert(5);
		assertFalse(q.isEmpty());
		assertEquals(5, (int)q.remove());
		assertTrue(q.isEmpty());
		assertNull(q.remove());
	}
	@Test
	public void testNormal() {
		q= new Queue<Integer>();
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.insert(6);
		q.insert(7);
		assertFalse(q.isEmpty());
		assertEquals(1, (int)q.remove());
		assertFalse(q.isEmpty());
		assertEquals(2, (int)q.remove());
		assertFalse(q.isEmpty());
		assertEquals(3, (int)q.remove());
		assertFalse(q.isEmpty());
		assertEquals(4, (int)q.remove());
		assertFalse(q.isEmpty());
		assertEquals(5, (int)q.remove());
		assertFalse(q.isEmpty());
		assertEquals(6, (int)q.remove());
		assertFalse(q.isEmpty());
		assertEquals(7, (int)q.remove());
		assertTrue(q.isEmpty());
		assertNull(q.remove());
		q.insert(10);
		q.insert(20);
		q.insert(30);
		assertFalse(q.isEmpty());
		assertEquals(10, (int)q.remove());
		q.insert(40);
		q.insert(50);
		assertFalse(q.isEmpty());
		assertEquals(20, (int)q.remove());
		assertFalse(q.isEmpty());
		assertEquals(30, (int)q.remove());
		assertFalse(q.isEmpty());
		assertEquals(40, (int)q.remove());
		assertFalse(q.isEmpty());
		assertEquals(50, (int)q.remove());
		assertTrue(q.isEmpty());
		assertNull(q.remove());
	}

}
