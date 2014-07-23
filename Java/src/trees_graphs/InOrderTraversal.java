package trees_graphs;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {
	public static ArrayList<Integer> traverseWithRecursion(TNode<Integer> root){
		if(root == null) return new ArrayList<Integer>();
		ArrayList<Integer> ret = new ArrayList<Integer>();
		ret.addAll(traverseWithRecursion(root.left));
		ret.add(root.data);
		ret.addAll(traverseWithRecursion(root.right));
		return ret;
	}
	public static ArrayList<Integer> traverseWithoutRecursion(TNode<Integer> root){
		Stack<TNode<Integer>> st = new Stack<TNode<Integer>>();
		ArrayList<Integer> ret = new ArrayList<Integer>();
		TNode<Integer> cur = root;
		while(cur.left != null){
			st.push(cur);
			cur= cur.left;
		}
		while(true){
			ret.add(cur.data);
			if(cur.right != null) {
				cur= cur.right;
				while(cur.left != null){
					st.push(cur);
					cur= cur.left;
				}
				ret.add(cur.data);
			}
			if(st.isEmpty()) break;
			else cur = st.pop();
		}
		return ret;
		
	}
}
