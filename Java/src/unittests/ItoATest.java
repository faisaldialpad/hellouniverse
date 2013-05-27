package unittests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import strings.ItoA;

public class ItoATest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testItoA() {
		assertNotNull(new ItoA(0));
	}

	@Test
	public void testConvert() {
		assertEquals("0", new ItoA(0).convert());
		assertEquals("0", new ItoA(-0).convert());
		assertEquals("1", new ItoA(1).convert());
		assertEquals("-1", new ItoA(-1).convert());
		assertEquals("-1763487236", new ItoA(-1763487236).convert());
		assertEquals("1763487236", new ItoA(1763487236).convert());
	}

}
