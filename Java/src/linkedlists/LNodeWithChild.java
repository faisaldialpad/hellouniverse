package linkedlists;
/**
* Class owner: Faisal Rahman
* Class contributors: Faisal Rahman
**/
public class LNodeWithChild<K>{
    public K data;
    public LNodeWithChild<K> next=null;
    public LNodeWithChild<K> child=null;
    public LNodeWithChild (K data){
        this.data=data;
    }
}