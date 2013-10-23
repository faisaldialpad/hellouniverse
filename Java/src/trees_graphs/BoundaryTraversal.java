package trees_graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class BoundaryTraversal {
	public static ArrayList<TNode<Integer>> perform(TNode<Integer> root){
		ArrayList<TNode<Integer>> ret= new ArrayList<TNode<Integer>>();
		ret.addAll(traverseLeftSideTopDown(root));
		ret.addAll(traverseBottomSideLeftRight(root));
		if(root!=null){
			ret.addAll(traverseRightSideBottomUp(root.right));//for excluding root
		}
		return ret;
	}
	/**
	 * Including root, excluding leaf
	 */
	private static LinkedList<TNode<Integer>> traverseLeftSideTopDown(TNode<Integer> root){
		if(root == null || isLeaf(root)) return new LinkedList<TNode<Integer>>();
		else {
			LinkedList<TNode<Integer>> temp= traverseLeftSideTopDown(root.left);
			temp.addFirst(root);
			return temp;
		}
	}
	/**
	 * Including root, excluding leaf
	 */
	private static ArrayList<TNode<Integer>> traverseRightSideBottomUp(TNode<Integer> root){
		if(root == null || isLeaf(root)) return new ArrayList<TNode<Integer>>();
		else {
			ArrayList<TNode<Integer>> temp= traverseRightSideBottomUp(root.right);
			temp.add(root);
			return temp;
		}
	}
	/**
	 * All Leaves
	 */
	private static ArrayList<TNode<Integer>> traverseBottomSideLeftRight(TNode<Integer> root){
		if(root==null){
			return new ArrayList<TNode<Integer>>();
		}
		if(isLeaf(root)){
			ArrayList<TNode<Integer>> curLeaf=new ArrayList<TNode<Integer>>();
			curLeaf.add(root);
			return curLeaf;
		}
		ArrayList<TNode<Integer>> leftHalf=traverseBottomSideLeftRight(root.left);
		ArrayList<TNode<Integer>> rightHalf=traverseBottomSideLeftRight(root.right);
		leftHalf.addAll(rightHalf);
		return leftHalf; 
	}
	private static boolean isLeaf(TNode<Integer> root){
		return root!=null && root.left==null && root.right==null;
	}
}
