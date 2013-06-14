package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import strings.IsAnagram;

public class IsAnagramTest {

	@Test
	public void testIsAnagram() {
		assertTrue(IsAnagram.determine("aabc", "baca"));
		assertFalse(IsAnagram.determine("aabc", "bcca"));
	}

}
