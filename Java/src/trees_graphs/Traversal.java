package trees_graphs;

import java.util.Stack;

public class Traversal {
	public static void inOrderWithoutRecursion(TNode<Integer> parent){
		TNode<Integer> current= parent;
		Stack<TNode<Integer>> stack =new Stack<TNode<Integer>>();
		while(true){
			if(current.left!=null){
				stack.push(current);
				current=current.left;
			}
			else{
				System.out.print(current.data);
				if(!stack.isEmpty())
					current=stack.pop();
				else
					break;
				System.out.print(current.data);
				current=current.right;
			}
		}
	}
	public static void inOrder(TNode<Integer> parent){
		if(parent==null)
			return;
		inOrder(parent.left);
		System.out.print(parent.data);
		inOrder(parent.right);
	}
	public static void main(String[] args) {
		TNode<Integer> tree= new TNode<Integer>(1);
		tree.left=new TNode<Integer>(2);
		tree.right=new TNode<Integer>(3);
		tree.left.left=new TNode<Integer>(4);
		tree.left.right=new TNode<Integer>(5);
		tree.right.left=new TNode<Integer>(6);
		tree.right.right=new TNode<Integer>(7);
		tree.left.left.left=new TNode<Integer>(8);
		tree.left.left.right=new TNode<Integer>(9);
		tree.left.right.left=new TNode<Integer>(10);
		tree.left.right.right=new TNode<Integer>(11);
		tree.right.left.left=new TNode<Integer>(12);
		tree.right.left.right=new TNode<Integer>(13);
		tree.right.right.left=new TNode<Integer>(14);
		tree.right.right.right=new TNode<Integer>(15);
		inOrder(tree);
		System.out.println("");
		inOrderWithoutRecursion(tree);
	}
}
