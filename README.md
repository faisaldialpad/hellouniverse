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



## Questions

* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-Arrays-ArrayLists.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-Bitwise-Math.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-Dynamic-Programming.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-LinkedLists.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-Others.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-String.md
* https://github.com/rfaisal/hellouniverse/blob/master/ProblemSet-Trees-Graphs.md

[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/rfaisal/hellouniverse/trend.png)](https://bitdeli.com/free "Bitdeli Badge")
