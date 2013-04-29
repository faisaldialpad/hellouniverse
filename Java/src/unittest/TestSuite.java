package unittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import unittest.linkedlists.LNodeTest;
import unittest.linkedlists.LinkedListHelperTest;

@RunWith(value = Suite.class)
@SuiteClasses(value = { LNodeTest.class, LinkedListHelperTest.class })
public class TestSuite {}