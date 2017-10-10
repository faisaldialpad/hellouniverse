namespace HelloUniverse.LinkedLists
{
    public static class RemoveCurrentNodeFromLinkedList
    {
        public static void RemoveCurrentNode(ListNode node)
        {
            if (node?.next == null) // null node and tail node cannot be deleted
            {
                return;
            }
            node.val = node.next.val;
            node.next = node.next.next;
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
