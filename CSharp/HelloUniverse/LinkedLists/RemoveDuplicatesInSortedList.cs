namespace HelloUniverse.LinkedLists
{
    public static class RemoveDuplicatesInSortedList
    {
        public static ListNode RemoveDuplicate(ListNode list)
        {
            if (list == null)
            {
                return null;
            }

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
