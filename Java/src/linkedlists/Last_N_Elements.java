package linkedlists;


public class Last_N_Elements {
	LNode<Integer> list;
	public Last_N_Elements(LNode<Integer> list) {
		this.list=list;
	}
	public LNode<Integer> calculate(int n){
		LNode<Integer> t1=list;
		LNode<Integer> t2=list;
		while(t1!=null && n>0){
			t1=t1.next;
			n--;
		}
		if(n>0)
			return t2;
		else{
			while(t1!=null){
				t1=t1.next;
				t2=t2.next;
			}
		}
		return t2;
	}

}
