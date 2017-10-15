using System.Collections.Generic;

namespace HelloUniverse.Tests.LinkedLists
{
    public static class CopyListWithRandomPointer
    {
        public static RandomListNode CopyUsingMap(RandomListNode head)
        {
            if (head == null)
            {
                return null;
            }

            var map = new Dictionary<RandomListNode, RandomListNode>();
            var temp = head;
            while (temp != null)
            {
                map.Add(temp, new RandomListNode(temp.label));
                temp = temp.next;
            }

            foreach (var item in map)
            {
                item.Value.next = item.Key.next != null ? map[item.Key.next] : null;
                item.Value.random = item.Key.random != null ? map[item.Key.random] : null;
            }

            return map[head];
        }

        public static RandomListNode CopyWithoutMap(RandomListNode head)
        {
            if (head == null)
            {
                return null;
            }

            var temp = head;
            while (temp != null)
            {
                var next = temp.next;
                temp.next = new RandomListNode(temp.label)
                {
                    next = next
                };
                temp = next;
            }
            //A->B->C becomes A->A'->B->B'->C->C'

            temp = head;
            while (temp != null)
            {
                temp.next.random = temp.random?.next; //made a mistake here! forgot ?
                temp = temp.next.next;
            }
            //A'->random must be A->random->next or (A->random)'

            var copyHead = head.next;

            temp = head; //odd numbered
            var tempCopy = copyHead; //even numbered
            while (tempCopy?.next != null)
            {
                temp.next = tempCopy.next;
                temp = temp.next;
                tempCopy.next = temp.next;
                tempCopy = tempCopy.next;
            }

            temp.next = null; //forgot this
            //both lists separated

            return copyHead;
        }

        public class RandomListNode
        {
            public int label;
            public RandomListNode next, random;

            public RandomListNode(int x)
            {
                this.label = x;
            }
        };

    }
}
