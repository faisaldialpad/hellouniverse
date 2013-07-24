# Hello Universe


The Hello Universe is a project with a collection of fun and thought provoking programming problems. You are welcome to use this project to analyze and grow your core programming skills. This project focuses less on good programming practices (that's why sometimes you will see codes like `c>=65 && c<=65+26` instead of `isupper(c)`), but more on the problem itself, the right data structures for the problem, the best algorithm to use in terms of time and space complexities. These types of questions are most common in first year programming courses and programming interviews, but solving these problems are necessary skills for a good programmer. The primary languages for this project is C and Java. If I need to use existing data structures, I will probably be using Java, and for simple problems I will probably be using C. Please feel free to improve upon my code.

## Contributing
#### Where can you contribute as a starter?
1. If you go through the Java/src/unittests folder you will see that some of the tests are not implemented (there is a default fail). It means that although I think that the algorithm is correct, but I did not fully test it. To find these tests you can just run the TestSuite.java and the tests that fails are not implemented. You can start contributing to this project by writing those tests. Just make sure that you work on one class at a time and when you are satisfied with that class you can send a pull request.
2. Go to the section "Problems not yet implemented". Start implementing those. If you use C or Java, then I will add your contribution to this project. 

#### How to contribute
1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`). 
3. Contribute and Commit your changes (`git commit -am 'Added some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create new Pull Request

## Recognition

* **Brian Kernighan**, **Dennis Ritchie**: Some problems (and the solutions) are from the K&R book.
* **Brian Dean**. Some Dynamic programming problems. http://people.csail.mit.edu/bdean/6.046/dp/
* **Project Euler**. Some math problems. http://projecteuler.net/
* **CareerCup**. Some actual interview questions. http://careercup.com

## Problems not yet implemented
1. Given a linked list which contains only values 0,1 and 2. Provide an efficient solution to sort the list. Values inside the nodes should not be changed. Only pointer manipulation is allowed. [Idea: 1. variation of bucket sort 2. In place is also possible]
2. Given 2 tree nodes, how will you determine if there is a path between them? [Idea: check if one node is the child of another (by bfs/dfs or any of the traversal)]
3. Find the pre order succcessor for a given node. [Idea: If the node has a left child then that's the preorder successor, else go up until you find a node that IS the left child, the right child of its parent is the preorder successor]
4. Find the post order successor for a given node. [Idea: if the current node is a right child then its parent is the post order successor, else leftmost of parent's right child]
5. Iteratively do a pre order traversal of a tree. [Idea: You will need a stack] 
6. Iteratively do a post order traversal of a tree. [Idea: You will need 2 stacks] 
7. Given 2 arrays.Imagine you are making bst from each array.u need to tell whether 2 bsts will be identical or not without actually constructing the tree. Ex: 1 2 3 and 1 3 2 will construct the same tree. [Idea: The 1st element is the root, elements less that root will be in the left subtree and elements grater than root will be in the right subtree]


## Questions

### Strings
1. Reverse a string. 
    * Link: http://hellouniverseproblems.wordpress.com/2013/07/13/string-1/
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/strings/str_rev.c
2. Remove all the duplicate chars of a string.
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/strings/duplicates_remove.c
3. Return the first duplicate char of a string with `O(n)` time.
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/strings/duplicate_char_first.c
4. Remove extra space in a string. Ex: `"(5 spaces)abc(10 spaces)def(1 space)" --> "(1 space)abc(1 space)def(1 space)"`. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/strings/extra_space_remove.c
5. Detect if 2 strings are anagrams of each other or not with `O(n)` time. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/strings/is_anagram.c
6. Detect if one string is a substring of another string or not. Using `isSubstring()` method only, check if 2 strings are rotations of each other or not. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/strings/is_substring_is_rotation.c
7. Replace each space of a string with `%20`. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/strings/space_encode.c
8. Concat two strings and save the result to the first string. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/strings/str_cat.c
9. Copy a source string to a destination string. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/strings/str_cpy.c
10. Find the length of a string. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/strings/str_len.c
11. Recursively find the length of a string, the number of upper case, lower case charecters and vowels in a string. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/strings/str_len_upper_lower_vowel_count_recursive.c
12. Return the first non-repeating char of a string with `O(n)` time. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/strings/non_repeating_char_first.c
13. Write a function that takes 2 strings and removes everything from 1st string that exists in 2nd string. For example, `remove("asdadasewss","aeiou");` removes all the vowels. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/strings/remove_from_2nd_string.c
14. Write a recursive function that will take a string and duplicate each char in each iteration (running duplicate). E.g., `Hello-->HH HHee HHeell HHeellll HHeelllloo`. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/RunningDuplicate.java
15. Write a string add function. `StringAdd.java`
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/StringAdd.java
16. Calculate how many rotations of a string is same as the original string. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/IdenticalRotations.java
17. Reverse a sentence. For example: `"Hello, how are you?"-->"you? are how Hello,"`. Can you also do this in place? 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/ReverseSentence.java
18. Reverse only words in a sentence. For example: `"Hello, how are you?"-->",olleH woh era ?uoy"`. You must do this in place. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/ReverseWordsInSentence.java
19. Convert an `int` to a `String`. You can assume that the input is within integer limit and it can be negative. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/ItoA.java
20. Write a function that returns all the possible combinations of a string.E.g., `aab-->[aab,aba,baa]` 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/StringPermutation.java
21. Write a function that takes a phone number, and returns all possibilities of words possible with that phone number by the phone key board. For example, if `8662665` is one such phone number then `TOOCOOL` is one of the possibilities. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/PhoneKeyboardWordsList.java
22. Write a simple regular expression matcher. * Matches with 0 or more instances of any character or set of characters, and ? Matches with any one character. For example, "g*k?" and "geeks" matches. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/SimpleRegEx.java
23. Write a simple regular expression matcher. a* means 0 or more a characters =>{}, a, aa, ,aaaa, aaaaa, etc, and .* means => zero or more characters of anything => {}, siasv98, sdif239047, 9384fievfi etc. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/KindOfSimpleRegEx.java
24. A sentence is called dancing if its first letter is uppercase and the case of each subsequent letter is the opposite of the previous letter. Spaces should be ignored when determining the case of a letter. For example, "A b Cd" is a dancing sentence. Given a sentence, convert it to dancing. 
    * Link: http://community.topcoder.com/stat?c=problem_statement&pm=5950&rd=8076
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/DancingSentence.java
25. Rearrange letters of the given string so that it becomes a palindrome. Each character in baseString will be an uppercase letter ('A'-'Z'). 
    * Link: http://community.topcoder.com/stat?c=problem_statement&pm=5881&rd=8071
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/PalindromeMaker.java
26. A series of brackets is complete if we can pair off each left bracket '[' with a right bracket ']' that occurs later in the series. Given a String text add the minimal number of brackets to the beginning and/or end of text to make it complete. E.g., "]["-->"[][]". 
    * Link: http://community.topcoder.com/stat?c=problem_statement&pm=5977
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/CompletingBrackets.java
27. Write a simple Spam Detector. 
    * Link: http://community.topcoder.com/stat?c=problem_statement&pm=2229
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/SimpleSpamDetector.java


### Arrays and ArrayLists
1. Given a MxN matrix. If a cell is 0 make the entire row and column corresponding to that cell to 0. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/arrays/matrix_filter_by_zero.c
2. Given a NxN pixel image, where each pixel is 4 bytes (therefore the image can be represented by a NxN integer matrix). Rotate by 90 degree in place. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/arrays/matrix_in_place_rotation.c
3. Given a MxN matrix that is sorted in both rows and columns. Find an element in it. The algorithm should run in O(M+N) time. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/arrays/matrix_linear_search.c
4. Find a specific integer in a sorted array (binary search). `search_binary.c`
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/arrays/search_binary.c
5. Find a specific integer in a sorted (in increasing order) array that is rotated unknown number of times. The algorithm should run in `log(n)` time. Ex.  `Arr=[45 67 76 88 90 95 1 5 6 9 12 37], n=6 -->8`. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/arrays/search_binary_rotated_sorted_array.c
6. Given an array of integers such that each element is either +1 or -1 to its preceding element. Find 1st occurrence of a given number in that array without using linear search.Ex. `Arr=[1 2 1 2 3 4 5 6 7 6 5 4 5 6 7 8 9],n=7-->8`. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/arrays/search_element_in_a_stepwise_array.c
7. A sequence increases, reach a max and then decreases, like `[45 67 76 88 90 95 47 12 9 7 6 5 4 3 2 1]`. Find the max. (An array sorted in an ascending order and another array sorted in descending order are concatenated together. Find the max. Either array can be empty.). 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/arrays/search_max_in_increasing_then_decreasing_seq.c
8. Given an array A and a number n, if the n is in A then return the next bigger number than n. All the other cases return -1. Ex: `A={3,2,7,6},n=1 --> -1, A={3,2,7,6},n=3 --> 7, A={3,2,7,6},n=7 --> -1, A={3,2,7,6},n=2 --> 7`. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/arrays/search_next_bigger_num.c
9. Write a function which will return the permutations of integers (with all duplicates). E.g., `[2 2]-->[[2 2],[2 2]]`. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/arrays/Permutation.java
10. Write a function which will return the permutations of integers without any duplicates. E.g., `[1 2 2]-->[[1 2 2],[2 2 1],[2 1 2]]`. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/arrays/Permutation.java
11. Given an array, find the Max Length Contiguous Sequential Integers. e.g., `[3 1 2 5]-->[1 2]`.
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/arrays/MaxLengthContiguousSequentialIntegers.java
12. Given an array, sort it using quick sort. Also, implement a in-place quick sort. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/arrays/QuickSort.java
13. Given an array, sort it using merge sort. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/arrays/MergeSort.java
14. Given an array of size `n`, find the `m`th smallest element (aka implement the selection algorithm). 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/arrays/SelectionAlgorithm.java
15. Given a set, find all the subsets. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/arrays/Subset.java
16. Given a series of integers. How we find a pair of numbers that sums to 1000.  
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/arrays/ComplementPair.java
17. Given an array containing time required to perform tasks. If 2 persons starts performing from both end of the array, how many tasks will each person perform?  
    * Link: http://codeforces.com/problemset/problem/6/C
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/arrays/Codeforces6C.java
18. Given an int array of digits (0-9). Build an integer with the minimum number of factors, using each of the digits exactly once (count all factors, not just the prime factors). If more than one solution, return the smallest. 
    * Link: http://community.topcoder.com/stat?c=problem_statement&pm=5886
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/arrays/FewestFactors.java
19. There is one friendly number and N unfriendly numbers. Find how many numbers are there which exactly divide the friendly number, but does not divide any of the unfriendly numbers.
    * Link: https://www.hackerrank.com/challenges/unfriendly-numbers
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/arrays/UnfriendlyNumbers.java

### LinkedLists
1. Implement a singly linked list with `add(int v, int pos)`, `remove(int pos)`, and `print()` functionalities. Write a function to remove a linked list node when you only have access to that node. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/linkedlists/singly__add__remove__remove_without_head.c
2. How will you detect a corrupt singly linked list (a linked list that has a circle in it, i.e., an arbitrary node's next pointer points to an earlier node)? 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/linkedlists/CircularList.java
3. Return the starting node of a circle and null if it is not circular. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/linkedlists/CircularList.java
4. Write a function that will return true if a circular singly linked list has duplicate values and false if there are no duplicate values or the linked list is not circular. You can assume that the values are ascii characters ranging from 0 to 127. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/linkedlists/CircularList.java
5. Add 2 numbers represented by linked lists: each node contains a digit and the digits are reverse order. For example: 123 is represented by 3->2->1 and 905 is represented by 5->0->9 and their addition will be 8->2->0->1 i.e., 1028. You are allowed to traverse each list only once. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/linkedlists/LinkedListAdd.java
6. Implement an algorithm to find the last n elements of a singly linked list. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/linkedlists/Last_N_Elements.java
7. Suppose a weird singly linked list has a child pointer that can point to a Node i.e., another linked list (which also has a child pointer). Flatten the list. (if a node has a child then the after flatten, the child's last node should point to current's next node and current's next node should point to its child. Remember the child should also be recursively flattened.). 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/linkedlists/FlattenListWithChild.java
8. Write an algorithm to remove duplicates from an unsorted linked list.  [unit tests are coming]
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/linkedlists/RemoveDuplicates.java
9. Write a program that checks if 2 singly linkedlists intersect or not. You can assume both of the lists does not have any cycle. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/linkedlists/IntersectingLinkedList.java
10. Write a program that returns the intersecting node of 2 singly linkedlists and null otherwise. You can assume both of the lists does not have any cycle. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/linkedlists/IntersectingLinkedList.java
11. Reverse a linked list.
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/linkedlists/ReverseList.java

### Stacks and Queues
1. Implement a stack that has `push()`, `pop()`, and `min()`. `min()` gives the current minimum in the stack. All 3 function should be `O(1)` time. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/stacks_queues/stack_push_pop_min_constant_time.c
2. Implement a queue with a linked list with `insert()`, `remove()`, and `isEmpty()` functions, all of which should operate in O(1) time.
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/stacks_queues/Queue.java

### Trees and Graphs
1. Implement a tree and a in-order-traversal. Implement a function to return the first common ancestor (fca) of any 2 given nodes. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/trees_graphs/tree_inorder_fca.c
2. Implement a tree and a in-order-traversal. Assuming the tree is a Binary Search Tree, implement a function to return the first common ancestor (fca) of any 2 given nodes. For this problem you can assume that both values exist in the tree, so no need to check for those cases. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/trees_graphs/bst_inorder_fca.c
3. Do an in order traversal of a binary tree. Can you do it without using recursion?  [unit tests are coming]
    * Link: 
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
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/IsBST.java
10. A Trie is a prefex tree of created by string. Implement the `get(String key)` and `put(int value, String key)` methods of a trie, so that it is similar to a `HashMap<String>`. 
    * Link: 
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
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/trees_graphs/InOrderBSTIterator.java

### Dynamic Programming
1. Write a dynamic programming algorithm to print the nth fibonacci number.
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/dynamic_programming/Fibonacci.java
2. Given a sequence, find the Contiguous Sub-sequence, sum of which is greater than that of any other Contiguous Sub-sequences. If the input is `{−15,29,−36,3,−22,11,19,−5}` then the output is `{11,19}`.
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/dynamic_programming/MaxValueContiguousSubSeq.java
3. Given a sequence, find the longest Sub-sequence (not necessarily Contiguous) such that each element is strictly greater than its previous in the sub-sequence. If the input is `{−2,11,−4,13,−3,−5,−1,2}` then the output is `{−4,−3,−1,2}`.
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/dynamic_programming/LongestIncreasingSubSeq.java
4. There is a knapsack of capacity `C` and there are there are `n` items with weights `w1,w2,...,wn` and values `v1,v2,...,vn`. Assume `C,w1,w2,...,wn` are strictly positive integers and there are infinitely many of each items, i.e., unbounded.  Determine the number of each item to include in the knapsack so that the total weight is less than or equal to the knapsack capacity and the total value is maximized.
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/dynamic_programming/UnboundedKnapsack.java
5. Given `n` types of coin denominations of values `c1<c2<...<cn` (all integers). Assume `c1=1` , so it is always possible to make change for any amount of money `C`. Give an algorithm which makes change for an amount of money `C` with as few coins as possible.
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/dynamic_programming/MakingChange.java
6. Given two strings `A` and `B`, we want to transform `A` into `B` with a minimum number of operations of the following types: delete a character from `A` , insert a character into `A` , or change some character in  `A` into a new character. The minimal number of such operations required to transform  `A` into  `B` is called the edit distance between  `A` and `B`.
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/dynamic_programming/EditDistance.java
7. Calculate the longest common sub-sequence between 2 strings. Recall, `ac` is a common sub-sequence between `abc` and `acq`. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/dynamic_programming/LongestCommonSubSeq.java
8. Calculate the longest Palindromic sub-sequence of a string, i.e., the longest sub-sequence that is a palindrome. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/dynamic_programming/LongestPalindromicSubSeq.java
9. Calculate the longest common substring between 2 strings.
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/dynamic_programming/LongestCommonSubstring.java

### Bitwise Operations
1. Add 2 integers without any arithmetic operators.
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/bitwise_operations/add_without_any_arithmetic_operator.c
2. Write a function to check if an integer is the power of 2. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/bitwise_operations/power_of_two.c

### Math
1. Print first n prime numbers. 
    * Link: http://projecteuler.net/problem=7
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/math/n_primes.c
2. Print the nth fibonacci number. Ex. `f(0)=0, f(1)=1, f(2)=1, f(3)=2, f(4)=3, f(5)=5, ...`. 
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/math/nth_fibonacci.c
3. If we list all the natural numbers below 10 that are multiples of `3` or `5`, we get `3`, `5`, `6` and `9`. The sum of these multiples is `23`. Find the sum of all the multiples of 3 or 5 below a number `n`. 
    * Link: http://projecteuler.net/problem=1
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/math/MultipleOf3And5.java
4. Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with `1` and `2`, the first `10` terms will be: `1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...`. By considering the terms in the Fibonacci sequence whose values do not exceed a number `n`, find the sum of the even-valued terms. 
    * Link: http://projecteuler.net/problem=2
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/math/EvenFibonacciSum.java
5. The prime factors of `13195` are `5`, `7`, `13` and `29`. What is the largest prime factor of the number `n` (`n` can be long int)? 
    * Link: http://projecteuler.net/problem=3
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/math/LargestPrimeFactor.java
6. We must pay D dollars with p1 and p2 dollar bills. So, we want to overpay as little as possible. Return the minimum  dollars greater than or equal to D. Assume that we have an infinite supply of both p1 and p2 dollar bills. 
    * Link: http://community.topcoder.com/stat?c=problem_statement&pm=4845
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/math/AmountApproximation.java
7. Calculate the Greatest common divisor (gcd) and Least common multiple (lcm) of n numbers. 
    * Link: http://projecteuler.net/problem=5
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/math/gcd_lcm.c
8. A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest palindrome made from the product of two n-digit numbers.
    * Link: http://projecteuler.net/problem=4
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/math/largest_palindrome_product.c
9. Given a number n, find the sum of the digits in the number n! (n factorial).
    * Link: http://projecteuler.net/problem=20
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/math/FactorialDigitSum.java
10. Find the difference between the sum of the squares of the first n natural numbers and the square of the sum.
    * Link: http://projecteuler.net/problem=6
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/math/SumSquareDiff.java
11. Find the greatest product of m consecutive digits in the n-digit number given as a string.
    * Link: http://projecteuler.net/problem=8
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/strings/LargestProductOf_m_ConsecutiveDigits.java



### File Operations
1. Print last n words from a file. `print_last_n_words.c`
    * Link: 
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/C/file_operations/print_last_n_words.c

### Threading


[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/rfaisal/hellouniverse/trend.png)](https://bitdeli.com/free "Bitdeli Badge")
