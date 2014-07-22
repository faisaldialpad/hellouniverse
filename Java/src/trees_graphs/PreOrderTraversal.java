package trees_graphs;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {
	public static ArrayList<Integer> traverseWithRecursion(TNode<Integer> root){
		if(root == null) return new ArrayList<Integer>();
		ArrayList<Integer> ret = new ArrayList<Integer>();
		ret.add(root.data);
		ret.addAll(traverseWithRecursion(root.left));
		ret.addAll(traverseWithRecursion(root.right));
		return ret;
	}
	public static ArrayList<Integer> traverseWithoutRecursion(TNode<Integer> root){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		Stack<TNode<Integer>> st = new Stack<TNode<Integer>>();
		st.push(root);
		while(!st.isEmpty()){
			TNode<Integer> cur = st.pop();
			if(cur.right != null) st.push(cur.right);
			if(cur.left != null) st.push(cur.left);
			ret.add(cur.data);
		}
		return ret;
		
	}
}
