package unittests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import strings.ReverseSentence;

public class ReverseSentenceTest {

	@Test
	public void testPerform() {
		assertEquals("you? are how Hello,", ReverseSentence.perform("Hello, how are you?"));
		assertEquals("you? are how Hello, ", ReverseSentence.perform(" Hello, how are you?"));
		assertEquals(" you? are how Hello,", ReverseSentence.perform("Hello, how are you? "));
	}

	@Test
	public void testPerformBoundary() {
		assertEquals("", ReverseSentence.perform(""));
		assertNull(ReverseSentence.perform(null));
	}

	@Test
	public void testPerformInPlace() {
		assertEquals("you? are how Hello,", ReverseSentence.performInPlace("Hello, how are you?"));
		assertEquals("you? are how Hello,", ReverseSentence.performInPlace(" Hello, how are you?"));
		assertEquals("you? are how Hello,", ReverseSentence.performInPlace("Hello, how are you? "));
		assertEquals("you? are how Hello,", ReverseSentence.performInPlace("     Hello,      how are     you?     "));
	}

	@Test
	public void testPerformInPlaceBoundary() {
		assertEquals("", ReverseSentence.performInPlace(""));
		assertEquals("", ReverseSentence.performInPlace(" "));
		assertNull(ReverseSentence.performInPlace(null));
	}

}
