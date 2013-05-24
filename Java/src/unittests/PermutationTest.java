package unittests;

import static org.junit.Assert.*;


import hashtables_arrays_strings_sort.Permutation;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PermutationTest {
	
	@Test
	public void defaultFail() {
		fail("Not yet implemented");
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		assertNotNull(new Permutation(null));
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
	public final void defaultfail(){
		fail("default fail");
	}
	@Test
	public final void testPermuteWithoutDuplicate_boundery() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		assertEquals(new HashSet<ArrayList<Integer>>(),new Permutation(list).permuteWithoutDuplicate());
	}
	@Test
	public final void testPermuteWithoutDuplicate_no_duplicate_in_input() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list,1,2);
		HashSet<ArrayList<Integer>> result=new HashSet<ArrayList<Integer>>();
		ArrayList<Integer> r1 = new ArrayList<Integer>();
		Collections.addAll(r1,1,2);
		ArrayList<Integer> r2 = new ArrayList<Integer>();
		Collections.addAll(r2,2,1);
		result.add(r1);
		result.add(r2);
		assertTrue(result.equals(new Permutation(list).permuteWithoutDuplicate()));
	}
	@Test
	public final void testPermuteWithoutDuplicate_duplicate_in_input() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		HashSet<ArrayList<Integer>> result=new HashSet<ArrayList<Integer>>();
		ArrayList<Integer> r1 = new ArrayList<Integer>();
		Collections.addAll(r1,1,2,2);
		ArrayList<Integer> r2 = new ArrayList<Integer>();
		Collections.addAll(r2,2,2,1);
		ArrayList<Integer> r3 = new ArrayList<Integer>();
		Collections.addAll(r3,2,1,2);
		result.add(r1);
		result.add(r2);
		result.add(r3);
		assertTrue(result.equals(new Permutation(list).permuteWithoutDuplicate()));
	}

	

}
