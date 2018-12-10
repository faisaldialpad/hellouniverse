"""
https://leetcode.com/problems/unique-paths/description/
62. Unique Paths

A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

S _ _ _ _ _ _
_ _ _ _ _ _ _
_ _ _ _ _ _ E

Above is a 7 x 3 grid. How many possible unique paths are there?

Note: m and n will be at most 100.

Example 1:

Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right
Example 2:

Input: m = 7, n = 3
Output: 28
"""


class UniquePaths(object):
    def count(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        paths_count = [[0] * m for _ in range(0, n)]
        paths_count[n - 1][m - 1] = 1
        for i in range(n - 1, -1, -1):
            for j in range(m - 1, -1, -1):
                if i + 1 < n:
                    paths_count[i][j] += paths_count[i + 1][j]
                if j + 1 < m:
                    paths_count[i][j] += paths_count[i][j + 1]
        return paths_count[0][0]
