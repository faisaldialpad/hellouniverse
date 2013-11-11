package trees_graphs;


/**
 * Binary Tree Leaves to Doubly Linked list
 */
public class BTLeavesToDLL {
	public static TNode<Integer> getLeaves(TNode<Integer> root){
		if(root==null){
			return null;
		}
		if(isLeaf(root)){
			return root;
		}
		else{
			TNode<Integer> left=getLeaves(root.left);
			if(left!=null){
				TNode<Integer> temp=left;
				while(temp.right!=null) temp=temp.right;
				temp.right=getLeaves(root.right);
				if(temp.right != null){//boundary
					temp.right.left=temp;
				}
				return left;
			}
			else{//boundary
				return getLeaves(root.right);
			}
		}
	}
	public static TNode<Integer> getLeavesAndTrimOriginal(TNode<Integer> root){
		return getLeavesAndTrimOriginalRec(root,null,false);
	}
	private static TNode<Integer> getLeavesAndTrimOriginalRec(TNode<Integer> root,TNode<Integer> parent,boolean isLeftChild){
		if(root==null){
			return null;
		}
		if(isLeaf(root)){
			if(parent!=null){
				if(isLeftChild) parent.left=null;
				else parent.right=null;
			}
			return root;
		}
		else{
			TNode<Integer> left=getLeavesAndTrimOriginalRec(root.left,root,true);
			if(left!=null){
				TNode<Integer> temp=left;
				while(temp.right!=null) temp=temp.right;
				temp.right=getLeavesAndTrimOriginalRec(root.right,root,false);
				if(temp.right != null){//boundary
					temp.right.left=temp;
				}
				return left;
			}
			else{//boundary
				return getLeavesAndTrimOriginalRec(root.right,root,false);
			}
		}
	}
	private static boolean isLeaf(TNode<Integer> root){
		if(root==null) return false; //if it is not a node it is not a leaf
		else return root.left == null && root.right==null;
	}
 
}
