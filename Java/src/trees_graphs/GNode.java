package trees_graphs;

import java.util.ArrayList;
import java.util.HashMap;

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
	HashMap<GNode<T>, Integer> distanceMap;
	public GNode(T value) {
		this.value=value;
		status = GNodeStatus.UNVISITED;
		neighbours= new ArrayList<GNode<T>>();
		distanceMap=new HashMap<GNode<T>, Integer>();
	}
}

enum GNodeStatus {VISITED, VISITING, UNVISITED};
