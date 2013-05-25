package trees_graphs;

import java.util.ArrayList;

public class LevelWiseBFSonTree {
	private TNode<Integer> root;
	public LevelWiseBFSonTree(TNode<Integer> root) {
		this.root=root;
	}
	public ArrayList<ArrayList<TNode<Integer>>> calculate(){
		ArrayList<ArrayList<TNode<Integer>>> ret = new ArrayList<ArrayList<TNode<Integer>>>();
		int level=0;
		ArrayList<TNode<Integer>> current = new ArrayList<TNode<Integer>>();
		current.add(root);
		while(current.size()>0){
			ret.add(level,current);
			current = new ArrayList<TNode<Integer>>();
			for(int i=0;i<ret.get(level).size();i++){
				if(ret.get(level).get(i).left!=null)
					current.add(ret.get(level).get(i).left);
				if(ret.get(level).get(i).right!=null)
					current.add(ret.get(level).get(i).right);
			}
			level++;
		}
		return ret;
	}

}
