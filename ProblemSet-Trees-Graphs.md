# Problem Set

## Other Problem Sets
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-Arrays-ArrayLists.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-Bitwise-Math.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-Dynamic-Programming.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-LinkedLists.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-Others.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-String.md

## Trees and Graphs
1. Implement a tree and a in-order-traversal. Implement a function to return the first common ancestor (fca) of any 2 given nodes. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/trees_graphs/tree_inorder_fca.c
2. Implement a tree and a in-order-traversal. Assuming the tree is a Binary Search Tree, implement a function to return the first common ancestor (fca) of any 2 given nodes. For this problem you can assume that both values exist in the tree, so no need to check for those cases. 
    * Link: http://www.geeksforgeeks.org/lowest-common-ancestor-in-a-binary-search-tree/
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/trees_graphs/bst_inorder_fca.c
3. Do an in order traversal of a binary tree. Can you do it without using recursion?  [unit tests are coming]
    * Link: http://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/TreeTraversal.java
4. Check if a binary tree is balanced or not. A balanced tree is defined to be a tree such that no 2 leaf nodes differ in distance from the root by more than 1.  [unit tests are coming]
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/IsBalancedTree.java
5. Given a sorted (increasing order) array, make a BST with minimal height. [unit tests are coming]
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/BSTfromSortedArray.java
6. Given a binary tree, design an algorithm that will create a list of all the nodes at each depth, i.e., if the tree is of depth `d` then there will be `d` lists.  [unit tests are coming]
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/LevelWiseBFSonTree.java
7. Design an algorithm to find the in-order-successor of a given node, i.e., the node that will come next if we do an in-order traversal. Each node has a link to its parent.  [unit tests are coming]
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/InOrderSuccessor.java
8. Create an algorithm to determine if a binary tree is a sub-tree of another binary tree. Both trees are very big with millions of nodes.  [unit tests are coming]
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/IsSubTree.java
9. Write an algorithm to check if a tree is a BST or not. Check for the case that all the nodes in the left subtree must be less than the root and all the node in the right subtree must be greater than the root. For example, if a tree is represented by an array then `[*,4,2,6,1,100,5,7]` is not a BST, but  `[*,4,2,6,1,3,5,7]` is. 
    * Tags: Amazon
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/IsBST.java
10. A Trie is a prefex tree of created by string. Implement the `get(String key)` and `put(int value, String key)` methods of a trie, so that it is similar to a `HashMap<String>`. 
    * Tags: Microsoft
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/Trie.java
11. Given a graph `g` with each node containing an integer, find a value in the graph using the BFS algorithm.  [unit tests are coming]
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/BFS.java
12. Given a graph `g` with each node containing an integer, find a value in the graph using the DFS algorithm.  [unit tests are coming]
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/DFS.java
13. Design a min binary heap data structure with add, removeMin, getMin functions. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/Heap.java
14. Design HeapSort algorithm using the heap created in Question 11. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/HeapSort.java
15. If a Tree Node of a BST have only left and right child pointer but no parent pointer. Write a iterator for the BST with `next()` function that returns the next node (in order successor) of the current node. When the iterator is initialized with the root of the BST the current node (the first node) becomes the left most node of the tree. `InOrderBSTIterator.java`
    * Tags: Google
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/InOrderBSTIterator.java
16. Given a binary tree, print boundary nodes of the binary tree Anti-Clockwise starting from the root.
    * Tags: Amazon
    * Link: http://www.geeksforgeeks.org/boundary-traversal-of-binary-tree/
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/BoundaryTraversal.java
17. Given a binary tree, extract the leaves and put them in a doubly linked list (You can use your tree node as the doubly linked list). Also, put a logic to trim the original tree of the leaves.
    * Link: http://www.geeksforgeeks.org/connect-leaves-doubly-linked-list/
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/BTLeavesToDLL.java
18. Given two arrays and we will make 2 Binary Search Tree (BST) from each array by calling the `add` method. We need to tell whether two BSTs will be identical or not without actually constructing the tree.
    * Link: http://www.geeksforgeeks.org/check-for-identical-bsts-without-building-the-trees/
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/IsSameBST.java

19. Given a tree do a preorder traversal of the tree (both recursively and iteratively).
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/PreOrderTraversal.java

20. Given a tree do a postorder traversal of the tree (both recursively and iteratively).
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/PostOrderTraversal.java

21. Given a tree do a inorder traversal of the tree (both recursively and iteratively).
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/InOrderTraversal.java

[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/rfaisal/hellouniverse/trend.png)](https://bitdeli.com/free "Bitdeli Badge")
