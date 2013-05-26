package linkedlists;

public class FlattenListWithChild {
	private LNodeWithChild<Integer> head;
	public FlattenListWithChild(LNodeWithChild<Integer> head) {
		this.head=head;
	}
	public LNodeWithChild<Integer> flatten(){
		flattenRecursive(head);
		return head;
	}
	private static void flattenRecursive(LNodeWithChild<Integer> head){
		while(head!=null){
			if(head.child!=null){
				flattenRecursive(head.child);
				LNodeWithChild<Integer> t=head.child;
				while(t.next!=null) t=t.next;
				t.next=head.next;
				head.next=head.child;
				head.child=null;
			}
			head=head.next;
		}
	}

}
