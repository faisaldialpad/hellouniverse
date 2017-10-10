namespace HelloUniverse.LinkedLists
{
    public static class RemoveDuplicatesInSortedList
    {
        public static ListNode RemoveDuplicate(ListNode list)
        {
            //null check not needed
            var temp = list;
            while (temp != null)
            {
                var dup = temp.next;
                while (dup != null && dup.val == temp.val)
                {
                    dup = dup.next;
                }

                temp.next = dup;
                temp = temp.next;
            }

            return list;
        }

        public static ListNode RemoveDuplicateOptimized(ListNode list)
        {
            //null check not needed
            var temp = list;
            while (temp?.next != null) //both temp and next not null
            {
                if (temp.val == temp.next.val)
                {
                    temp.next = temp.next.next; // keep temp and only remove next
                }
                else
                {
                    temp = temp.next;
                }
            }

            return list;
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
