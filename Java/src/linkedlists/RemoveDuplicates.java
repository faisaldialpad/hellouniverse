package linkedlists;

import java.util.HashMap;


public class RemoveDuplicates {
	private LNode<Integer> head;
	public RemoveDuplicates(LNode<Integer> head) {
		this.head=head;
	}
	public void perform(){
		HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>();
		LNode<Integer> t=head;
		LNode<Integer> previous=head;
		while(t!=null){
			if(hash.get(t.data)!=null){
				previous.next=t.next;
			}
			else{
				hash.put(t.data, true);
				previous=t;
			}
			t=t.next;
		}
	}

}
