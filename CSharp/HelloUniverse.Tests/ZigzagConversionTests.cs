using System;
using NUnit.Framework;

namespace HelloUniverse.Tests
{
    [TestFixture]
    public class ZigzagConversionTests
    {
        [Test]
        public void CornerCases()
        {
            Assert.AreEqual(null, ZigzagConversion.Convert(null, 2));
            Assert.AreEqual(string.Empty, ZigzagConversion.Convert(string.Empty, 2));
            Assert.AreEqual("abc", ZigzagConversion.Convert("abc", 0));
            Assert.AreEqual("abc", ZigzagConversion.Convert("abc", 1));
            Assert.AreEqual("abc", ZigzagConversion.Convert("abc", -1));
        }

        [Test]
        public void NormalCases()
        {
            Assert.AreEqual("ACB", ZigzagConversion.Convert("ABC", 2));
            Assert.AreEqual("PYAIHRNAPLSIIG", ZigzagConversion.Convert("PAYPALISHIRING", 2));
            Assert.AreEqual("PAHNAPLSIIGYIR", ZigzagConversion.Convert("PAYPALISHIRING", 3));
            Assert.AreEqual("PINALSIGYAHRPI", ZigzagConversion.Convert("PAYPALISHIRING", 4));
        }
    }
}
