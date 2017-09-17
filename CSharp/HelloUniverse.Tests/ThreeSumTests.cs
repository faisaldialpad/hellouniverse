using System;
using System.Collections.Generic;
using NUnit.Framework;

namespace HelloUniverse.Tests
{
    [TestFixture]
    public class ThreeSumTests
    {
        [Test]
        public void CornerCases()
        {
            Assert.AreEqual(new List<IList<int>>(), ThreeSum.FindAll(null));
            Assert.AreEqual(new List<IList<int>>(), ThreeSum.FindAll(new int[]{}));
        }

        [Test]
        public void NormalCases()
        {
            Assert.AreEqual(
                new List<IList<int>>
                {
                    new List<int>{-1, -1, 2 },
                    new List<int>{-1, 0, 1 },
                }
                , ThreeSum.FindAll(new int[] { -1, 0, 1, 2, -1, -4 }));
        }

        [Test]
        public void AllZeros()
        {
            Assert.AreEqual(
                new List<IList<int>>
                {
                    new List<int>{0, 0, 0 }
                }
                , ThreeSum.FindAll(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }));
        }
    }
}
