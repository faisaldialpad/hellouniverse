package linkedlists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static ListNode merge(ListNode[] lists) {
    	if (lists == null || lists.length == 0)
        {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				return Integer.compare(o1.val, o2.val);
			}
		});
        
        for(int i=0;i<lists.length;i++) {
        	if(lists[i]!= null) {
        		pq.add(lists[i]);
        	}
        }
        
        ListNode merged= new ListNode(0); //dummy
        ListNode temp = merged;
        while(!pq.isEmpty()) {
        	ListNode min = pq.poll();
        	temp.next = min;
        	if(min.next != null) {
        		pq.add(min.next);
        	}
        	
        	temp= temp.next;
        }
        
        temp.next = null;
        
        return merged.next;
    }
    
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
        
        public String toString()
        {
            ListNode temp = this;
            StringBuilder sb = new StringBuilder();
            while (temp != null)
            {
            	sb.append(temp.val);
                sb.append("->");
                temp = temp.next;
            }
            return sb.toString();
        }
    }
}
