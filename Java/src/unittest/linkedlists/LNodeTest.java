package unittest.linkedlists;

import static org.junit.Assert.*;
import linkedlists.LNode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LNodeTest {

	private LNode node;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		node = new LNode(1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void test_construct() {
		assertNotNull(node);
	}
}
