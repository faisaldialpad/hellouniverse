package unittests;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.BeforeClass;
import org.junit.Test;

import arrays.MergeSort;




public class MergeSortTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testSort() {
		int[] a= new int[1000];
		for(int i=0;i<1000;i++)
			a[i]=new Random().nextInt(1000);
		int[] b=new MergeSort(a).sort();
		for(int i=1;i<1000;i++){
			assertTrue(b[i-1]<=b[i]);
		}
	}
	

}
