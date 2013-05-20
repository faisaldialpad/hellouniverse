package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import dynamic_programming.LongestIncreasingSubSeq;


public class LongestIncreasingSubSeqTest {
	LongestIncreasingSubSeq lis;
	@Test
	public void testLongestIncreasingSubSeq() {
		lis= new LongestIncreasingSubSeq(null);
		assertNotNull(lis);
	}

	@Test
	public void testLISboundary1() {
		lis= new LongestIncreasingSubSeq(null);
		assertArrayEquals(new int[]{}, lis.getLongestIncreasingSubSeq());
	}
	@Test
	public void testLISboundary2() {
		lis= new LongestIncreasingSubSeq(new int[]{});
		assertArrayEquals(new int[]{}, lis.getLongestIncreasingSubSeq());
	}
	@Test
	public void testLISboundary3() {
		lis= new LongestIncreasingSubSeq(new int[]{-1});
		assertArrayEquals(new int[]{-1}, lis.getLongestIncreasingSubSeq());
	}
	@Test
	public void testLISboundary4() {
		lis= new LongestIncreasingSubSeq(new int[]{1});
		assertArrayEquals(new int[]{1}, lis.getLongestIncreasingSubSeq());
	}
	@Test
	public void testCalculateboundary1() {
		lis= new LongestIncreasingSubSeq(null);
		assertEquals(0, lis.calculate());
	}
	@Test
	public void testCalculateboundary2() {
		lis= new LongestIncreasingSubSeq(new int[]{});
		assertEquals(0, lis.calculate());
	}
	@Test
	public void testCalculateboundary3() {
		lis= new LongestIncreasingSubSeq(new int[]{-1});
		assertEquals(1, lis.calculate());
	}
	@Test
	public void testCalculateboundary4() {
		lis= new LongestIncreasingSubSeq(new int[]{1});
		assertEquals(1, lis.calculate());
	}
	@Test
	public void testLISnormal1() {
		lis= new LongestIncreasingSubSeq(new int[]{-2, 11, -4, 13,-3, -5, -1, 2});
		assertArrayEquals(new int[]{-4,-3,-1,2}, lis.getLongestIncreasingSubSeq());
	}
	@Test
	public void testLISnormal2() {
		lis= new LongestIncreasingSubSeq(new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 12, 7, 15});
		assertArrayEquals(new int[]{0, 4, 6, 9, 11, 12, 15}, lis.getLongestIncreasingSubSeq());
	}
	@Test
	public void testCalculateNormal1() {
		lis= new LongestIncreasingSubSeq(new int[]{-2, 11, -4, 13,-3, -5, -1, 2});
		assertEquals(4, lis.calculate());
	}
	@Test
	public void testCalculateNormal2() {
		lis= new LongestIncreasingSubSeq(new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15});
		assertEquals(6, lis.calculate());
	}
	
}
