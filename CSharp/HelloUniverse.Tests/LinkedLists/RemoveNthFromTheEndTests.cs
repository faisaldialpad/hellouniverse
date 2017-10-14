using System.Text;
using HelloUniverse.LinkedLists;
using HelloUniverse.Math;
using NUnit.Framework;

namespace HelloUniverse.Tests.LinkedLists
{
    [TestFixture]
    public class RemoveNthFromTheEndTests
    {
        private string Serialize(RemoveNthFromTheEnd.ListNode node)
        {
            if (node == null)
            {
                return null;
            }

            var sb = new StringBuilder(node.val.ToString());
            while (node.next != null)
            {
                sb.Append($"->{node.next.val}");
                node = node.next;
            }

            return sb.ToString();
        }

        [TestCase]
        public void CornerCases()
        {
            Assert.AreEqual(null, Serialize(RemoveNthFromTheEnd.Remove(new RemoveNthFromTheEnd.ListNode(5), 1)));
            Assert.AreEqual("5",
                Serialize(RemoveNthFromTheEnd.Remove(
                    new RemoveNthFromTheEnd.ListNode(5)
                    {
                        next = new RemoveNthFromTheEnd.ListNode(6)
                    }, 1)));
        }

        [TestCase]
        public void NormalCases()
        {
            var list = new RemoveNthFromTheEnd.ListNode(1)
            {
                next = new RemoveNthFromTheEnd.ListNode(2)
                {
                    next = new RemoveNthFromTheEnd.ListNode(3)
                    {
                        next = new RemoveNthFromTheEnd.ListNode(4)
                        {
                            next = new RemoveNthFromTheEnd.ListNode(5)
                        }
                    }
                }
            };
            Assert.AreEqual("1->2->3->5", Serialize(RemoveNthFromTheEnd.Remove(list, 2)));
        }
    }
}
