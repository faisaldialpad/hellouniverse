namespace HelloUniverse.LinkedLists
{
    public static class Merge2SortedLists
    {
        public static ListNode MergeWithoutDuplicates(ListNode l1, ListNode l2)
        {
            if (l1 == null)
            {
                return l2;
            }

            if (l2 == null)
            {
                return l1;
            }

            if (l1.val == l2.val)
            {
                l1.next = MergeWithoutDuplicates(l1.next, l2.next);
                return l1;
            }
            else if (l1.val < l2.val)
            {
                l1.next = MergeWithoutDuplicates(l1.next, l2);
                return l1;
            }
            else
            {
                l2.next = MergeWithoutDuplicates(l1, l2.next);
                return l2;
            }
        }

        public static ListNode MergeWithoutDuplicatesWithoutDestroying(ListNode l1, ListNode l2)
        {
            if (l1 == null)
            {
                return Copy(l2);
            }

            if (l2 == null)
            {
                return Copy(l1);
            }

            if (l1.val == l2.val)
            {
                var ret = new ListNode(l1.val);
                ret.next = MergeWithoutDuplicatesWithoutDestroying(l1.next, l2.next);
                return ret;
            }
            else if (l1.val < l2.val)
            {
                var ret = new ListNode(l1.val);
                ret.next = MergeWithoutDuplicatesWithoutDestroying(l1.next, l2);
                return ret;
            }
            else
            {
                var ret = new ListNode(l2.val);
                ret.next = MergeWithoutDuplicatesWithoutDestroying(l1, l2.next);
                return ret;
            }
        }

        private static ListNode Copy(ListNode n)
        {
            if (n == null)
            {
                return null;
            }

            var copy = new ListNode(n.val);
            copy.next = Copy(n.next);

            return copy;
        }

        public static ListNode Merge(ListNode l1, ListNode l2)
        {
            if (l1 == null)
            {
                return l2;
            }

            if (l2 == null)
            {
                return l1;
            }

            if (l1.val <= l2.val)
            {
                l1.next = Merge(l1.next, l2);
                return l1;
            }
            else
            {
                l2.next = Merge(l1, l2.next);
                return l2;
            }
        }

        public class ListNode
        {
            public int val;
            public ListNode next;

            public ListNode(int x)
            {
                val = x;
            }
        }
    }
}
