package linkedlists;
/**
* Class owner: Faisal Rahman
* Class contributors: Faisal Rahman
**/
public class CircularList{
	LNode<Character> head;
    public CircularList(LNode<Character> head){
    	this.head=head;
    }
	public boolean isCircular(){
    	if(head==null)
    		return false;
    	LNode<Character> slow=head;
    	LNode<Character> fast=head;
	// in leet code following is done: while (slow != fast) { if (fast == null || fast.next == null) { return false; } ...}
	// our approach is correct too.
        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
    
    public LNode<Character> startOfCircle(){
    	if(head == null)
    		return null;
    	LNode<Character> slow=head;
    	LNode<Character> fast=head;
        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(fast== null || fast.next==null) // checks if it breaks because of the end of while, if so there is no circle
            return null;
        fast=head;// used fast, since we no longer need it
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public boolean isCircularAndDuplicate(){
        int []table= new int[4]; // initialized to 0
        boolean isCircular=false;
        boolean isDuplicate=false;
        LNode<Character> slow=head;
        LNode<Character> fast=head;
        while(fast!=null && fast.next!=null){
            if((table[slow.data/32]&(1<<(slow.data%32)))==0)
                table[slow.data/32]|=(1<<(slow.data%32)); //set the corresponding bit
            else
                isDuplicate=true;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isCircular= true;
                break;
            }
        } 
        // upto n-k values are checked for duplicate. If duplicate not found so far and it is circular then continue checking the rest.
        if(isCircular&&!isDuplicate){
            fast=head;
            while(slow!=fast){
                if((table[slow.data/32]&(1<<(slow.data%32)))==0)
                    table[slow.data/32]|=(1<<(slow.data%32));
                else
                    isDuplicate=true;
                slow=slow.next;
                fast=fast.next;
            }
        }
        return isDuplicate&&isCircular;
    }
}
