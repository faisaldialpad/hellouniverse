package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import arrays.UnfriendlyNumbers;

public class UnfriendlyNumbersTest {

	@Test
	public void testCalc() {
		assertEquals(1, UnfriendlyNumbers.calc(new long[]{2, 5, 7, 4, 3, 8, 3, 18}, 16));
		assertEquals(0, UnfriendlyNumbers.calc(new long[]{2, 4, 16}, 16));
	}

}
