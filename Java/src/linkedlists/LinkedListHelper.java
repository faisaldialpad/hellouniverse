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
    
    public static LNode startOfCircle(LNode head){
    	if(head == null)
    		return null;
    	LNode slow=head;
        LNode fast=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(fast.next==null) // checks if it breaks because of the end of while, if so there is no circle
            return null;
        fast=head;// used fast, since we no longer need it
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}