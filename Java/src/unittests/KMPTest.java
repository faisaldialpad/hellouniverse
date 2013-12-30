package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import strings.KMP;
import strings.StringSimilarity;

public class KMPTest {

	@Test
	public void testGetKMPtable() {
		assertArrayEquals(new int[]{-1, 0,0,0,0,1,2},KMP.getKMPtable(new char[]{'A', 'B', 	'C', 'D', 'A', 	'B', 	'D'}));
		assertArrayEquals(new int[]{-1, 	0, 	0 	,0 ,	0, 	0 	,0 ,	0 ,	1 ,	2 ,	0, 	0 ,	0, 	0 ,	0 ,	0, 	1 ,	2 ,	3 ,	0, 	0, 	0 ,	0 	,0},
				KMP.getKMPtable(new char[]{'P','A','R','T','I','C','I','P','A','T','E',' ','I','N',' ','P','A','R','A','C','H','U','T','E'}));
	}
	@Test
	public void testSearch() {
		assertEquals(15, KMP.search("ABC ABCDAB ABCDABCDABDE", "ABCDABD"));
		assertEquals(10, KMP.search("THIS IS A TEST TEXT", "TEST"));
		assertEquals(0, KMP.search("AABAACAADAABAAABAA", "AABA"));
	}
}
