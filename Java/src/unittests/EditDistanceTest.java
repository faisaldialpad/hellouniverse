package unittests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dynamic_programming.EditDistance;

public class EditDistanceTest {
	private EditDistance ed;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEditDistance() {
		ed= new EditDistance("Zeil", "trials");
		assertNotNull(ed);
	}

	@Test
	public void testCalculateNormal() {
		ed= new EditDistance("trials", "Zeil");
		assertEquals(4,ed.calculate());
		ed= new EditDistance("Faisal", "faisal");
		assertEquals(1,ed.calculate());
		ed= new EditDistance("bank", "banker");
		assertEquals(2,ed.calculate());
	}
	@Test
	public void testCalculateBoundary1() {
		ed= new EditDistance(null, null);
		assertEquals(0,ed.calculate());
	}
	@Test
	public void testCalculateBoundary2() {
		EditDistance ed= new EditDistance("", "");
		assertEquals(0,ed.calculate());
	}
	@Test
	public void testCalculateBoundary3() {
		EditDistance ed= new EditDistance("abcde", "");
		assertEquals(5,ed.calculate());
	}
	@Test
	public void testCalculateBoundary4() {
		EditDistance ed= new EditDistance(null, "bing");
		assertEquals(4,ed.calculate());
	}
	@Test
	public void testCalculateBoundary5() {
		EditDistance ed= new EditDistance("apolo", "apolo");
		assertEquals(0,ed.calculate());
	}
}
