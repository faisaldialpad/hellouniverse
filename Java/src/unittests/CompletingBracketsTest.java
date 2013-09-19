package unittests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import strings.CompletingBrackets;

public class CompletingBracketsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testComplete() {
		assertEquals("[[]]", CompletingBrackets.complete("[["));
		assertEquals("[][]", CompletingBrackets.complete("]["));
		assertEquals("[[[[]]]]", CompletingBrackets.complete("[[[[]]]]"));
		assertEquals("[[[[[[[[[[[[[[[[[]]]]]]]][][]][[]]][]]]]]]][]][[]][]", CompletingBrackets.complete("]]]]]]]][][]][[]]][]]]]]]][]][[]]["));
	}

}
