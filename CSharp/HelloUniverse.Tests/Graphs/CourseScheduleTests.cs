using HelloUniverse.Graphs;
using NUnit.Framework;

namespace HelloUniverse.Tests.Graphs
{
    [TestFixture]
    public class CourseScheduleTests
    {
        [Test]
        public void TestCanFinish()
        {
            Assert.IsTrue(CourseSchedule.CanFinish(3, new int[,] {{1, 0}, {2, 0}, {2, 1}}));
            Assert.IsFalse(CourseSchedule.CanFinish(3, new int[,] { { 1, 0 }, { 0, 1 } }));
        }

        [Test]
        public void TestFindOrder()
        {
            Assert.AreEqual(new int[] { 0, 1, 2, 3 }, CourseSchedule.FindOrder(4, new int[,] { { 1, 0 }, { 2, 0 }, { 3, 1 }, { 3, 2 } })); // can have multiple solution
            Assert.AreEqual(new int[] {0, 1, 2}, CourseSchedule.FindOrder(3, new int[,] {{1, 0}, {2, 0}, {2, 1}}));
            Assert.AreEqual(new int[] { }, CourseSchedule.FindOrder(3, new int[,] {{1, 0}, {0, 1}}));
        }
    }
}
