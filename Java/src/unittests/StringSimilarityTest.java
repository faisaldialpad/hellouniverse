package unittests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import strings.StringSimilarity;

public class StringSimilarityTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testCalculate() {
		assertEquals(11, StringSimilarity.calculate("ababaa"));
		assertEquals(3, StringSimilarity.calculate("aa"));
	}

}
