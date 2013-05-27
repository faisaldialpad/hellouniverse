package unittests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import strings.ReverseWordsInSentence;

public class ReverseWordsInSentenceTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		assertNotNull(new ReverseWordsInSentence(null));
	}

	@Test
	public void testPerform() {
		assertEquals(",olleH woh era ?uoy", new ReverseWordsInSentence("Hello, how are you?").performInPlace());
		assertEquals(" ,olleH woh era ?uoy", new ReverseWordsInSentence(" Hello, how are you?").performInPlace());
		assertEquals(",olleH woh era ?uoy ", new ReverseWordsInSentence("Hello, how are you? ").performInPlace());
	}
	@Test
	public void testPerformBoundary() {
		assertEquals("", new ReverseWordsInSentence("").performInPlace());
		assertNull(new ReverseWordsInSentence(null).performInPlace());
	}
	

}
