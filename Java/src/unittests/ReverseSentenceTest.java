package unittests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import strings.ReverseSentence;

public class ReverseSentenceTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		assertNotNull(new ReverseSentence(null));
	}

	@Test
	public void testPerform() {
		assertEquals("you? are how Hello,", new ReverseSentence("Hello, how are you?").perform());
		assertEquals("you? are how Hello, ", new ReverseSentence(" Hello, how are you?").perform());
		assertEquals(" you? are how Hello,", new ReverseSentence("Hello, how are you? ").perform());
	}
	@Test
	public void testPerformBoundary() {
		assertEquals("", new ReverseSentence("").perform());
		assertNull(new ReverseSentence(null).perform());
	}
	
	@Test
	public void testPerformInPlace() {
		assertEquals("you? are how Hello,", new ReverseSentence("Hello, how are you?").performInPlace());
		assertEquals("you? are how Hello, ", new ReverseSentence(" Hello, how are you?").performInPlace());
		assertEquals(" you? are how Hello,", new ReverseSentence("Hello, how are you? ").performInPlace());
	}
	@Test
	public void testPerformInPlaceBoundary() {
		assertEquals("", new ReverseSentence("").performInPlace());
		assertNull(new ReverseSentence(null).performInPlace());
	}

}
