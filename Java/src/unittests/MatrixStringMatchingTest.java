package unittests;

import static org.junit.Assert.*;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;

import strings.MatrixStringMatching;

public class MatrixStringMatchingTest {
	@Test
	public void testWhenMatrixEmptyOrNull() {
		char[][] mat = new char[0][0];
		assertEquals(new HashSet<Point>(), MatrixStringMatching.matchPattern(null, "fox"));
		assertEquals(new HashSet<Point>(), MatrixStringMatching.matchPattern(mat, "fox"));
	}
	@Test
	public void testWhenPatternEmptyOrNull() {
		char[][] mat = new char[5][5];
		mat[0] = new char[]{'f', 'o', 'x', 'y', 'd'};
		mat[1] = new char[]{'g', 'k', 'f', 'b', 'i'};
		mat[2] = new char[]{'k', 'n', 'o', 'g', 'm'};
		mat[3] = new char[]{'x', 'o', 'x', 'h', 'm'};
		mat[4] = new char[]{'x', 'o', 'f', 'b', 'n'};
		HashSet<Point> expected = new HashSet<Point>();
		for(int i=0;i<mat.length;i++){
	        for(int j=0;j<mat[i].length;j++){
	        	expected.add(new Point(i,j));
	        }
		}
		assertEquals(expected, MatrixStringMatching.matchPattern(mat, ""));
		assertEquals(expected, MatrixStringMatching.matchPattern(mat, null));
	}
	@Test
	public void testWhenPatternIsOneChar() {
		char[][] mat = new char[5][5];
		mat[0] = new char[]{'f', 'o', 'x', 'y', 'd'};
		mat[1] = new char[]{'g', 'k', 'f', 'b', 'i'};
		mat[2] = new char[]{'k', 'q', 'q', 'q', 'm'};
		mat[3] = new char[]{'x', 'o', 'x', 'h', 'm'};
		mat[4] = new char[]{'x', 'o', 'q', 'b', 'n'};
		HashSet<Point> expected = new HashSet<Point>();
		expected.add(new Point(2,1));
		expected.add(new Point(2,2));
		expected.add(new Point(2,3));
		expected.add(new Point(4,2));
		assertEquals(expected, MatrixStringMatching.matchPattern(mat, "q"));
	}
	@Test
	public void testWhenBothMatrixAndPatternEmptyOrNull() {
		char[][] mat = new char[0][0];
		assertEquals(new HashSet<Point>(), MatrixStringMatching.matchPattern(null, "fox"));
		assertEquals(new HashSet<Point>(), MatrixStringMatching.matchPattern(mat, "fox"));
		assertEquals(new HashSet<Point>(), MatrixStringMatching.matchPattern(null, ""));
		assertEquals(new HashSet<Point>(), MatrixStringMatching.matchPattern(mat, null));
	}
	
	@Test
	public void testWhenPatternSizeIsBiggerThanRow() {
		char[][] mat = new char[7][5];
		mat[0] = new char[]{'f', 'o', 'x', 'y', 'd'};
		mat[1] = new char[]{'g', 'k', 'f', 'b', 'i'};
		mat[2] = new char[]{'k', 'n', 'o', 'g', 'm'};
		mat[3] = new char[]{'x', 'o', 'x', 'h', 'm'};
		mat[4] = new char[]{'x', 'o', 'f', 'b', 'n'};
		mat[5] = new char[]{'x', 'o', 'f', 'b', 'n'};
		mat[6] = new char[]{'x', 'o', 'f', 'b', 'n'};
		HashSet<Point> expected_fgkxxx = new HashSet<Point>();
		expected_fgkxxx.add(new Point(0,0));
		assertEquals(expected_fgkxxx, MatrixStringMatching.matchPattern(mat, "fgkxxx"));
		assertEquals(new HashSet<Point>(), MatrixStringMatching.matchPattern(mat, "rerere")); //just random
		assertEquals(new HashSet<Point>(), MatrixStringMatching.matchPattern(mat, "foxydx")); //match everything in the 1st row, but just bigger
	}
	@Test
	public void testWhenPatternSizeIsBiggerThanColumn() {
		char[][] mat = new char[4][5];
		mat[0] = new char[]{'f', 'o', 'x', 'y', 'd'};
		mat[1] = new char[]{'g', 'k', 'f', 'b', 'i'};
		mat[2] = new char[]{'k', 'n', 'o', 'g', 'm'};
		mat[3] = new char[]{'x', 'o', 'x', 'h', 'm'};
		HashSet<Point> expected = new HashSet<Point>();
		expected.add(new Point(0,1));
		assertEquals(expected, MatrixStringMatching.matchPattern(mat, "oxyd"));
		assertEquals(new HashSet<Point>(), MatrixStringMatching.matchPattern(mat, "rerere")); //just random
		assertEquals(new HashSet<Point>(), MatrixStringMatching.matchPattern(mat, "fgkxyy")); //match everything in the 1st column, but just bigger
	}
	@Test
	public void testRow() {
		char[][] mat = new char[2][5];
		mat[0] = new char[]{'f', 'o', 'x', 'y', 'd'};
		mat[1] = new char[]{'p', 'p', 'p', 'p', 'p'};
		HashSet<Point> expected_match_from_start = new HashSet<Point>();
		expected_match_from_start.add(new Point(0,0));
		HashSet<Point> expected_match_to_end = new HashSet<Point>();
		expected_match_to_end.add(new Point(0,2));
		HashSet<Point> expected_match_overlap = new HashSet<Point>();
		expected_match_overlap.add(new Point(1,0));
		expected_match_overlap.add(new Point(1,1));
		expected_match_overlap.add(new Point(1,2));
		assertEquals(expected_match_from_start, MatrixStringMatching.matchPattern(mat, "fox")); //forward
		assertEquals(expected_match_to_end, MatrixStringMatching.matchPattern(mat, "xyd")); //forward
		assertEquals(expected_match_from_start, MatrixStringMatching.matchPattern(mat, "xof")); //backward
		assertEquals(expected_match_to_end, MatrixStringMatching.matchPattern(mat, "dyx")); //backward
		assertEquals(expected_match_overlap, MatrixStringMatching.matchPattern(mat, "ppp"));
	}
	@Test
	public void testColumn() {
		char[][] mat = new char[5][2];
		mat[0] = new char[]{'a', 'p'};
		mat[1] = new char[]{'b', 'p'};
		mat[2] = new char[]{'c', 'p'};
		mat[3] = new char[]{'d', 'p'};
		mat[4] = new char[]{'e', 'p'};
		HashSet<Point> expected_match_from_start = new HashSet<Point>();
		expected_match_from_start.add(new Point(0,0));
		HashSet<Point> expected_match_to_end = new HashSet<Point>();
		expected_match_to_end.add(new Point(2,0));
		HashSet<Point> expected_match_overlap = new HashSet<Point>();
		expected_match_overlap.add(new Point(0,1));
		expected_match_overlap.add(new Point(1,1));
		expected_match_overlap.add(new Point(2,1));
		assertEquals(expected_match_from_start, MatrixStringMatching.matchPattern(mat, "abc")); //forward
		assertEquals(expected_match_to_end, MatrixStringMatching.matchPattern(mat, "cde")); //forward
		assertEquals(expected_match_from_start, MatrixStringMatching.matchPattern(mat, "cba")); //backward
		assertEquals(expected_match_to_end, MatrixStringMatching.matchPattern(mat, "edc")); //backward
		assertEquals(expected_match_overlap, MatrixStringMatching.matchPattern(mat, "ppp"));
	}
	@Test
	public void testIgnoreDuplicateLocations() {
		char[][] mat = new char[3][3];
		mat[0] = new char[]{'f', 'x', 'x'};
		mat[1] = new char[]{'x', 'j', 'o'};
		mat[2] = new char[]{'k', 'o', 'o'};
	
		HashSet<Point> expected = new HashSet<Point>();
		expected.add(new Point(1,1));
		assertEquals(expected, MatrixStringMatching.matchPattern(mat, "jo"));
	}
	
	@Test
	public void testMatchPattern() {
		char[][] mat = new char[5][5];
		mat[0] = new char[]{'f', 'o', 'x', 'y', 'd'};
		mat[1] = new char[]{'g', 'k', 'f', 'b', 'i'};
		mat[2] = new char[]{'k', 'n', 'o', 'g', 'm'};
		mat[3] = new char[]{'x', 'o', 'x', 'h', 'm'};
		mat[4] = new char[]{'x', 'o', 'f', 'b', 'n'};
		HashSet<Point> expected = new HashSet<Point>();
		expected.add(new Point(0,0));
		expected.add(new Point(1,2));
		expected.add(new Point(4,0));
		assertEquals(expected, MatrixStringMatching.matchPattern(mat, "fox"));
	}

	
	
	
	
}
