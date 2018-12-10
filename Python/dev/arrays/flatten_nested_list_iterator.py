"""
https://leetcode.com/problems/flatten-nested-list-iterator/description/
341. Flatten Nested List Iterator

Given a nested list of integers, implement an iterator to flatten it.

Each element is either an integer, or a list -- whose elements may also be integers or other lists.


Example 1:

Input: [[1,1],2,[1,1]]
Output: [1,1,2,1,1]
Explanation: By calling next repeatedly until hasNext returns false,
             the order of elements returned by next should be: [1,1,2,1,1].


Example 2:

Input: [1,[4,[6]]]
Output: [1,4,6]
Explanation: By calling next repeatedly until hasNext returns false,
             the order of elements returned by next should be: [1,4,6].
"""



# """
# This is the interface that allows for creating nested lists.
# You should not implement it, or speculate about its implementation
# """
# class NestedInteger(object):
#    def isInteger(self):
#        """
#        @return True if this NestedInteger holds a single integer, rather than a nested list.
#        :rtype bool
#        """
#
#    def getInteger(self):
#        """
#        @return the single integer that this NestedInteger holds, if it holds a single integer
#        Return None if this NestedInteger holds a nested list
#        :rtype int
#        """
#
#    def getList(self):
#        """
#        @return the nested list that this NestedInteger holds, if it holds a nested list
#        Return None if this NestedInteger holds a single integer
#        :rtype List[NestedInteger]
#        """

class NestedIterator(object):

    def __init__(self, nested_list):
        """
        Initialize your data structure here.
        :type nested_list: List[NestedInteger]
        """
        self.flat = self.flatten(nested_list)
        self.i = 0

    def flatten(self, nested_list):
        # TODO(faisal): Don't flatten.
        res = []
        for ni in nested_list:
            if ni.isInteger():
                res.append(ni.getInteger())
            else:
                res.extend(self.flatten(ni.getList()))
        return res

    def next(self):
        """
        :rtype: int
        """
        self.i += 1
        return self.flat[self.i - 1]

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.i < len(self.flat)

# Your NestedIterator object will be instantiated and called as such:
# i, v = NestedIterator(nestedList), []
# while i.hasNext(): v.append(i.next())