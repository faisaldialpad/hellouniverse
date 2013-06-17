package trees_graphs;

public class InOrderBSTIterator {
	private TNode<Integer> current;
	private TNode<Integer> root;
	public InOrderBSTIterator(TNode<Integer> root) {
		this.root=root;
		current=leftmost(root);
	}
	private static TNode<Integer> leftmost(TNode<Integer> root){
		if(root==null||root.left==null){
			return root;
		}
		else{
			return leftmost(root.left);
		}
	}
	public TNode<Integer> getCurrent(){
		return current;
	}
	public TNode<Integer> next(){
		if(current==null){
			return null;
		}
		else if(current.right!=null){
			current = leftmost(current.right);
			return current;
		}
		else{
			TNode<Integer> temp=root;
			TNode<Integer> ret=null;
			while(temp!=null){
				if(temp.data>current.data){
					ret=temp;
					temp=temp.left;
				}
				else if(temp.data<current.data){
					temp=temp.right;
				}
				else{
					break;
				}
			}
			current=ret;
			return current;
		}
	}
	
}
