package unittest.hashtables_arrays_strings_sort;

import static org.junit.Assert.*;

import hashtables_arrays_strings_sort.ArraysHelper;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArraysHelperTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public final void testPermuteWithoutDuplicate_boundery() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		assertEquals(new HashSet<ArrayList<Integer>>(),ArraysHelper.permuteWithoutDuplicate(list));
	}
	@Test
	public final void testPermuteWithoutDuplicate_normal() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals("[[1, 2, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1], [2, 1, 3], [1, 3, 2]]", ArraysHelper.permuteWithoutDuplicate(list).toString());
	}

}
