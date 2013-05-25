package unittests;

import static org.junit.Assert.*;



import org.junit.Test;

import strings.RunningDuplicate;

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
