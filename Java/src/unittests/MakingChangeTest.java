package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import dynamic_programming.MakingChange;

public class MakingChangeTest {
	MakingChange uk;
	@Test
	public void testMakingChangeNormal() throws Exception {
		uk=new MakingChange(1, new int[]{1});
		assertNotNull(uk);
	}
	@Test
	public void testMakingChangeBoundary1(){
		try {
			uk=new MakingChange(1, null);
		} catch (Exception e) {
			assertEquals("Wrong input.", e.getMessage());
		}
	}
	@Test
	public void testMakingChangeBoundary2() {
		try {
			uk=new MakingChange(1, new int[]{});
		} catch (Exception e) {
			assertEquals("Wrong input.", e.getMessage());
		}
	}
	@Test
	public void testMakingChangeBoundary3() {
		try {
			uk=new MakingChange(1, new int[]{1,2});
		} catch (Exception e) {
			assertEquals("Wrong input.", e.getMessage());
		}
	}

	@Test
	public void testCalculateBoundary() throws Exception {
		uk=new MakingChange(0, new int[]{1});
		assertEquals(0, uk.calculate());
	}

	@Test
	public void testGetItemsBoundary() throws Exception {
		uk=new MakingChange(0, new int[]{1});
		assertArrayEquals(new int[0], uk.getItems());
	}
	@Test
	public void testGetItemsNormal1() throws Exception {
		uk=new MakingChange(10, new int[]{7,2,3,4,5,10});
		assertArrayEquals(new int[]{0,0,0,0,0,1}, uk.getItems());
	}
	@Test
	public void testGetItemsNormal2() throws Exception {
		uk=new MakingChange(11, new int[]{1,2});
		assertArrayEquals(new int[]{1,5}, uk.getItems());
	}


}
