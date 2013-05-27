package unittests;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import strings.PhoneKeyboardWordsList;;

public class PhoneKeyboardWordsListTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	@Test
	public void testCombinateWordsBoundary1() {
		assertTrue(new HashSet<String>().equals(new PhoneKeyboardWordsList("").getPossibilities()));
	}
	@Test
	public void testCombinateWordsBoundary2() {
		assertNull(new PhoneKeyboardWordsList(null).getPossibilities());
	}
	@Test
	public void testCombinateWordsBoundary3() {
		HashSet<String> r= new PhoneKeyboardWordsList("2").getPossibilities();
		assertTrue(r.contains("A"));
		assertTrue(r.contains("B"));
		assertTrue(r.contains("C"));
		assertEquals(3, r.size());
	}
	@Test
	public void testCombinateWordsNormal() {
		HashSet<String> r= new PhoneKeyboardWordsList("8662665").getPossibilities();
		assertTrue(r.contains("TOOCOOL"));
	}
	@Test
	public void testCombinateWordsNormal2() {
		HashSet<String> r= new PhoneKeyboardWordsList("27").getPossibilities();
		assertTrue(r.contains("AP"));
		assertTrue(r.contains("AQ"));
		assertTrue(r.contains("AR"));
		assertTrue(r.contains("AS"));
		assertTrue(r.contains("BP"));
		assertTrue(r.contains("BQ"));
		assertTrue(r.contains("BR"));
		assertTrue(r.contains("BS"));
		assertTrue(r.contains("CP"));
		assertTrue(r.contains("CQ"));
		assertTrue(r.contains("CR"));
		assertTrue(r.contains("CS"));
		assertEquals(12, r.size());
	}

}
