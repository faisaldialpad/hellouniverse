package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import trees_graphs.IsSameBST;

public class IsSameBSTTest {

	@Test
	public void testCalculate() {
		assertTrue(IsSameBST.calculate(new int[]{2, 4, 1, 3}, new int[]{2, 4, 3, 1}));
		assertTrue(IsSameBST.calculate(new int[]{8, 3, 6, 1, 4, 7, 10, 14, 13}, new int[]{8, 10, 14, 3, 6, 4, 1, 7, 13}));
		assertFalse(IsSameBST.calculate(new int[]{2, 4, 1, 3}, new int[]{2, 3, 4, 1}));
	}

}
