using NUnit.Framework;
using System.Collections.Generic;

namespace HelloUniverse.Tests.LinkedLists
{
    [TestFixture]
    public class CopyListWithRandomPointerTests
    {
        public delegate CopyListWithRandomPointer.RandomListNode CopyDelegate(CopyListWithRandomPointer.RandomListNode head);

        [TestCaseSource(nameof(TestCases))]
        public void TestCopy(CopyDelegate copy)
        {
            Assert.IsNull(copy(null));
            Assert.IsTrue(AreSame(
                new CopyListWithRandomPointer.RandomListNode(5),
                copy(new CopyListWithRandomPointer.RandomListNode(5))));

            var l1 = new CopyListWithRandomPointer.RandomListNode(5)
            {
                next = new CopyListWithRandomPointer.RandomListNode(6)
                {
                    next = new CopyListWithRandomPointer.RandomListNode(7)
                    {
                        next = new CopyListWithRandomPointer.RandomListNode(8)
                    }
                }
            };

            l1.random = l1.next.next;
            l1.next.random = null;
            l1.next.next.random = l1.next;
            l1.next.next.random = l1;

            Assert.IsTrue(AreSame(
                l1,
                copy(l1)));
        }
        private bool AreSame(
            CopyListWithRandomPointer.RandomListNode l1,
            CopyListWithRandomPointer.RandomListNode l2)
        {
            while (l1 != null && l2 != null)
            {
                if (l1.label != l2.label)
                {
                    return false;
                }

                if (l1.random != null && l2.random != null)
                {
                    if (l1.random.label != l2.random.label)
                    {
                        return false;
                    }
                }
                else if (l1.random != null || l2.random != null)
                {
                    return false;
                }

                l1 = l1.next;
                l2 = l2.next;
            }

            if (l1 != null || l2 != null)
            {
                return false;
            }

            return true;
        }

        private static IEnumerable<TestCaseData> TestCases
        {
            get
            {
                yield return
                    new TestCaseData(new CopyDelegate(CopyListWithRandomPointer.CopyUsingMap)).SetName(
                        nameof(CopyListWithRandomPointer.CopyUsingMap));
                yield return
                    new TestCaseData(new CopyDelegate(CopyListWithRandomPointer.CopyWithoutMap)).SetName(
                        nameof(CopyListWithRandomPointer.CopyWithoutMap));
            }
        }
    }
}
