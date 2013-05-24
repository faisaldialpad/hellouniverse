package linkedlists;

public class LinkedListAdd {
	private LNode<Integer> num1;
	private LNode<Integer> num2;
	public LinkedListAdd(LNode<Integer> num1, LNode<Integer> num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public LNode<Integer> add() throws Exception{
		return addRecursive(num1, num2, 0);
	}
	private LNode<Integer> addRecursive(LNode<Integer> n1, LNode<Integer> n2,int carry) throws Exception{
		if((n1!=null&&(n1.data<0||n1.data>9))||(n2!=null&&(n2.data<0||n2.data>9)))
			throw new Exception("Bad List.");
		if(n1==null && n2==null){
			if(carry==0)
				return null;
			else
				return new LNode<Integer>(carry);
		}
		else if(n1==null && carry==0){
				return n2;
		}
		else if(n2==null && carry ==0){
			return n1;
		}
		else{		
			int sum = (n1!=null?n1.data:0)+(n2!=null?n2.data:0) +carry;
			LNode<Integer> ret= new LNode<Integer>(sum%10);
			ret.next=addRecursive(n1!=null?n1.next:null,n2!=null?n2.next:null,sum/10);
			return ret;
		}
	}

}
