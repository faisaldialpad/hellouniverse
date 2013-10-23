package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import arrays.FoxAndClassroom;

public class FoxAndClassroomTest {

	@Test
	public void testAbleTo() {
		assertEquals("Possible", FoxAndClassroom.ableTo(2, 3));
		assertEquals("Impossible", FoxAndClassroom.ableTo(2, 2));
		assertEquals("Impossible", FoxAndClassroom.ableTo(4, 6));
		assertEquals("Impossible", FoxAndClassroom.ableTo(3, 6));
	}

}
