# Problem Set

## Other Problem Sets

* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-Bitwise-Math.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-Dynamic-Programming.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-LinkedLists.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-Others.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-String.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-Trees-Graphs.md

## Arrays and ArrayLists
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
20. Find the sum of k smallest number without the (k-1)th smallest number from an array of n numbers. There are no duplicates.
    * Link: http://community.topcoder.com/stat?c=problem_statement&pm=12112
    * Solutions: https://github.com/rfaisal/hellouniverse/blob/master/Java/src/arrays/LittleElephantAndBooks.java

[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/rfaisal/hellouniverse/trend.png)](https://bitdeli.com/free "Bitdeli Badge")
