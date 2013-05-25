package unittests;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import strings.IdenticalRotations;

public class IdenticalRotationsTest {

	@Test
	public void defaultfail() {
		fail("Not yet implemented");
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		assertNotNull(new IdenticalRotations(null));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public final void testrotations() {
		
		
		
		
		
		
		System.out.println(new IdenticalRotations("").count());
		System.out.println(new IdenticalRotations("s").count());
		System.out.println(new IdenticalRotations("sa").count());
		System.out.println(new IdenticalRotations("ss").count());
		System.out.println(new IdenticalRotations("ByeBye").count());
		System.out.println(new IdenticalRotations("StackOverflow").count());
		System.out.println(new IdenticalRotations("ssi").count());
		System.out.println(new IdenticalRotations("BeyBye").count());
	//	System.out.println(Arrays.toString(ArraysHelper.maxSequence(a)));
	}

}
