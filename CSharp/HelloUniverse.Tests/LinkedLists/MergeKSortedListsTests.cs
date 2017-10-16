using HelloUniverse.LinkedLists;
using NUnit.Framework;
using System.Collections.Generic;

namespace HelloUniverse.Tests.LinkedLists
{
    [TestFixture]
    public class MergeKSortedListsTests
    {
        public delegate MergeKSortedLists.ListNode MergeDelegate(MergeKSortedLists.ListNode[] lists);

        [TestCaseSource(nameof(TestCases))]
        public void TestCopy(MergeDelegate merge)
        {
            Assert.IsNull(merge(null));
            Assert.IsNull(merge(new MergeKSortedLists.ListNode[] { }));

            var l1 = new MergeKSortedLists.ListNode(1)
            {
                next = new MergeKSortedLists.ListNode(2)
                {
                    next = new MergeKSortedLists.ListNode(4)
                }
            };

            var l2 = new MergeKSortedLists.ListNode(3)
            {
                next = new MergeKSortedLists.ListNode(4)
                {
                    next = new MergeKSortedLists.ListNode(5)
                }
            };

            var l3 = new MergeKSortedLists.ListNode(2)
            {
                next = new MergeKSortedLists.ListNode(3)
                {
                    next = new MergeKSortedLists.ListNode(6)
                }
            };

            Assert.AreEqual("1->2->2->3->3->4->4->5->6", merge(new MergeKSortedLists.ListNode[] { l1, l2, l3 }).ToString());

        }


        private static IEnumerable<TestCaseData> TestCases
        {
            get
            {
                yield return
                    new TestCaseData(new MergeDelegate(MergeKSortedLists.Merge)).SetName(
                        nameof(MergeKSortedLists.Merge));
            }
        }
    }
}
