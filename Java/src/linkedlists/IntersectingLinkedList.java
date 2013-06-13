package linkedlists;

public class IntersectingLinkedList {

	public IntersectingLinkedList() {}
	
	public static boolean doesIntersect(LNode<Integer> l1, LNode<Integer> l2){
		if(l1==null || l2==null) return false;
		while(l1.next!=null) l1=l1.next;
		while(l2.next!=null) l2=l2.next;
		return l1==l2;
	}
	public static LNode<Integer> intersectingNode(LNode<Integer> l1, LNode<Integer> l2){
		int length1=getLength(l1);
		int length2=getLength(l2);
		int diff=length1-length2;
		while(diff>0){
			l1=l1.next;
			diff--;
		}
		while(diff<0){
			l2=l2.next;
			diff++;
		}
		while(l1!=null && l2!=null && l1!=l2){
			l1=l1.next;
			l2=l2.next;
		}
		return l1;
		
	}
	private static int getLength(LNode<Integer> list){
		int length=0;
		while(list!=null) {
			length++;
			list=list.next;
		}
		return length;
	}

}
