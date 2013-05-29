package unittests;

import static org.junit.Assert.*;

import math.LargestPrimeFactor;

import org.junit.Test;

public class LargestPrimeFactorTest {

	@Test
	public void testCalculate() {
		assertEquals(29, new LargestPrimeFactor(13195).calculate());
		System.out.println(new LargestPrimeFactor(600851475143L).calculate());
	}

}
