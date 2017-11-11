## Problems not yet implemented
1. Given a linked list which contains only values 0,1 and 2. Provide an efficient solution to sort the list. Values inside the nodes should not be changed. Only pointer manipulation is allowed. [Idea: 1. variation of bucket sort 2. In place is also possible]
2. Given 2 tree nodes, how will you determine if there is a path between them? [Idea: check if one node is the child of another (by bfs/dfs or any of the traversal)]
3. Find the pre order succcessor for a given node. [Idea: If the node has a left child then that's the preorder successor, else go up until you find a node that IS the left child, the right child of its parent is the preorder successor]
4. Find the post order successor for a given node. [Idea: if the current node is a right child then its parent is the post order successor, else leftmost of parent's right child]
