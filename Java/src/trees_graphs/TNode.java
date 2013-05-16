package trees_graphs;



/**
* Class owner: Faisal Rahman
* Class contributors: Faisal Rahman
**/
public class TNode<K>{
    public K data;
    public TNode<K> left=null;
    public TNode<K> right=null;
    public TNode (K data){
        this.data=data;
    }
}