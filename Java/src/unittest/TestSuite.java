package unittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import unittest.hashtables_arrays_strings_sort.ArraysHelperTest;
import unittest.linkedlists.LNodeTest;
import unittest.linkedlists.LinkedListHelperTest;

@RunWith(value = Suite.class)
@SuiteClasses(value = { LNodeTest.class, LinkedListHelperTest.class, ArraysHelperTest.class })
public class TestSuite {}