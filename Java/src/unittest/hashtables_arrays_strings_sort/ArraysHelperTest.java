package unittest.hashtables_arrays_strings_sort;

import static org.junit.Assert.*;

import hashtables_arrays_strings_sort.ArraysHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArraysHelperTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		assertNotNull(new ArraysHelper());
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
		assertTrue(result.equals(ArraysHelper.permuteWithoutDuplicate(list)));
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
		assertTrue(result.equals(ArraysHelper.permuteWithoutDuplicate(list)));
	}
	@Test
	public final void testmaxseq() {
		int []a= { 74, 63, 7, 8, 9, 10, 11, 12, 78, 2, 21, 22, 23, 25, 79, 78, 76, 77, 71, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 };
	//	System.out.println(Arrays.toString(a));
	//	System.out.println(Arrays.toString(ArraysHelper.maxSequence(a)));
	}
	@Test
	public final void testrotations() {
		
		
		
		
		
		
		System.out.println(ArraysHelper.rotations(""));
		System.out.println(ArraysHelper.rotations("s"));
		System.out.println(ArraysHelper.rotations("sa"));
		System.out.println(ArraysHelper.rotations("ss"));
		System.out.println(ArraysHelper.rotations("ByeBye"));
		System.out.println(ArraysHelper.rotations("StackOverflow"));
		System.out.println(ArraysHelper.rotations("ssi"));
		System.out.println(ArraysHelper.rotations("BeyBye"));
	//	System.out.println(Arrays.toString(ArraysHelper.maxSequence(a)));
	}

}
