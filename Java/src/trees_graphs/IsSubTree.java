package trees_graphs;

public class IsSubTree {
	private TNode<Integer> bigTree;
	private TNode<Integer> smallTree;
	public IsSubTree(TNode<Integer> bigTree,TNode<Integer> smallTree) {
		this.bigTree=bigTree;
		this.smallTree=smallTree;
	}
	public boolean determine(){
		return determineRecursive(bigTree,smallTree);
	}
	public static boolean determineRecursive(TNode<Integer> bigTree,TNode<Integer> smallTree){
		if(smallTree==null) return true;
		else if(bigTree==null) return false;
		else if(bigTree.data.equals(smallTree.data))
			if(contains(bigTree,smallTree))
				return true;
		return determineRecursive(bigTree.left,smallTree) || determineRecursive(bigTree.right,smallTree);
	}
	public static boolean contains(TNode<Integer> bigTree,TNode<Integer> smallTree){
		if(smallTree==null) return true;
		else if(bigTree==null) return false;
		else if(bigTree.data.equals(smallTree.data)) 
			return contains(bigTree.left,smallTree.left) && contains(bigTree.right,smallTree.right);
		else return false;
	}

}
