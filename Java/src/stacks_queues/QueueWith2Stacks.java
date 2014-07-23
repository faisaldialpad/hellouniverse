package stacks_queues;

import java.util.Stack;

import linkedlists.LNode;

public class QueueWith2Stacks<E> {
	private Stack<E> s1; // 5 
	private Stack<E> s2; //4 3 2 1
	public QueueWith2Stacks(){
		s1 = new Stack<E>();
		s2 = new Stack<E>();
	}
	public int length(){
		return s1.size() + s2.size();
	} 
	public boolean isEmpty(){
		return length()==0;
	}
	public void insert(E v){
		s1.push(v);
	}
	public E remove(){
		if(s2.empty()){
			if(s1.empty()) return null;//empty
			else{
				while(!s1.empty()) s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	public E peek(){
		if(s2.empty()){
			if(s1.empty()) return null;//empty
			else{
				while(!s1.empty()) s2.push(s1.pop());
			}
		}
		return s2.peek();
	}
}
