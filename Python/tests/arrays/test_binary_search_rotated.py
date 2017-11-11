from unittest import TestCase

from dev.arrays.binary_search_rotated import BinarySearchRotated


class TestBinarySearchRotated(TestCase):
    def test_search(self):
        self.assertEqual(-1, BinarySearchRotated.search([4, 5, 6, 7, 0, 1, 2], 9))
        self.assertEqual(-1, BinarySearchRotated.search([4, 5, 6, 7, 0, 1, 2], 3))
        self.assertEqual(0, BinarySearchRotated.search([4, 5, 6, 7, 0, 1, 2], 4))
        self.assertEqual(1, BinarySearchRotated.search([4, 5, 6, 7, 0, 1, 2], 5))
        self.assertEqual(2, BinarySearchRotated.search([4, 5, 6, 7, 0, 1, 2], 6))
        self.assertEqual(3, BinarySearchRotated.search([4, 5, 6, 7, 0, 1, 2], 7))
        self.assertEqual(4, BinarySearchRotated.search([4, 5, 6, 7, 0, 1, 2], 0))
        self.assertEqual(5, BinarySearchRotated.search([4, 5, 6, 7, 0, 1, 2], 1))
        self.assertEqual(6, BinarySearchRotated.search([4, 5, 6, 7, 0, 1, 2], 2))

        self.assertEqual(-1, BinarySearchRotated.search([6, 7, 0, 1, 2, 4, 5], 9))
        self.assertEqual(-1, BinarySearchRotated.search([6, 7, 0, 1, 2, 4, 5], 3))
        self.assertEqual(0, BinarySearchRotated.search([6, 7, 0, 1, 2, 4, 5], 6))
        self.assertEqual(1, BinarySearchRotated.search([6, 7, 0, 1, 2, 4, 5], 7))
        self.assertEqual(2, BinarySearchRotated.search([6, 7, 0, 1, 2, 4, 5], 0))
        self.assertEqual(3, BinarySearchRotated.search([6, 7, 0, 1, 2, 4, 5], 1))
        self.assertEqual(4, BinarySearchRotated.search([6, 7, 0, 1, 2, 4, 5], 2))
        self.assertEqual(5, BinarySearchRotated.search([6, 7, 0, 1, 2, 4, 5], 4))
        self.assertEqual(6, BinarySearchRotated.search([6, 7, 0, 1, 2, 4, 5], 5))

        self.assertEqual(1, BinarySearchRotated.search([3, 1], 1))
