package trees_graphs;

public class InOrderSuccessor {
	private TNodeWithParent<Integer> node;
	public InOrderSuccessor(TNodeWithParent<Integer> node) {
		this.node=node;
	}
	public TNodeWithParent<Integer> find(){
		TNodeWithParent<Integer> current=node;
		if(current==null) return null;
		else if(current.parent==null || current.right != null) 
			return leftmost(current.right);
		else{
			TNodeWithParent<Integer> parent = current.parent;
			while(parent!=null){
				if(parent.left == current) return parent;
				else{
					current=parent;
					parent=current.parent;
				}
			}
			return null;
		}
	}
	private TNodeWithParent<Integer> leftmost(TNodeWithParent<Integer> r){
		if(r==null) return null;
		while(r.left!=null) r=r.left;
		return r;
	}

}
