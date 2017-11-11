from unittest import TestCase

from dev.arrays.remove_dup_sorted import RemoveDupSorted


class TestRemoveDupSorted(TestCase):
    def test_remove_corner_cases(self):
        self.assertEqual(0, RemoveDupSorted.remove([]))
        self.assertEqual(1, RemoveDupSorted.remove([5]))
        l1 = [5, 6]
        self.assertEqual(2, RemoveDupSorted.remove(l1))
        self.assertEqual([5, 6], l1)
        l2 = [5, 5]
        self.assertEqual(1, RemoveDupSorted.remove(l2))
        self.assertEqual([5], l2[:1])

    def test_remove_no_dup(self):
        l1 = [5, 6, 7]
        self.assertEqual(3, RemoveDupSorted.remove(l1))
        self.assertEqual([5,6,7], l1)

        l2 = [5, 6, 7, 8, 9, 10]
        self.assertEqual(6, RemoveDupSorted.remove(l2))
        self.assertEqual([5, 6, 7, 8, 9, 10], l2)

    def test_remove_dup(self):
        l1 = [5, 5, 5]
        self.assertEqual(1, RemoveDupSorted.remove(l1))
        self.assertEqual([5], l1[:1])

        l1 = [5, 6, 6]
        self.assertEqual(2, RemoveDupSorted.remove(l1))
        self.assertEqual([5, 6], l1[:2])

        l1 = [5, 6, 6, 7, 7, 7, 8, 9, 9, 10]
        self.assertEqual(6, RemoveDupSorted.remove(l1))
        self.assertEqual([5, 6, 7, 8, 9, 10], l1[:6])
