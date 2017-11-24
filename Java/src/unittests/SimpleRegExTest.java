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
	
	@Test
	public void testMatchUsingDp() {
		assertTrue(SimpleRegEx.matchUsingDp("*", ""));
		assertTrue(SimpleRegEx.matchUsingDp("*", "gfkjghdlkgjhdsg"));
		assertTrue(SimpleRegEx.matchUsingDp("*?", "ldfksjglksdjfglksdjf"));
		assertTrue(SimpleRegEx.matchUsingDp("?*k", "fsdfkgj;dfkjg;ldskk"));
		assertTrue(SimpleRegEx.matchUsingDp("a?c", "adc"));
		assertTrue(SimpleRegEx.matchUsingDp("g*ks", "geeks"));
		assertTrue(SimpleRegEx.matchUsingDp("ge?ks*", "geeksforgeeks"));
		assertTrue(SimpleRegEx.matchUsingDp("g*ks", "geeks")); // Yes
		assertTrue(SimpleRegEx.matchUsingDp("ge?ks*", "geeksforgeeks")); // Yes
		assertFalse(SimpleRegEx.matchUsingDp("g*k", "gee"));  // No because 'k' is not in second
		assertFalse(SimpleRegEx.matchUsingDp("*pqrs", "pqrst")); // No because 't' is not in first
	    assertTrue(SimpleRegEx.matchUsingDp("abc*bcd", "abcdhghgbcd")); // Yes
	    assertFalse(SimpleRegEx.matchUsingDp("abc*c?d", "abcd")); // No because second must have 2 instances of 'c'
	    assertTrue(SimpleRegEx.matchUsingDp("*c*d", "abcd")); // Yes
	    assertTrue(SimpleRegEx.matchUsingDp("*?c*d", "abcd")); // Yes
	}
	
	@Test
	public void testMatchIterate() {
		assertTrue(SimpleRegEx.matchIterate("*", ""));
		assertTrue(SimpleRegEx.matchIterate("*", "gfkjghdlkgjhdsg"));
		assertTrue(SimpleRegEx.matchIterate("*?", "ldfksjglksdjfglksdjf"));
		assertTrue(SimpleRegEx.matchIterate("?*k", "fsdfkgj;dfkjg;ldskk"));
		assertTrue(SimpleRegEx.matchIterate("a?c", "adc"));
		assertTrue(SimpleRegEx.matchIterate("g*ks", "geeks"));
		assertTrue(SimpleRegEx.matchIterate("ge?ks*", "geeksforgeeks"));
		assertTrue(SimpleRegEx.matchIterate("g*ks", "geeks")); // Yes
		assertTrue(SimpleRegEx.matchIterate("ge?ks*", "geeksforgeeks")); // Yes
		assertFalse(SimpleRegEx.matchIterate("g*k", "gee"));  // No because 'k' is not in second
		assertFalse(SimpleRegEx.matchIterate("*pqrs", "pqrst")); // No because 't' is not in first
	    assertTrue(SimpleRegEx.matchIterate("abc*bcd", "abcdhghgbcd")); // Yes
	    assertFalse(SimpleRegEx.matchIterate("abc*c?d", "abcd")); // No because second must have 2 instances of 'c'
	    assertTrue(SimpleRegEx.matchIterate("*c*d", "abcd")); // Yes
	    assertTrue(SimpleRegEx.matchIterate("*?c*d", "abcd")); // Yes
	}

}
