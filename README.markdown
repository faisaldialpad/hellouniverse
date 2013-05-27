# Hello Universe


The Hello Universe is a project with a collection of fun and thought provoking programming problems. You are welcome to use this project to analyze and grow your core programming skills. This project focuses less on good programming practices (that's why sometimes you will see codes like `c>=65 && c<=65+26` instead of `isupper(c)`), but more on the problem itself, the right data structures for the problem, the best algorithm to use in terms of time and space complexities. These types of questions are most common in first year programming courses and programming interviews, but solving these problems are necessary skills for a good programmer. The primary languages for this project is C and Java. If I need to use existing data structures, I will probably be using Java, and for simple problems I will probably be using C. Please feel free to improve upon my code.

## Contributing

1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Contribute and Commit your changes (`git commit -am 'Added some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create new Pull Request

## Recognition

* **Brian Kernighan** and **Dennis Ritchie**. Some of the problems and some of the solutions of this projects are taken from their book.
* **Brian Dean**. For this website: http://people.csail.mit.edu/bdean/6.046/dp/
* http://careercup.com . Some of the problems and some of the solution ideas of this projects are taken from this website.


## Questions

### Strings
#### C/strings/
1. Remove all the duplicate chars of a string. `duplicates_remove.c`
2. Return the first duplicate char of a string with `O(n)` time. `duplicate_char_first.c`
3. Remove extra space in a string. Ex: `"(5 spaces)abc(10 spaces)def(1 space)" --> "(1 space)abc(1 space)def(1 space)"`. `extra_space_remove.c`
4. Detect if 2 strings are anagrams of each other or not with `O(n)` time. `is_anagram.c`
5. Detect if one string is a substring of another string or not. Using `isSubstring()` method only, check if 2 strings are rotations of each other or not. `is_substring_is_rotation.c`
6. Replace each space of a string with `%20`. `space_encode.c`
7. Concat two strings and save the result to the first string. `str_cat.c`
8. Copy a source string to a destination string. `str_cpy.c`
9. Find the length of a string. `str_len.c`
10. Recursively find the length of a string, the number of upper case, lower case charecters and vowels in a string. `str_len_upper_lower_vowel_count_recursive.c`
11. Reverse a string. `str_rev.c`
12. Return the first non-repeating char of a string with `O(n)` time. `non_repeating_char_first.c`
13. Write a function that takes 2 strings and removes everything from 1st string that exists in 2nd string. For example, `remove("asdadasewss","aeiou");` removes all the vowels. `remove_from_2nd_string.c`

#### Java/src/strings/
1. Write a recursive function that will take a string and duplicate each char in each iteration (running duplicate). E.g., `Hello-->HH HHee HHeell HHeellll HHeelllloo`. `RunningDuplicate.java`
2. Write a string add function. `StringAdd.java`
3. Calculate how many rotations of a string is same as the original string. `IdenticalRotations.java`

### Arrays and ArrayLists
#### C/arrays/
1. Given a MxN matrix. If a cell is 0 make the entire row and column corresponding to that cell to 0. `matrix_filter_by_zero.c`
1. Given a NxN pixel image, where each pixel is 4 bytes (therefore the image can be represented by a NxN integer matrix). Rotate by 90 degree in place. `matrix_in_place_rotation.c`
3. Given a MxN matrix that is sorted in both rows and columns. Find an element in it. The algorithm should run in O(M+N) time. `matrix_linear_search.c`
4. Find a specific integer in a sorted array (binary search). `search_binary.c`
5. Find a specific integer in a sorted (in increasing order) array that is rotated unknown number of times. The algorithm should run in `log(n)` time. Ex.  `Arr=[45 67 76 88 90 95 1 5 6 9 12 37], n=6 -->8`. `search_binary_rotated_sorted_array.c`
6. Given an array of integers such that each element is either +1 or -1 to its preceding element. Find 1st occurrence of a given number in that array without using linear search.Ex. `Arr=[1 2 1 2 3 4 5 6 7 6 5 4 5 6 7 8 9],n=7-->8`. `search_element_in_a_stepwise_array.c`
7. A sequence increases, reach a max and then decreases, like `[45 67 76 88 90 95 47 12 9 7 6 5 4 3 2 1]`. Find the max. (An array sorted in an ascending order and another array sorted in descending order are concatenated together. Find the max. Either array can be empty.). `search_max_in_increasing_then_decreasing_seq.c`
8. Given an array A and a number n, if the n is in A then return the next bigger number than n. All the other cases return -1. Ex: `A={3,2,7,6},n=1 --> -1, A={3,2,7,6},n=3 --> 7, A={3,2,7,6},n=7 --> -1, A={3,2,7,6},n=2 --> 7`. `search_next_bigger_num.c`

#### Java/src/arrays/
1. Write a function which will return the permutations of integers (with all duplicates). E.g., `[2 2]-->[[2 2],[2 2]]`. `Permutation.java`
2. Write a function which will return the permutations of integers without any duplicates. E.g., `[1 2 2]-->[[1 2 2],[2 2 1],[2 1 2]]`. `Permutation.java`
3. Given an array, find the Max Length Contiguous Sequential Integers. e.g., `[3 1 2 5]-->[1 2]`. `MaxLengthContiguousSequentialIntegers.java`



### LinkedLists
#### C/linkedlists/
1. Implement a singly linked list with `add(int v, int pos)`, `remove(int pos)`, and `print()` functionalities. Write a function to remove a linked list node when you only have access to that node. `singly__add__remove__remove_without_head.c`

#### Java/src/linkedlists/
1. How will you detect a corrupt singly linked list (a linked list that has a circle in it, i.e., an arbitrary node's next pointer points to an earlier node)? `CircularList.java`
2. Return the starting node of a circle and null if it is not circular. `CircularList.java`
3. Write a function that will return true if a circular singly linked list has duplicate values and false if there are no duplicate values or the linked list is not circular. You can assume that the values are ascii characters ranging from 0 to 127. `CircularList.java`
4. Add 2 numbers represented by linked lists: each node contains a digit and the digits are reverse order. For example: 123 is represented by 3->2->1 and 905 is represented by 5->0->9 and their addition will be 8->2->0->1 i.e., 1028. You are allowed to traverse each list only once. `LinkedListAdd.java`
5. Implement an algorithm to find the last n elements of a singly linked list. `Last_N_Elements.java`
6. Suppose a weird singly linked list has a child pointer that can point to a Node i.e., another linked list (which also has a child pointer). Flatten the list. (if a node has a child then the after flatten, the child's last node should point to current's next node and current's next node should point to its child. Remember the child should also be recursively flattened.). `FlattenListWithChild.java`

<!--
6. Write an algorithm to remove duplicates from an unsorted linked list.
-->

### Stacks and Queues
#### C/stacks_queues/
1. Implement a stack that has `push()`, `pop()`, and `min()`. `min()` gives the current minimum in the stack. All 3 function should be `O(1)` time. `stack_push_pop_min_constant_time.c`

### Trees and Graphs
#### C/trees_graphs/
1. Implement a tree and a in-order-traversal. Implement a function to return the first common ancestor (fca) of any 2 given nodes. `tree_inorder_fca.c`
2. Implement a tree and a in-order-traversal. Assuming the tree is a Binary Search Tree, implement a function to return the first common ancestor (fca) of any 2 given nodes. For this problem you can assume that both values exist in the tree, so no need to check for those cases. `bst_inorder_fca.c`

#### Java/src/trees_graphs/
1. Do an in order traversal of a binary tree. Can you do it without using recursion? `TreeTraversal.Java` [unit tests are coming]
2. Check if a binary tree is balanced or not. A balanced tree is defined to be a tree such that no 2 leaf nodes differ in distance from the root by more than 1. `IsBalancedTree.Java` [unit tests are coming]
3. Given a sorted (increasing order) array, make a BST with minimal height.`BSTfromSortedArray.java` [unit tests are coming]
4. Given a binary tree, design an algorithm that will create a list of all the nodes at each depth, i.e., if the tree is of depth `d` then there will be `d` lists. `LevelWiseBFSonTree.java` [unit tests are coming]
5. Design an algorithm to find the in-order-successor of a given node, i.e., the node that will come next if we do an in-order traversal. Each node has a link to its parent. `InOrderSuccessor.java` [unit tests are coming]
6. Create an algorithm to determine if a binary tree is a sub-tree of another binary tree. Both trees are very big with millions of nodes. `IsSubTree.java` [unit tests are coming]
7. Write an algorithm to check if a tree is a BST or not. Check for the case that all the nodes in the left subtree must be less than the root and all the node in the right subtree must be greater than the root. For example, if a tree is represented by an array then `[*,4,2,6,1,100,5,7]` is not a BST, but  `[*,4,2,6,1,3,5,7]` is. `IsBST.java`

<!-- suffix tree -->

### Dynamic Programming
#### Java/src/dynamic_programming/
1. Write a dynamic programming algorithm to print the nth fibonacci number.`Fibonacci.java`
2. Given a sequence, find the Contiguous Sub-sequence, sum of which is greater than that of any other Contiguous Sub-sequences. If the input is `{−15,29,−36,3,−22,11,19,−5}` then the output is `{11,19}`.`MaxValueContiguousSubSeq.java`
3. Given a sequence, find the longest Sub-sequence (not necessarily Contiguous) such that each element is strictly greater than its previous in the sub-sequence. If the input is `{−2,11,−4,13,−3,−5,−1,2}` then the output is `{−4,−3,−1,2}`.
4. There is a knapsack of capacity `C` and there are there are `n` items with weights `w1,w2,...,wn` and values `v1,v2,...,vn`. Assume `C,w1,w2,...,wn` are strictly positive integers and there are infinitely many of each items, i.e., unbounded.  Determine the number of each item to include in the knapsack so that the total weight is less than or equal to the knapsack capacity and the total value is maximized.
5. Given `n` types of coin denominations of values `c1<c2<...<cn` (all integers). Assume `c1=1` , so it is always possible to make change for any amount of money `C`. Give an algorithm which makes change for an amount of money `C` with as few coins as possible.
6. Given two strings `A` and `B`, we want to transform `A` into `B` with a minimum number of operations of the following types: delete a character from `A` , insert a character into `A` , or change some character in  `A` into a new character. The minimal number of such operations required to transform  `A` into  `B` is called the edit distance between  `A` and `B`.
7. Calculate the longest common sub-sequence between 2 strings. Recall, `ac` is a common sub-sequence between `abc` and `acq`. `LongestCommonSubSeq.java`
8. Calculate the longest Palindromic sub-sequence of a string, i.e., the longest sub-sequence that is a palindrome. `LongestPalindromicSubSeq.java`
9. Calculate the longest common substring between 2 strings.`LongestCommonSubString.java`

### Others (Math, Bitwise Operations, File Operations, Threading, etc.)
#### C/bitwise_operations/
1. Add 2 integers without any arithmetic operators. `add_without_any_arithmetic_operator.c`
2. Write a function to check if an integer is the power of 2. `power_of_two.c`

#### C/math/
1. Print first n prime numbers. `n_primes.c`
2. Print the nth fibonacci number. Ex. `f(0)=0, f(1)=1, f(2)=1, f(3)=2, f(4)=3, f(5)=5, ...`. `nth_fibonacci.c`

#### C/file_operations/
1. Print last n words from a file. `print_last_n_words.c`

<!--
#### Java/3_stacks_queues
#### Java/4_trees_graphs
#### Java/5_file_operations
#### Java/6_threading
-->

