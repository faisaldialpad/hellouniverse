from unittest import TestCase

from dev.arrays.rotate_array import RotateArray


class TestRotateArray(TestCase):
    def test_rotate(self):
        arr = [7, 5, 3, 2, 1, 4]
        RotateArray.rotate(arr, 3)
        self.assertEqual([2, 1, 4, 7, 5, 3], arr)
