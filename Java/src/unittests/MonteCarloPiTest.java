package unittests;



import math.MonteCarloPi;

import org.junit.BeforeClass;
import org.junit.Test;

public class MonteCarloPiTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testCalculate() {
		System.out.println(MonteCarloPi.calculate(100000000));
	}

}
