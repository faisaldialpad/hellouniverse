package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import dynamic_programming.UnboundedKnapsack;

public class UnboundedKnapsackTest {
	UnboundedKnapsack uk;
	@Test
	public void testUnboundedKnapsackNormal() throws Exception {
		uk=new UnboundedKnapsack(1, new int[]{1},new int[]{2});
		assertNotNull(uk);
	}
	@Test
	public void testUnboundedKnapsackBoundary1(){
		try {
			uk=new UnboundedKnapsack(1, null,null);
		} catch (Exception e) {
			assertEquals("Wrong input.", e.getMessage());
		}
	}
	@Test
	public void testUnboundedKnapsackBoundary2() {
		try {
			uk=new UnboundedKnapsack(1, new int[]{},new int[]{});
		} catch (Exception e) {
			assertEquals("Wrong input.", e.getMessage());
		}
	}
	@Test
	public void testUnboundedKnapsackBoundary3() {
		try {
			uk=new UnboundedKnapsack(1, new int[]{1,2},new int[]{3});
		} catch (Exception e) {
			assertEquals("Wrong input.", e.getMessage());
		}
	}

	@Test
	public void testCalculateBoundary() throws Exception {
		uk=new UnboundedKnapsack(0, new int[]{1},new int[]{3});
		assertEquals(0, uk.calculate());
	}

	@Test
	public void testGetItemsBoundary() throws Exception {
		uk=new UnboundedKnapsack(0, new int[]{1},new int[]{3});
		assertArrayEquals(new int[0], uk.getItems());
	}
	@Test
	public void testGetItemsNormal1() throws Exception {
		uk=new UnboundedKnapsack(10, new int[]{7,2,3,4,5,10},new int[]{4,3,3,5,6,500});
		assertArrayEquals(new int[]{0,0,0,0,0,1}, uk.getItems());
	}
	@Test
	public void testCalculateNormal1() throws Exception {
		uk=new UnboundedKnapsack(10, new int[]{7,2,3,4,5,10},new int[]{4,3,3,5,6,500});
		assertEquals(500, uk.calculate());
	}
	@Test
	public void testGetItemsNormal2() throws Exception {
		uk=new UnboundedKnapsack(11, new int[]{1,2},new int[]{1,3});
		assertArrayEquals(new int[]{1,5}, uk.getItems());
	}
	@Test
	public void testCalculateNormal2() throws Exception {
		uk=new UnboundedKnapsack(11, new int[]{1,2},new int[]{1,3});
		assertEquals(16, uk.calculate());
	}

}
