"""
https://leetcode.com/problems/palindrome-partitioning/description/
131. Palindrome Partitioning

Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

Example:

Input: "aab"
Output:
[
  ["aa","b"],
  ["a","a","b"]
]
"""
class Solution:
    def partition(self, s):
        """
        :type s: str
        :rtype: List[List[str]]
        """
