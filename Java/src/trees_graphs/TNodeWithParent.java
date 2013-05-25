package trees_graphs;

public class TNodeWithParent<K> {
    public K data;
    public TNodeWithParent<K> left=null;
    public TNodeWithParent<K> right=null;
    public TNodeWithParent<K> parent=null;
	public TNodeWithParent(K data) {
		this.data=data;
	}

}
