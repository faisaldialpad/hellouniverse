package unittests;

import static org.junit.Assert.*;
import hashtables_arrays_strings_sort.RunningDuplicate;


import org.junit.Test;

public class RunningDuplicateTest {

	@Test
	public void testRunningDuplicate() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculate() {
		fail("Not yet implemented");
	}
	@Test
	public final void testRunningDuplicate_normal() {
		assertEquals("HH HHee HHeell HHeellll HHeelllloo", new RunningDuplicate("Hello").calculate());
	}
	@Test
	public final void testRunningDuplicate_boundary() {
		assertEquals("", new RunningDuplicate("").calculate());
	}

}
