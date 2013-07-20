package unittests;

import static org.junit.Assert.*;

import math.FactorialDigitSum;

import org.junit.BeforeClass;
import org.junit.Test;

public class FactorialDigitSumTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testCalculate() {
		assertEquals(1,FactorialDigitSum.calculate(1));
		assertEquals(27,FactorialDigitSum.calculate(10));
		assertEquals(648,FactorialDigitSum.calculate(100));
	}

}
