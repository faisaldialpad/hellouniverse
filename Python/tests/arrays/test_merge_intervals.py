from unittest import TestCase
from dev.arrays.merge_intervals import MergeIntervals
from dev.arrays.merge_intervals import Interval


class TestMergeIntervals(TestCase):
    def test_merge(self):
        inp = [Interval.from_list(x) for x in [[1, 5], [4, 6]]]
        outp = [x.to_list() for x in MergeIntervals().merge(inp)]
        self.assertEqual([[1, 6]], outp)

        inp = [Interval.from_list(x) for x in [[1, 4], [4, 5]]]
        outp = [x.to_list() for x in MergeIntervals().merge(inp)]
        self.assertEqual([[1, 5]], outp)

        inp = [Interval.from_list(x) for x in [[1, 3], [2, 6], [8, 10], [15, 18]]]
        outp = [x.to_list() for x in MergeIntervals().merge(inp)]
        self.assertEqual([[1, 6], [8, 10], [15, 18]], outp)
