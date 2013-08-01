package unittests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import strings.UtopianIdentificationNumber;

public class UtopianIdentificationNumberTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testTest() {
		assertFalse(UtopianIdentificationNumber.test(""));
		assertFalse(UtopianIdentificationNumber.test("a"));
		assertFalse(UtopianIdentificationNumber.test("ab"));
		assertFalse(UtopianIdentificationNumber.test("abc"));
		assertFalse(UtopianIdentificationNumber.test("abc"));
		assertTrue(UtopianIdentificationNumber.test("abc012333ABCDEEEE"));
		assertTrue(UtopianIdentificationNumber.test("abc01233389ABC"));
		assertTrue(UtopianIdentificationNumber.test("abc01ABC"));
		assertTrue(UtopianIdentificationNumber.test("01ABC"));
	}

}
