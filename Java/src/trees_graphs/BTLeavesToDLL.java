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
	private static boolean isLeaf(TNode<Integer> root){
		if(root==null) return false; //if it is not a node it is not a leaf
		else return root.left == null && root.right==null;
	}
 
}
