using HelloUniverse.Graphs;
using NUnit.Framework;

namespace HelloUniverse.Tests.Graphs
{
    [TestFixture]
    public class LongestIncreasingPathInMatrixTests
    {
        [Test]
        public void NormalCases()
        {
            Assert.AreEqual(4, LongestIncreasingPathInMatrix.GetLongestIncreasingPath(new int[,] {{ 9, 9, 4 }, { 6, 6, 8 }, { 2, 1, 1 } }));
            Assert.AreEqual(4, LongestIncreasingPathInMatrix.GetLongestIncreasingPath(new int[,] { { 3, 4, 5 }, { 3, 2, 6 }, { 2, 2, 1 } }));
        }
    }
}
