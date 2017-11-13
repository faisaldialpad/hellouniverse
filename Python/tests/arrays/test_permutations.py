from unittest import TestCase

from dev.arrays.permutations import Permutations


class TestPermutations(TestCase):
    def test_permute_distinct(self):
        self.assertEqual([], Permutations.permute_distinct([]))
        self.assertEqual([[1]], Permutations.permute_distinct([1]))
        self.assertEqual([[2, 1], [1, 2]], Permutations.permute_distinct([1, 2]))
        self.assertEqual([[3, 2, 1], [2, 3, 1], [2, 1, 3], [3, 1, 2], [1, 3, 2], [1, 2, 3]],
                         Permutations.permute_distinct([1, 2, 3]))

    def test_permute_dup(self):
        self.assertEqual([], Permutations.permute_dup([]))
        self.assertEqual([[1]], Permutations.permute_dup([1]))
        self.assertEqual([[2, 1], [1, 2]], Permutations.permute_dup([1, 2]))
        self.assertEqual([[3, 2, 1], [2, 3, 1], [2, 1, 3], [3, 1, 2], [1, 3, 2], [1, 2, 3]],
                         Permutations.permute_dup([1, 2, 3]))

        self.assertEqual([[1, 1]], Permutations.permute_dup([1, 1]))
        self.assertEqual([[2, 2, 1], [2, 1, 2], [1, 2, 2]],
                         Permutations.permute_dup([1, 2, 2]))