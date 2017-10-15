using System.Collections.Generic;

namespace HelloUniverse.LinkedLists
{
    public static class OddEvenList
    {
        public static ListNode GetOddEvenList(ListNode head)
        {
            if (head == null)
            {
                return null;
            }

            var odd = head;
            var evenHead = head.next;
            var even = evenHead;

            while (even?.next != null)
            {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next; //odd.next is basically even.next.next in the last iteration. So, loop needs to check even.next!=null
                even = even.next;
            }

            odd.next = evenHead;

            return head;
        }
        public class ListNode
        {
            public int val;
            public ListNode next;

            public ListNode(int x)
            {
                val = x;
            }

            public override string ToString()
            {
                var temp = this;
                var list = new List<int>();
                while (temp != null)
                {
                    list.Add(temp.val);
                    temp = temp.next;
                }

                return string.Join("->", list.ToArray());
            }
        }
    }
}
