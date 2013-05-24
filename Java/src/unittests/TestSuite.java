package unittests;



import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(value = Suite.class)
@SuiteClasses(value = {  
		ArraysHelperTest.class, 
		DijkstraTest.class,
		EditDistanceTest.class,
		FibonacciTest.class,
		GNodeTest.class,
		GraphTest.class,
		LinkedListAddTest.class,
		LinkedListHelperTest.class,
		LNodeTest.class,
		LongestCommonSubSeqTest.class,
		LongestCommonSubStringTest.class,
		LongestIncreasingSubSeqTest.class,
		LongestPalindromicSubSeqTest.class,
		MakingChangeTest.class,
		MaxValueContiguousSubSeqTest.class,
		StringAddTest.class,
		StringHelperTest.class,
		TNodeTest.class,
		UnboundedKnapsackTest.class
		})
public class TestSuite {}