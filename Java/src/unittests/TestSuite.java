package unittests;



import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(value = Suite.class)
@SuiteClasses(value = {  
		ArraysHelperTest.class, 
		EditDistanceTest.class,
		FibonacciTest.class,
		LinkedListHelperTest.class,
		LNodeTest.class, 
		LongestCommonSubStringTest.class,
		LongestIncreasingSubSeqTest.class,
		LongestPalindromicSubSeqTest.class,
		MakingChangeTest.class,
		MaxValueContiguousSubSeqTest.class,
		StringHelperTest.class ,
		UnboundedKnapsackTest.class
		})
public class TestSuite {}