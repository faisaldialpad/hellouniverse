package trees_graphs;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * Not implemented yet.
 * Given an integer and a binary tree with each node containing a value. Design an algoritm that find all the paths that will sum up to that integer (a path does not necessarily originate from the root).
 * @author rfaisal
 *
 */
public class PathsSumToValueInTree {
	private TNode<Integer> root;
	private int value;
	public PathsSumToValueInTree(TNode<Integer> root,int value) {
		this.root=root;
		this.value=value;
	}
	public void getPaths(){
		//getPathsRecursive(root)
	}
	@SuppressWarnings("unchecked")
	public static void getPathsRecursive(TNode<Integer> current, int value, ArrayList<Integer> buffer, ArrayList<ArrayList<Integer>> result){
		if(current==null)
			return;
		value-=current.data;
		buffer.add(current.data);
		if(value==0)
			result.add(buffer);
		getPathsRecursive(current.left,value,(ArrayList<Integer>)buffer.clone(),result);
		getPathsRecursive(current.right,value,(ArrayList<Integer>)buffer.clone(),result);
	}

}
