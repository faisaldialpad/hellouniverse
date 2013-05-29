package unittests;

import static org.junit.Assert.*;

import math.MultipleOf3And5;

import org.junit.Test;


public class MultipleOf3And5Test {

	@Test
	public void testCalculate() {
		assertEquals(23, new MultipleOf3And5(10).calculate());
		assertEquals(233168,new MultipleOf3And5(1000).calculate());
	}

}
