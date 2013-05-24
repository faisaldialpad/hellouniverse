package unittests;

import static org.junit.Assert.*;
import hashtables_arrays_strings_sort.StringHelper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		assertNotNull(new StringHelper());
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testRunningDuplicate_normal() {
		assertEquals("HH HHee HHeell HHeellll HHeelllloo", StringHelper.getRunningDuplicate("Hello", ""));
	}
	@Test
	public final void testRunningDuplicate_boundary() {
		assertEquals("", StringHelper.getRunningDuplicate("", ""));
	}
	@Test
	public final void testrotations() {
		
		
		
		
		
		
		System.out.println(StringHelper.rotations(""));
		System.out.println(StringHelper.rotations("s"));
		System.out.println(StringHelper.rotations("sa"));
		System.out.println(StringHelper.rotations("ss"));
		System.out.println(StringHelper.rotations("ByeBye"));
		System.out.println(StringHelper.rotations("StackOverflow"));
		System.out.println(StringHelper.rotations("ssi"));
		System.out.println(StringHelper.rotations("BeyBye"));
	//	System.out.println(Arrays.toString(ArraysHelper.maxSequence(a)));
	}

}
