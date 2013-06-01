package stacks_queues;

import linkedlists.LNode;

public class Queue<E> {
	private LNode<E> head;
	private LNode<E> tail;
	private int length=0;
	public int length(){return length;} 
	public Queue() {
	}
	public void insert(E v){
		if(length==0){
			head= new LNode<E>(v);
			tail=head;
		}
		else{
			tail.next=new LNode<E>(v);
			tail=tail.next;
		}
		length++;
	}
	public E remove(){
		if(length==0) return null;
		else if(length==1){
			length=0;
			E ret = head.data;
			head=null;
			tail=null;
			return ret;
		}
		else{
			length--;
			E ret=head.data;
			head.data=head.next.data;
			head.next=head.next.next;
			return ret;
		}
	}
	public boolean isEmpty(){
		return length==0;
	}

}
