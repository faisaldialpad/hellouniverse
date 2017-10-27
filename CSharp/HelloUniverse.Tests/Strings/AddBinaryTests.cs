using HelloUniverse.Strings;
using NUnit.Framework;

namespace HelloUniverse.Tests.Strings
{
    [TestFixture]
    public class AddBinaryTests
    {
        [TestCase]
        public void CornerCases()
        {
            Assert.AreEqual("11", AddBinary.Add(null, "11"));
            Assert.AreEqual("11", AddBinary.Add("11", null));
            Assert.AreEqual("11", AddBinary.Add(string.Empty, "11"));
            Assert.AreEqual("11", AddBinary.Add("11", string.Empty));
            Assert.AreEqual("10", AddBinary.Add("1", "1"));
            Assert.AreEqual("1", AddBinary.Add("1", "0"));
            Assert.AreEqual("1", AddBinary.Add("0", "1"));
            Assert.AreEqual("0", AddBinary.Add("0", "0"));
        }

        [TestCase]
        public void NormalCases()
        {
            Assert.AreEqual("100", AddBinary.Add("11", "1"));
        }


    }
}
