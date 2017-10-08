using HelloUniverse.Math;
using NUnit.Framework;

namespace HelloUniverse.Tests.Math
{
    [TestFixture]
    public class AtoiTests
    {
        [TestCase]
        public void CornerCases()
        {
            Assert.AreEqual(0, Atoi.Convert(null));
            Assert.AreEqual(0, Atoi.Convert(""));
            Assert.AreEqual(0, Atoi.Convert("       "));
            Assert.AreEqual(1, Atoi.Convert("       1"));
            Assert.AreEqual(1, Atoi.Convert("       1abc"));
            Assert.AreEqual(0, Atoi.Convert("       ab1"));
            Assert.AreEqual(1, Atoi.Convert("       +1"));
            Assert.AreEqual(-1, Atoi.Convert("       -1"));
            Assert.AreEqual(1, Atoi.Convert("+1"));
            Assert.AreEqual(-1, Atoi.Convert("-1"));
        }

        [TestCase]
        public void NormalCases()
        {
            Assert.AreEqual(1234567, Atoi.Convert("1234567"));
            Assert.AreEqual(1234567, Atoi.Convert("+1234567"));
            Assert.AreEqual(-1234567, Atoi.Convert("-1234567"));
            Assert.AreEqual(34567, Atoi.Convert("0034567"));
            Assert.AreEqual(1234567, Atoi.Convert("+123dsds4567"));
        }

        [TestCase]
        public void OverflowCases()
        {
            Assert.AreEqual(1234567, Atoi.Convert("0909809809809"));
        }
    }
}
