package unittests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;

import arrays.ComplementPair;

public class ComplementPairTest {

	@Test
	public void testAllComplementaryPairsNormal() {
		ArrayList<HashSet<Integer>> result = ComplementPair.GetAllComplementaryPairs(new int[] {2, 1, 999, 2, 2, 2, 3, 998,998,997,998,998,2}, 1000 );
		assertTrue(result.get(0).contains(1));
		assertTrue(result.get(0).contains(999));
		assertTrue(result.get(1).contains(2));
		assertTrue(result.get(1).contains(998));
		assertTrue(result.get(2).contains(2));
		assertTrue(result.get(2).contains(998));
		assertTrue(result.get(3).contains(3));
		assertTrue(result.get(3).contains(997));
		assertTrue(result.get(4).contains(2));
		assertTrue(result.get(4).contains(998));
		assertTrue(result.get(5).contains(2));
		assertTrue(result.get(5).contains(998));
	}
	
	@Test
	public void testAllComplementaryPairsEdge() {
		assertEquals(0, ComplementPair.GetAllComplementaryPairs(new int[] {}, 1000 ).size());
		assertEquals(0, ComplementPair.GetAllComplementaryPairs(null, 1000 ).size());
	}
	
	@Test
	public void testfirstComplementaryPairNormal() {
		assertArrayEquals(new int[] {1,2}, ComplementPair.GetFirstComplementaryPairIndex(new int[] {2, 1, 999, 2, 2, 2, 3, 998,998,997,998,998,2}, 1000 ));
		assertEquals(null, ComplementPair.GetFirstComplementaryPairIndex(new int[] {1, 2, 3, 4, 5, 6, 7}, 1000 ));
	}
	
	@Test
	public void testfirstComplementaryPairEdge() {
		assertEquals(null, ComplementPair.GetFirstComplementaryPairIndex(new int[] {}, 1000 ));
		assertEquals(null, ComplementPair.GetFirstComplementaryPairIndex(null, 1000 ));
	}

}
