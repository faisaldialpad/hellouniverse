package unittests;

import static org.junit.Assert.*;

import math.AmountApproximation;

import org.junit.Test;

public class AmountApproximationTest {

	@Test
	public void testApproximate() {
		assertEquals(18, AmountApproximation.approximate(17, 7, 9));
		assertEquals(20, AmountApproximation.approximate(17, 7, 13));
		assertEquals(21, AmountApproximation.approximate(21, 7, 13));
		assertEquals(43, AmountApproximation.approximate(37, 9, 17));
		assertEquals(287398, AmountApproximation.approximate(287341, 2345, 7253));
	}

}
