using System.Collections.Generic;

namespace HelloUniverse.LinkedLists
{
    public static class MergeKSortedLists
    {
        public static ListNode Merge(ListNode[] lists)
        {
            if (lists == null || lists.Length == 0)
            {
                return null;
            }

            var mergedHead = new ListNode(0);
            var temp = mergedHead;
            while (true)
            {
                var min = int.MaxValue;
                var minIndex = -1;
                for (var i = 0; i < lists.Length; i++)
                {
                    if (lists[i] != null && lists[i].val < min)
                    {
                        min = lists[i].val;
                        minIndex = i;
                    }
                }

                if (minIndex == -1)
                {
                    break;
                }

                temp.next = lists[minIndex];
                lists[minIndex] = lists[minIndex].next;
                temp = temp.next;
            }
            temp.next = null;

            return mergedHead.next;
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
