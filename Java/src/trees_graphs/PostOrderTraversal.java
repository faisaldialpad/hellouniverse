package trees_graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
	public static List<Integer> traverseWithRecursion(TNode<Integer> root){
		if(root == null) return new ArrayList<Integer>();
		ArrayList<Integer> ret = new ArrayList<Integer>();
		ret.addAll(traverseWithRecursion(root.left));
		ret.addAll(traverseWithRecursion(root.right));
		ret.add(root.data);
		return ret;
	}
	public static List<Integer> traverseWithoutRecursion(TNode<Integer> root){
		Stack<TNode<Integer>> st = new Stack<TNode<Integer>>();
		LinkedList<Integer> ret = new LinkedList<Integer>();
		st.push(root);
		while(!st.isEmpty()){
			TNode<Integer> cur = st.pop();
			if(cur.left != null) st.push(cur.left);
			if(cur.right != null) st.push(cur.right);
			ret.addFirst(cur.data);
		}
		return ret;
		
	}
}
