package unittests;

import static org.junit.Assert.*;
import hashtables_arrays_strings_sort.StringAdd;

import org.junit.BeforeClass;
import org.junit.Test;

public class StringAddTest {
	StringAdd sa;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		assertNotNull(new StringAdd(null, null));
	}

	@Test
	public void testAddBoundary1() throws Exception {
		sa = new StringAdd(null, null);
		assertEquals("",sa.add());
	}
	@Test
	public void testAddBoundary2() throws Exception {
		sa = new StringAdd("", "");
		assertEquals("",sa.add());
	}
	@Test
	public void testAddBoundary3() {
		sa = new StringAdd("988u90", "1");
		try {
			assertEquals("",sa.add());
		} catch (Exception e) {
			assertEquals("Wrong Input.", e.getMessage());
		}
	}
	@Test
	public void testAddNormal1() throws Exception {
		sa = new StringAdd("897982347612", "8768732648");
		assertEquals("906751080260",sa.add());
	}

}
