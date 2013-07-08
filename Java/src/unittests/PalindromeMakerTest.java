package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import strings.PalindromeMaker;

public class PalindromeMakerTest {

	@Test
	public void testMake() throws Exception {
		assertEquals("ABBA", new PalindromeMaker().make("AABB"));
		assertEquals("ABABA", new PalindromeMaker().make("AAABB"));
		assertEquals("AABCBAA", new PalindromeMaker().make("ABACABA"));
		assertEquals("", new PalindromeMaker().make("ABCD"));
	}

}
