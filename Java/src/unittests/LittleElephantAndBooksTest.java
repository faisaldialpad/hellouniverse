package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import arrays.LittleElephantAndBooks;

public class LittleElephantAndBooksTest {

	@Test
	public void testGetNumber() {
		assertEquals(2, LittleElephantAndBooks.getNumber(new int[]{1,2}, 1));
		assertEquals(58, LittleElephantAndBooks.getNumber(new int[]{74, 7, 4, 47, 44}, 3));
		assertEquals(29, LittleElephantAndBooks.getNumber(new int[]{3, 1, 9, 7, 2, 8, 6, 4, 5}, 7));
		assertEquals(80, LittleElephantAndBooks.getNumber(new int[]{74, 86, 32, 13, 100, 67, 77}, 2));
	}

}
