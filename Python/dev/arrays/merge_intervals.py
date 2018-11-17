"""
https://leetcode.com/problems/merge-intervals/description/
56. Merge Intervals

Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
"""


class MergeIntervals(object):
    def merge(self, intervals):
        return self.merge_leet(intervals)

    def merge_leet(self, intervals):
        """
        :type intervals: List[Interval]
        :rtype: List[Interval]
        """
        intervals = sorted(intervals, key=lambda x: x.start)  # sort by start
        result = []
        for i in intervals:
            if not result or i.start > result[-1].end:
                # Create a new interval to the result.
                result.append(i) # BTW, destroys original! Make a copy instead.
            else:
                # Merge with the last
                result[-1].end = max(result[-1].end, i.end)
        return result

    def merge_original(self, intervals):
        """
        :type intervals: List[Interval]
        :rtype: List[Interval]
        """
        arr = []
        for p in intervals:
            arr.extend([(p.start, 's'), (p.end, 'e')])

        arr = sorted(arr, key=lambda x: x[0] + (0 if x[1] == 's' else 0.1))  # s gets preference.
        res = []
        start = None
        count = 0
        for p in arr:
            if start is None:
                start = p[0]
                count += 1
            elif p[1] == 's':
                count += 1
            elif p[1] == 'e':
                count -= 1

            if count == 0:
                # interval found
                res.append(Interval(s=start, e=p[0]))
                start = None
        return res


class Interval(object):
    def __init__(self, s=0, e=0):
        self.start = s
        self.end = e

    def to_list(self):
        return [self.start, self.end]

    @classmethod
    def from_list(cls, l):
        return cls(s=l[0], e=l[1])
