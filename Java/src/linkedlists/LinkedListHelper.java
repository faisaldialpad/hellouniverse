package linkedlists;
public class LinkedListHelper{
    public static boolean isCircular(LNode head){
    	if(head==null)
    		return false;
        LNode slow=head;
        LNode fast=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}