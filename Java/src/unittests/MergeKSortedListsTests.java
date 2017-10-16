package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import linkedlists.MergeKSortedLists;

public class MergeKSortedListsTests {

	@Test
	public void testMerge() {
		assertNull(MergeKSortedLists.merge(null));
		assertNull(MergeKSortedLists.merge(new MergeKSortedLists.ListNode[] { }));

		MergeKSortedLists.ListNode l1 = new MergeKSortedLists.ListNode(1);
		l1.next =new MergeKSortedLists.ListNode(2);
		l1.next.next =new MergeKSortedLists.ListNode(4);
		
		MergeKSortedLists.ListNode l2 = new MergeKSortedLists.ListNode(3);
		l2.next =new MergeKSortedLists.ListNode(4);
		l2.next.next =new MergeKSortedLists.ListNode(5);
		
		MergeKSortedLists.ListNode l3 = new MergeKSortedLists.ListNode(2);
		l3.next =new MergeKSortedLists.ListNode(3);
		l3.next.next =new MergeKSortedLists.ListNode(6);

        

       assertEquals("1->2->2->3->3->4->4->5->6->", MergeKSortedLists.merge(new MergeKSortedLists.ListNode[] { l1, l2, l3 }).toString());
	}

}
