namespace HelloUniverse.LinkedLists
{
    public static class RemoveValuesFromLinkedList
    {
        public static ListNode Remove(ListNode head, int val)
        {
            var dummy = new ListNode(0)
            {
                next = head
            };

            var prev = dummy;
            var current = dummy.next;

            while (current != null)
            {
                if (current.val == val)
                {
                    prev.next = current.next;
                }
                else
                {
                    prev = prev.next;
                }

                current = current.next;
            }

            return dummy.next;
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
