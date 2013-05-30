package trees_graphs;

import java.util.ArrayList;



public class Heap {
	ArrayList<Integer> tree;
	public Heap(int [] elements) {
		tree= new ArrayList<Integer>();
		if(elements!=null)
			for(int i:elements)
				tree.add(i);
		buildHeap();
	}
	public void insert(int num){
		tree.add(num);
		bubble_up(tree.size()-1);
	}
	public int getMin() throws Exception{
		if(tree.isEmpty()) throw new Exception("Heap Empty.");
		return tree.get(0);
	}
	public int removeMin() throws Exception{
		if(tree.isEmpty()) throw new Exception("Heap Empty.");
		else if(tree.size()==1)
			return tree.remove(0);
		else{
			int t= tree.get(0);
			tree.set(0,tree.remove(tree.size()-1));
			bubble_down(0);
			return t;
		}
	}
	private void buildHeap(){
		for(int i=(int)Math.floor(tree.size()/2)-1;i>=0;i--){
			bubble_down(i);
		}
	}
	private void bubble_up(int i){
		if(i==0) return;
		else if(tree.get(i)<tree.get((int)i/2)){
			int t=tree.get(i);
			tree.set(i, tree.get((int)i/2));
			tree.set((int)i/2, t);
			bubble_up((int)i/2);
		}
		//else return;
	}
	private void bubble_down(int i){
		if(2*i+1<=tree.size()-1){
			int min_i;
			if(tree.get(2*i)>tree.get(2*i+1)) min_i=2*i+1;
			else min_i=2*i;
			if(tree.get(i)>tree.get(min_i)){
				int t=tree.get(i);
				tree.set(i, tree.get(min_i));
				tree.set(min_i, t);
				bubble_down(min_i);
			}
			//else	return;
		}
		else if(2*i==tree.size()-1){
			if(tree.get(i)>tree.get(2*i)){
				int t=tree.get(i);
				tree.set(i, tree.get(2*i));
				tree.set(2*i, t);
			}
			//else	return;
		}
		//else	return;
	}

}
