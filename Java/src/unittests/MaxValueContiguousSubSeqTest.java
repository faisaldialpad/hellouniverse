package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import dynamic_programming.MaxValueContiguousSubSeq;

public class MaxValueContiguousSubSeqTest {
	MaxValueContiguousSubSeq mvcs;
	@Test
	public void testMaxValueContiguousSubSeq() {
		mvcs= new MaxValueContiguousSubSeq(null);
		assertNotNull(mvcs);
	}

	@Test
	public void testMVCSboundary1() {
		mvcs= new MaxValueContiguousSubSeq(null);
		assertArrayEquals(new int[]{}, mvcs.getMaxValueContiguousSubSeq());
	}
	@Test
	public void testMVCSboundary2() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{});
		assertArrayEquals(new int[]{}, mvcs.getMaxValueContiguousSubSeq());
	}
	@Test
	public void testMVCSboundary3() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{-1});
		assertArrayEquals(new int[]{}, mvcs.getMaxValueContiguousSubSeq());
	}
	@Test
	public void testMVCSboundary4() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{1});
		assertArrayEquals(new int[]{1}, mvcs.getMaxValueContiguousSubSeq());
	}
	@Test
	public void testCalculateboundary1() {
		mvcs= new MaxValueContiguousSubSeq(null);
		assertEquals(0, mvcs.calculate());
	}
	@Test
	public void testCalculateboundary2() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{});
		assertEquals(0, mvcs.calculate());
	}
	@Test
	public void testCalculateboundary3() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{-1});
		assertEquals(0, mvcs.calculate());
	}
	@Test
	public void testCalculateboundary4() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{1});
		assertEquals(1, mvcs.calculate());
	}
	@Test
	public void testMVCSnormal1() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{-2, 11, -4, 13, -5, 2});
		assertArrayEquals(new int[]{11,-4,13}, mvcs.getMaxValueContiguousSubSeq());
	}
	@Test
	public void testMVCSnormal2() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{-15, 29, -36, 3, -22, 11, 19, -5});
		assertArrayEquals(new int[]{11,19}, mvcs.getMaxValueContiguousSubSeq());
	}
	@Test
	public void testMVCSnormal3() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{-1,-15,-5,-10,-7,-8});
		assertArrayEquals(new int[]{}, mvcs.getMaxValueContiguousSubSeq());
	}
	@Test
	public void testMVCSnormal4() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{-1,-15,-5,10,-7,-8});
		assertArrayEquals(new int[]{10}, mvcs.getMaxValueContiguousSubSeq());
	}
	@Test
	public void testCalculateNormal1() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{-2, 11, -4, 13, -5, 2});
		assertEquals(20, mvcs.calculate());
	}
	@Test
	public void testCalculateNormal2() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{-15, 29, -36, 3, -22, 11, 19, -5});
		assertEquals(30, mvcs.calculate());
	}
	@Test
	public void testCalculateNormal3() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{-1,-15,-5,-10,-7,-8});
		assertEquals(0, mvcs.calculate());
	}
	@Test
	public void testCalculateNormal4() {
		mvcs= new MaxValueContiguousSubSeq(new int[]{-1,-15,-5,10,-7,-8});
		assertEquals(10, mvcs.calculate());
	}

}
