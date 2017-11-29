package unittests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import strings.ReverseWordsInSentence;

public class ReverseWordsInSentenceTest {
	@Test
	public void testReverseInPlace() {
		assertEquals(",olleH woh era ?uoy", ReverseWordsInSentence.reverseInPlace("Hello, how are you?"));
	}
	@Test
	public void testReverseInPlaceBoundary() {
		assertEquals("", ReverseWordsInSentence.reverseInPlace(""));
		assertNull(ReverseWordsInSentence.reverseInPlace(null));
	}
}
