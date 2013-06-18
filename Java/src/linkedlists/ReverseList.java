package linkedlists;

public class ReverseList {
	public static LNode<Integer> perform(LNode<Integer> head){
		if(head==null) return null;
		LNode<Integer> ret=head;
		head=head.next;
		ret.next=null;
		while(head!=null){
			LNode<Integer> temp=head;
			head=head.next;
			temp.next=ret;
			ret=temp;
		}
		return ret;
	}
}
