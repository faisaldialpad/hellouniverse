package unittests;
import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import arrays.Subset;


public class SubsetTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testPermute() {
		fail();
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		HashSet<ArrayList<Integer>> ret=Subset.subset(a);
		System.out.println(ret.toString());
	}

}
