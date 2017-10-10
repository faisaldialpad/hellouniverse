namespace HelloUniverse.LinkedLists
{
    public static class PalindromeLinkedList
    {
        // Cannot be done in O(n) time and O(1) space if not allowed to modify the input
        public static bool IsPalindrome(ListNode head)
        {
            if (head?.next == null) // 0 or 1 length is palendrome
            {
                return true;
            }

            //find middle
            var slow = head;
            var fast = head;
            while (fast?.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            //after this slow is the start of the 2nd half

            if (fast != null) //for odd number of items let 1st half be bigger.
            {
                slow = slow.next;
            }

            //reverse the 2nd half
            var temp = slow;
            slow = null;
            while (temp != null)
            {
                var next = temp.next;
                temp.next = slow;
                slow = temp;
                temp = next;
            }

            var first = head;
            var second = slow; //could reuse existing variables
            //check each
            while (second != null)
            {
                if (first.val != second.val)
                {
                    return false;
                }
                first = first.next;
                second = second.next;
            }

            return true; 
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
