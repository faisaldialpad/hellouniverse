package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import arrays.MoveZerosToEnd;

public class MoveZerosToEndTest {

	@Test
	public void testMove() {
		assertArrayEquals(new int[]{}, MoveZerosToEnd.move(new int[]{}));
		assertArrayEquals(new int[]{0}, MoveZerosToEnd.move(new int[]{0}));
		assertArrayEquals(new int[]{1}, MoveZerosToEnd.move(new int[]{1}));
		assertArrayEquals(new int[]{1,2,3,4}, MoveZerosToEnd.move(new int[]{1,2,3,4}));
		assertArrayEquals(new int[]{1,2,3,0}, MoveZerosToEnd.move(new int[]{1,2,3,0}));
		assertArrayEquals(new int[]{1,3,2,0}, MoveZerosToEnd.move(new int[]{1,0,3,2}));
		assertArrayEquals(new int[]{1,2,0,0}, MoveZerosToEnd.move(new int[]{1,0,0,2}));
		assertArrayEquals(new int[]{1,0,0,0}, MoveZerosToEnd.move(new int[]{0,0,0,1}));
	}

}
