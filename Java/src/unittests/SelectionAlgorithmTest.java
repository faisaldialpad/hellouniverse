package unittests;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.BeforeClass;
import org.junit.Test;


import arrays.SelectionAlgorithm;




public class SelectionAlgorithmTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testSort() {
		int[] a= new int[1000];
		for(int i=0;i<1000;i++)
			a[i]=new Random().nextInt(1000);
		SelectionAlgorithm sa= new SelectionAlgorithm(a);
		for(int i=0;i<1000;i++){
			assertEquals(sa.find_inefficient(i), sa.find(i));
		}
	}
	

}
