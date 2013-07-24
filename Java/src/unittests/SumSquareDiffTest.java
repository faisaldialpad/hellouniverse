package unittests;

import static org.junit.Assert.*;

import math.SumSquareDiff;

import org.junit.Test;

public class SumSquareDiffTest {

	@Test
	public void testCalculate() {
		assertEquals(2640, SumSquareDiff.calculate(10));
		assertEquals(25164150, SumSquareDiff.calculate(100));
	}

}
