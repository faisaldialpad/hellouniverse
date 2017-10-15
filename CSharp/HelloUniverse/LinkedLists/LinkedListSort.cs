using System.Collections.Generic;

namespace HelloUniverse.LinkedLists
{
    public class LinkedListSort
    {
        #region quick sort
        public static ListNode QuickSort(ListNode head)
        {
            return QuickSort(head, out var tail);
        }

        private static ListNode QuickSort(ListNode head, out ListNode tail)
        {
            if (head?.next == null)
            {
                tail = head;
                return head; //already sorted
            }

            var pivot = head;
            ListNode left = null;
            ListNode right = null;

            var pivotTemp = pivot;
            ListNode leftTemp = null;
            ListNode rightTemp = null;

            var temp = head;
            temp = temp.next;

            while (temp != null)
            {
                if (temp.val < pivot.val)
                {
                    if (left == null)
                    {
                        left = temp;
                        leftTemp = temp;
                    }
                    else
                    {
                        leftTemp.next = temp;
                        leftTemp = leftTemp.next;
                    }
                }
                else if (temp.val > pivot.val)
                {
                    if (right == null)
                    {
                        right = temp;
                        rightTemp = temp;
                    }
                    else
                    {
                        rightTemp.next = temp;
                        rightTemp = rightTemp.next;
                    }
                }
                else //optimization group all equal items together
                {
                    pivotTemp.next = temp;
                    pivotTemp = pivotTemp.next;
                }

                temp = temp.next;
            }

            if (leftTemp != null)
            {
                leftTemp.next = null;
            }

            if (rightTemp != null)
            {
                rightTemp.next = null;
            }

            var sortedLeft = QuickSort(left, out var leftTail);
            var sortedRight = QuickSort(right, out var rightTail);

            tail = rightTail ?? pivotTemp; //tail calculation is the hardest part

            if (leftTail != null)
            {
                leftTail.next = pivot;
                pivotTemp.next = sortedRight;

                return sortedLeft;
            }
            else
            {
                pivotTemp.next = sortedRight;
                return pivot;
            }
        }
        #endregion

        #region merge sort
        public static ListNode MergeSort(ListNode head)
        {
            if (head?.next == null)
            {
                return head; //already sorted
            }

            var fast = head;
            var slow = head;
            var prevSlow = head;
            while (fast?.next != null)
            {
                prevSlow = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            if (prevSlow != null)
            {
                prevSlow.next = null;
            }

            var firstHalfSorted = MergeSort(head);
            var secondHalfSorted = MergeSort(slow);

            return Merge(firstHalfSorted, secondHalfSorted);
        }

        //recursive merge results in stackoverflow in leetcode.
        private static ListNode Merge(ListNode l1, ListNode l2)
        {
            if (l1 == null)
            {
                return l2;
            }

            if (l2 == null)
            {
                return l1;
            }

            var dummy = new ListNode(0);
            var temp = dummy;
            while (l1 != null && l2 != null)
            {
                if (l1.val < l2.val)
                {
                    temp.next = l1;
                    l1 = l1.next;
                }
                else
                {
                    temp.next = l2;
                    l2 = l2.next;
                }
                temp = temp.next;
            }

            if (l1 != null)
            {
                temp.next = l1;
            }
            else if (l2 != null) // why resharper saying this is always true
            {
                temp.next = l2;
            }
            else
            {
                temp.next = null;
            }

            return dummy.next;
        }

        #endregion
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
