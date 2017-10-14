namespace HelloUniverse.LinkedLists
{
    public static class RemoveNthFromTheEnd
    {
        // leetcode checked
        // problem. Removing the head is hard. So, introduce a dummy node to the front of the list
        // problem. n is index 1 based instead of 0 based
        public static ListNode Remove(ListNode head, int n)
        {
            var dummy = new ListNode(0) {next = head};

            var first = dummy;
            var second = dummy;

            for (var i = 1; i <= n + 1; i++) // n+1 because of dummy and <= because of index 1 based
            {
                first = first.next; //problem gurantees that this would be possible otherwise check if first is null before moving.
            }

            while (first != null)
            {
                second = second.next;
                first = first.next;
            }
            
            //here second is pointing to the node before the removedNode

            second.next = second.next.next; //second.next should always be available

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
