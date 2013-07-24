package unittests;

import static org.junit.Assert.*;

import math.SpecialPythagoreanTripletProd;

import org.junit.Test;

public class SpecialPythagoreanTripletProdTest {

	@Test
	public void testCalculate() {
		assertEquals(60, SpecialPythagoreanTripletProd.calculate(12));
		assertEquals(0, SpecialPythagoreanTripletProd.calculate(10));
		assertEquals(31875000, SpecialPythagoreanTripletProd.calculate(1000));
	}

}
