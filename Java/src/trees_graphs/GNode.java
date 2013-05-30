package trees_graphs;

import java.util.ArrayList;

/**
 * A class for Graph Node.
 * Class contributors: Faisal Rahman
 * @author Faisal Rahman
 *
 */
public class GNode<T> {
	T value;
	GNodeStatus status;
	ArrayList<GNode<T>> neighbours; 
	public GNode(T value) {
		this.value=value;
		status = GNodeStatus.UNVISITED;
		neighbours= new ArrayList<GNode<T>>();
	}
}

enum GNodeStatus {VISITED, VISITING, UNVISITED};
