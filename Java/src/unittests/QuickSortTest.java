package unittests;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.BeforeClass;
import org.junit.Test;

import arrays.QuickSort;



public class QuickSortTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testSortEasy() {
		int[] a= new int[1000];
		for(int i=0;i<1000;i++)
			a[i]=new Random().nextInt(1000);
		int[] b=new QuickSort(a).sort(false);
		for(int i=1;i<1000;i++){
			assertTrue(b[i-1]<=b[i]);
		}
		
	}
	@Test
	public void testSortInplace() {
		int[] a=new int[1000];
		for(int i=0;i<1000;i++)
			a[i]=new Random().nextInt(1000);
		int[] b=new QuickSort(a).sort(true);
		for(int i=1;i<a.length;i++){
			assertTrue(b[i-1]<=b[i]);
		}
		
	}

}
