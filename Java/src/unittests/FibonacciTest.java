package unittests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dynamic_programming.Fibonacci;

public class FibonacciTest {
	Fibonacci fibo;
	@BeforeClass
	public static void setUpBeforeClass(){
		try {
			Fibonacci t_fibo= new Fibonacci(-1);
			t_fibo.calculate();
		} catch (Exception e) {
			assertEquals("Wrong value of n.",e.getMessage());
		}
	}
	@Before
	public void setUp() throws Exception {
		fibo= new Fibonacci(10);
		fibo.calculate();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFibonacci() {
		assertNotNull(fibo);
	}

	@Test
	public void testGet() throws Exception {
		try {
			fibo.get(-1);
		} catch (Exception e) {
			assertEquals("Wrong value of i.",e.getMessage());
		}
		assertEquals(0, fibo.get(0));
		assertEquals(1, fibo.get(1));
		assertEquals(1, fibo.get(2));
		assertEquals(2, fibo.get(3));
		assertEquals(3, fibo.get(4));
		assertEquals(5, fibo.get(5));
		assertEquals(8, fibo.get(6));
		assertEquals(13, fibo.get(7));
		assertEquals(21, fibo.get(8));
		assertEquals(34, fibo.get(9));
		assertEquals(55, fibo.get(10));
		try {
			fibo.get(11);
		} catch (Exception e) {
			assertEquals("Fibo up to 11 is not calculated.",e.getMessage());
		}
	}

}
