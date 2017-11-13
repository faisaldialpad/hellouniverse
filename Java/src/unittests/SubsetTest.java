package unittests;
import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;
import arrays.Subset;


public class SubsetTest {
	@Test
	public void testGetSubsetsIteratively() {
		assertEquals(Arrays.asList(new ArrayList<Integer>()), Subset.getSubsetsIteratively(new int[] {}));
		
		assertEquals(
				Arrays.asList(
					new ArrayList<Integer>(),
					Arrays.asList(1)
				), 
				Subset.getSubsetsIteratively(new int[] {1}));
		
		assertEquals(
				Arrays.asList(
					new ArrayList<Integer>(),
					Arrays.asList(1),
					Arrays.asList(2),
					Arrays.asList(1, 2)
				), 
				Subset.getSubsetsIteratively(new int[] {1, 2}));
		
		assertEquals(
				Arrays.asList(
					new ArrayList<Integer>(),
					Arrays.asList(1),
					Arrays.asList(2),
					Arrays.asList(1, 2),
					Arrays.asList(3),
					Arrays.asList(1, 3),
					Arrays.asList(2, 3),
					Arrays.asList(1, 2, 3)
				), 
				Subset.getSubsetsIteratively(new int[] {1, 2, 3}));
	}
	
	@Test
	public void testGetSubsetsBacktracking() {
		assertEquals(Arrays.asList(new ArrayList<Integer>()), Subset.getSubsetsBacktracking(new int[] {}));
		
		assertEquals(
				Arrays.asList(
					new ArrayList<Integer>(),
					Arrays.asList(1)
				), 
				Subset.getSubsetsBacktracking(new int[] {1}));
		
		assertEquals(
				new HashSet<>(Arrays.asList(
					new ArrayList<Integer>(),
					Arrays.asList(1),
					Arrays.asList(2),
					Arrays.asList(1, 2)
				)), 
				new HashSet<>(Subset.getSubsetsBacktracking(new int[] {1, 2})));
		
		assertEquals(
				new HashSet<>(Arrays.asList(
					new ArrayList<Integer>(),
					Arrays.asList(1),
					Arrays.asList(2),
					Arrays.asList(1, 2),
					Arrays.asList(3),
					Arrays.asList(1, 3),
					Arrays.asList(2, 3),
					Arrays.asList(1, 2, 3)
				)), 
				new HashSet<>(Subset.getSubsetsBacktracking(new int[] {1, 2, 3})));
	}
	@Test
	public void testGetSubsetsRecursively() {
		assertEquals(Arrays.asList(new ArrayList<Integer>()), Subset.getSubsetsRecursively(new int[] {}));
		
		assertEquals(
				Arrays.asList(
					new ArrayList<Integer>(),
					Arrays.asList(1)
				), 
				Subset.getSubsetsRecursively(new int[] {1}));
		
		assertEquals(
				Arrays.asList(
					new ArrayList<Integer>(),
					Arrays.asList(1),
					Arrays.asList(2),
					Arrays.asList(1, 2)
				), 
				Subset.getSubsetsRecursively(new int[] {1, 2}));
		
		assertEquals(
				Arrays.asList(
					new ArrayList<Integer>(),
					Arrays.asList(1),
					Arrays.asList(2),
					Arrays.asList(1, 2),
					Arrays.asList(3),
					Arrays.asList(1, 3),
					Arrays.asList(2, 3),
					Arrays.asList(1, 2, 3)
				), 
				Subset.getSubsetsRecursively(new int[] {1, 2, 3}));
	}

	@Test
	public void testGetSubsetsRecursivelyOldWay() {
		assertEquals(new HashSet<>(Arrays.asList(new ArrayList<Integer>())), Subset.getSubsetsRecursivelyOldWay(new ArrayList<Integer>()));
		
		assertEquals(
				new HashSet<>(Arrays.asList(
					new ArrayList<Integer>(),
					Arrays.asList(1)
				)), 
				Subset.getSubsetsRecursivelyOldWay(new ArrayList<Integer>(Arrays.asList(1))));
		
		assertEquals(
				new HashSet<>(Arrays.asList(
					new ArrayList<Integer>(),
					Arrays.asList(1),
					Arrays.asList(2),
					Arrays.asList(1, 2)
				)), 
				Subset.getSubsetsRecursivelyOldWay(new ArrayList<Integer>(Arrays.asList(1, 2))));
		
		assertEquals(
				new HashSet<>(Arrays.asList(
					new ArrayList<Integer>(),
					Arrays.asList(1),
					Arrays.asList(2),
					Arrays.asList(1, 2),
					Arrays.asList(3),
					Arrays.asList(1, 3),
					Arrays.asList(2, 3),
					Arrays.asList(1, 2, 3)
				)), 
				Subset.getSubsetsRecursivelyOldWay(new ArrayList<Integer>(Arrays.asList(1, 2, 3))));
	}

}
