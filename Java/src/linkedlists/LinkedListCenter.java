package linkedlists;

public class LinkedListCenter {
	public static LNode<Integer> find(LNode<Integer> head){
		//if less than equal 2
		if(head == null) return null;
		else if(head.next == null) return head;
		else{ //>2
			LNode<Integer> fast = head;
			LNode<Integer> slow = head;
			while(fast.next!=null && fast.next.next!=null){
				//if slow == fast then loop detected
				slow = slow.next;
				fast= fast.next.next;
			}
			return slow;
		}
	}
}
