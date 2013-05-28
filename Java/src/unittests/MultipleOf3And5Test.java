package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import project_euler.MultipleOf3And5;

public class MultipleOf3And5Test {

	@Test
	public void testCalculate() {
		assertEquals(23, new MultipleOf3And5(10).calculate());
		assertEquals(233168,new MultipleOf3And5(1000).calculate());
	}

}
