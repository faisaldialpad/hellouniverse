package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import strings.KindOfSimpleRegEx;

public class KindOfSimpleRegExTest {

	@Test
	public void testMatch() {
		assertTrue(KindOfSimpleRegEx.match("", ""));
		assertTrue(KindOfSimpleRegEx.match(".*", "dfsgsdfgdfsgdsfdsf"));
		assertTrue(KindOfSimpleRegEx.match("a*", "aaaaaaaaaaaa"));
		assertTrue(KindOfSimpleRegEx.match("a*b", "b"));
		assertTrue(KindOfSimpleRegEx.match("a*b", "aaab"));
		assertTrue(KindOfSimpleRegEx.match("a*b", "b"));
		assertTrue(KindOfSimpleRegEx.match(".*b", "ab"));
		assertTrue(KindOfSimpleRegEx.match("abc", "abc"));
		assertTrue(KindOfSimpleRegEx.match("ab*c", "abbbbbbbc"));
		assertTrue(KindOfSimpleRegEx.match("a.*c", "accccccbbbbbc"));
		assertTrue(KindOfSimpleRegEx.match("c.*c", "cc"));
		assertTrue(KindOfSimpleRegEx.match("c.*c", "ccc"));
		assertFalse(KindOfSimpleRegEx.match("a", "ab"));
		assertFalse(KindOfSimpleRegEx.match("ab", "a"));
		assertFalse(KindOfSimpleRegEx.match("a.*", "bcdcd"));
		assertFalse(KindOfSimpleRegEx.match("a.*b", "adfgsdfgdsfgbsdfs"));
		assertFalse(KindOfSimpleRegEx.match("a.*b", "acc"));
	}

}
