using HelloUniverse.LinkedLists;
using NUnit.Framework;
using NUnit.Framework.Internal;

namespace HelloUniverse.Tests.LinkedLists
{
    [TestFixture]
    public class OddEvenListTests
    {
        [Test]
        public void CornerCases()
        {
            Assert.IsNull(OddEvenList.GetOddEvenList(null));
            Assert.AreEqual("5", OddEvenList.GetOddEvenList(new OddEvenList.ListNode(5)).ToString());
            var two = new OddEvenList.ListNode(4)
            {
                next = new OddEvenList.ListNode(5)
            };

            Assert.AreEqual("4->5", OddEvenList.GetOddEvenList(two).ToString());
        }

        [Test]
        public void NormalCases()
        {
            var three = new OddEvenList.ListNode(4)
            {
                next = new OddEvenList.ListNode(5)
                {
                    next = new OddEvenList.ListNode(6)
                }
            };

            Assert.AreEqual("4->6->5", OddEvenList.GetOddEvenList(three).ToString());

            var four = new OddEvenList.ListNode(4)
            {
                next = new OddEvenList.ListNode(5)
                {
                    next = new OddEvenList.ListNode(6)
                    {
                        next = new OddEvenList.ListNode(7)
                    }
                }
            };

            Assert.AreEqual("4->6->5->7", OddEvenList.GetOddEvenList(four).ToString());
        }


    }
}
