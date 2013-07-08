package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import arrays.Codeforces6C;

public class Codeforces6CTest {

	@Test
	public void testGetDivideIndex() {
		assertEquals(1,Codeforces6C.getDivideIndex(new int[]{2,9,8,2,7}));
		assertEquals(0,Codeforces6C.getDivideIndex(new int[]{2}));
		assertEquals(2,Codeforces6C.getDivideIndex(new int[]{2,2,2,2,2}));
	}

}
