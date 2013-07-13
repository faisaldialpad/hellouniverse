package unittests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import arrays.FewestFactors;

public class FewestFactorsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testNumber() {
		assertEquals(21, FewestFactors.number(new int[]{1,2}));
		assertEquals(6, FewestFactors.number(new int[]{6, 0}));
		assertEquals(447, FewestFactors.number(new int[]{4, 7, 4}));
		assertEquals(1973, FewestFactors.number(new int[]{1, 3, 7, 9}));
		assertEquals(1973, FewestFactors.number(new int[]{1, 3, 7, 9}));
		assertEquals(241, FewestFactors.number(new int[]{1,2,4}));
	}

}
