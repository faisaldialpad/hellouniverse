package trees_graphs;

import java.util.ArrayList;
/**
 * A class for Graph.
 * Class contributors: Faisal Rahman
 * @author rfaisal
 *
 * @param <T>
 */
public class Graph<T> {
	public ArrayList<GNode<T>> nodes;
	public Graph() {
		nodes= new ArrayList<GNode<T>>();
	}
}
