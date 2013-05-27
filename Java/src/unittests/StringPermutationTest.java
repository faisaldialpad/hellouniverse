package unittests;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import strings.StringPermutation;

public class StringPermutationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testStringPermutation() {
		assertNotNull(new StringPermutation(null));
	}

	@Test
	public void testCombinateBoundary1() {
		assertTrue(new HashSet<String>().equals(new StringPermutation("").combinate()));
	}
	@Test
	public void testCombinateBoundary2() {
		assertNull(new StringPermutation(null).combinate());
	}
	@Test
	public void testCombinateBoundary3() {
		HashSet<String> r= new StringPermutation("a").combinate();
		assertTrue(r.contains("a"));
	}
	@Test
	public void testCombinateNormal() {
		HashSet<String> r= new StringPermutation("abc").combinate();
		assertTrue(r.contains("abc"));
		assertTrue(r.contains("acb"));
		assertTrue(r.contains("bac"));
		assertTrue(r.contains("bca"));
		assertTrue(r.contains("cab"));
		assertTrue(r.contains("cba"));
		assertEquals(6, r.size());
	}
	@Test
	public void testCombinateNormal2() {
		HashSet<String> r= new StringPermutation("abb").combinate();
		assertTrue(r.contains("abb"));
		assertTrue(r.contains("bab"));
		assertTrue(r.contains("bba"));
		assertEquals(3, r.size());
	}
}
