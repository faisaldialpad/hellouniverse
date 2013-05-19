package unittests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dynamic_programming.LongestPalindromicSubSeq;

public class LongestPalindromicSubSeqTest {
	LongestPalindromicSubSeq lps;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLongestPalindromicSubSeq() {
		lps= new LongestPalindromicSubSeq("");
		assertNotNull(lps);
	}

	@Test
	public void testCalculate() {
		lps= new LongestPalindromicSubSeq("abacdfgdcaba");
		assertEquals(11, lps.calculate());
	}

	@Test
	public void testToString() {
		lps= new LongestPalindromicSubSeq("abacdfgdcaba");
		lps.calculate();
		assertEquals("abacdfdcaba", lps.toString());
	}

}
