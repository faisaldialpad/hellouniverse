package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import trees_graphs.Trie;

public class TrieTest {
	Trie t;
	@Test
	public void testTrie() {
		t = new Trie();
		assertNotNull(t);
	}

	@Test
	public void testPutGetBoundary1() {
		t = new Trie();
		t.put(5, "");
		assertEquals(new Integer(5), t.get(""));
	}
	@Test
	public void testPutGetBoundary2() {
		t = new Trie();
		t.put(5, "a");
		assertEquals(new Integer(5), t.get("a"));
	}
	@Test
	public void testPutGetBoundary3() {
		t = new Trie();
		t.put(5, "ab");
		assertEquals(new Integer(5), t.get("ab"));
	}
	@Test
	public void testPutGetBoundary4() {
		t = new Trie();
		t.put(5, "abc");
		assertEquals(new Integer(5), t.get("abc"));
	}

	@Test
	public void testPutGetNormal() {
		t = new Trie();
		t.put(1, "abc");
		t.put(2, "def");
		t.put(3, "ghij");
		t.put(4, "");
		t.put(5, "ab");
		t.put(6, "a");
		t.put(7, "gh");
		t.put(8, "ghi");
		t.put(9, "ghip");
		t.put(10, "ghipq");
		t.put(11, "gabc");
		t.put(12, "ga");
		assertEquals(new Integer(1), t.get("abc"));
		assertEquals(new Integer(7), t.get("gh"));
		assertEquals(new Integer(11), t.get("gabc"));
		assertEquals(new Integer(12), t.get("ga"));
		assertEquals(new Integer(3), t.get("ghij"));
		assertEquals(new Integer(5), t.get("ab"));
		assertEquals(new Integer(10), t.get("ghipq"));
		assertEquals(new Integer(4), t.get(""));
		assertEquals(new Integer(8), t.get("ghi"));
		assertEquals(new Integer(6), t.get("a"));
		assertEquals(new Integer(9), t.get("ghip"));
		assertEquals(new Integer(2), t.get("def"));
		t.put(100, "gh");
		assertEquals(new Integer(100), t.get("gh"));
	}

}
