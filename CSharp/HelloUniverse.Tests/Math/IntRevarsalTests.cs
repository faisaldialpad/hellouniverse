using HelloUniverse.Math;
using NUnit.Framework;

namespace HelloUniverse.Tests.Math
{
    [TestFixture]
    public class IntRevarsalTests
    {
        [TestCase]
        public void CornerCases()
        {
            Assert.AreEqual(0, IntRevarsal.Reverse(0));
            Assert.AreEqual(1, IntRevarsal.Reverse(1));
            Assert.AreEqual(-1, IntRevarsal.Reverse(-1));
        }

        [TestCase]
        public void NormalCases()
        {
            Assert.AreEqual(0, IntRevarsal.Reverse(0));
            Assert.AreEqual(1234567, IntRevarsal.Reverse(7654321));
            Assert.AreEqual(-1234567, IntRevarsal.Reverse(-7654321));
            Assert.AreEqual(34567, IntRevarsal.Reverse(76543000));
        }

        [TestCase]
        public void OverflowCases()
        {
            Assert.AreEqual(0, IntRevarsal.Reverse(1000000003));
        }
    }
}
