using HelloUniverse.Graph;
using NUnit.Framework;
using NUnit.Framework.Internal;

namespace HelloUniverse.Tests.LinkedLists
{
    [TestFixture]
    public class AlienOrderTopologicalSortTests
    {
        [Test]
        public void TestSort()
        {
            Assert.AreEqual("wertf", AlienOrderTopologicalSort.Sort(new string[] { "wrt", "wrf", "er", "ett", "rftt" }));
            Assert.AreEqual("zx", AlienOrderTopologicalSort.Sort(new string[] { "z", "x" }));
            Assert.AreEqual("", AlienOrderTopologicalSort.Sort(new string[] { "z", "x", "z" }));
            Assert.AreEqual("cbda", AlienOrderTopologicalSort.Sort(new string[] { "ab", "adc" })); //can have multiple answer
        }
    }
}
