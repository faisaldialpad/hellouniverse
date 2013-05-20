package trees_graphs;

import java.util.ArrayList;

/**
 * A class for Graph Node.
 * Class contributors: Faisal Rahman
 * @author rfaisal
 *
 */
public class GNode<T> {
	T value;
	ArrayList<GNode<T>> neighbours; 
	public GNode(T value) {
		this.value=value;
		neighbours= new ArrayList<GNode<T>>();
	}
}
