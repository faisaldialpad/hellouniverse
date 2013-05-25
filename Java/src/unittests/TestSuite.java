package unittests;



import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(value = Suite.class)
@SuiteClasses(value = {  
		CircularListTest.class,
		DijkstraTest.class,
		EditDistanceTest.class,
		FibonacciTest.class,
		GNodeTest.class,
		GraphTest.class,
		IdenticalRotationsTest.class,
		Last_N_ElementsTest.class,
		LinkedListAddTest.class,
		LNodeTest.class,
		LongestCommonSubSeqTest.class,
		LongestCommonSubStringTest.class,
		LongestIncreasingSubSeqTest.class,
		LongestPalindromicSubSeqTest.class,
		MakingChangeTest.class,
		MaxLengthContiguousSequentialIntegersTest.class,
		MaxValueContiguousSubSeqTest.class,
		PermutationTest.class,
		StringAddTest.class,
		TNodeTest.class,
		UnboundedKnapsackTest.class
		})
public class TestSuite {}