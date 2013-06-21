package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import strings.SimpleRegEx;

public class SimpleRegExTest {

	@Test
	public void testMatch() {
		assertTrue(SimpleRegEx.match("*", ""));
		assertTrue(SimpleRegEx.match("*", "gfkjghdlkgjhdsg"));
		assertTrue(SimpleRegEx.match("*?", "ldfksjglksdjfglksdjf"));
		assertTrue(SimpleRegEx.match("?*k", "fsdfkgj;dfkjg;ldskk"));
		assertTrue(SimpleRegEx.match("a?c", "adc"));
		assertTrue(SimpleRegEx.match("g*ks", "geeks"));
		assertTrue(SimpleRegEx.match("ge?ks*", "geeksforgeeks"));
		assertTrue(SimpleRegEx.match("g*ks", "geeks")); // Yes
		assertTrue(SimpleRegEx.match("ge?ks*", "geeksforgeeks")); // Yes
		assertFalse(SimpleRegEx.match("g*k", "gee"));  // No because 'k' is not in second
		assertFalse(SimpleRegEx.match("*pqrs", "pqrst")); // No because 't' is not in first
	    assertTrue(SimpleRegEx.match("abc*bcd", "abcdhghgbcd")); // Yes
	    assertFalse(SimpleRegEx.match("abc*c?d", "abcd")); // No because second must have 2 instances of 'c'
	    assertTrue(SimpleRegEx.match("*c*d", "abcd")); // Yes
	    assertTrue(SimpleRegEx.match("*?c*d", "abcd")); // Yes
	}

}
