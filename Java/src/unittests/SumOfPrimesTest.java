package unittests;

import static org.junit.Assert.*;

import math.SumOfPrimes;

import org.junit.Test;

public class SumOfPrimesTest {

	@Test
	public void testCalculate() {
		assertEquals(17, SumOfPrimes.calculate(10));
		assertEquals(142913828922L, SumOfPrimes.calculate(2000000));
	}

}
