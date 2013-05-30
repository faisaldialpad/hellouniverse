package trees_graphs;

import java.util.ArrayList;

public class BFS {
	private Graph<Integer> g;
	public BFS(Graph<Integer> g) {
		this.g=g;
	}
	public boolean find(int a){
		for(GNode<Integer> n:g.nodes){
			n.status=GNodeStatus.UNVISITED;
		}
		ArrayList<GNode<Integer>> queue= new ArrayList<GNode<Integer>>();
		queue.add(g.nodes.get(0));
		while(!queue.isEmpty()){
			GNode<Integer> n = queue.remove(queue.size()-1);
			n.status=GNodeStatus.VISITING;
			if(n.value==a) return true;
			for(GNode<Integer> n1:n.neighbours){
				if(n1.status == GNodeStatus.UNVISITED){
					queue.add(n1);
				}
			}
		}
		return false;
	}

}
