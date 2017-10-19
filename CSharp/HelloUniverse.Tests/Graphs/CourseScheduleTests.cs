using HelloUniverse.Graphs;
using NUnit.Framework;

namespace HelloUniverse.Tests.Graphs
{
    [TestFixture]
    public class CourseScheduleTests
    {
        [Test]
        public void TestCases()
        {
            Assert.IsTrue(CourseSchedule.CanFinish(3, new int[,] {{1, 0}, {2, 0}, {2, 1}}));
            Assert.IsFalse(CourseSchedule.CanFinish(3, new int[,] { { 1, 0 }, { 0, 1 } }));
        }

    }
}
