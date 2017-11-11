from unittest import TestCase

from dev.arrays.merge_2sorted_arrays_into_first import Merge2SortedArraysIntoFirst


class TestMerge2SortedArraysIntoFirst(TestCase):
    def test_merge_equal_size(self):
        result = [1, 3, 5, 0, 0, 0]
        Merge2SortedArraysIntoFirst.merge(result, 3, [2, 4, 6], 3)
        self.assertEqual([1, 2, 3, 4, 5, 6], result)

    def test_merge_first_bigger(self):
        result = [1, 3, 5, 6, 0, 0]
        Merge2SortedArraysIntoFirst.merge(result, 4, [2, 4], 2)
        self.assertEqual([1, 2, 3, 4, 5, 6], result)

    def test_merge_second_bigger(self):
        result = [1, 3, 0, 0, 0, 0]
        Merge2SortedArraysIntoFirst.merge(result, 2, [2, 4, 5, 6], 4)
        self.assertEqual([1, 2, 3, 4, 5, 6], result)
