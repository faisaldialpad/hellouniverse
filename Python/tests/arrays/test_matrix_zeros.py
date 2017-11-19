from unittest import TestCase

from dev.arrays.matrix_zeroes import MatrixZeros


class TestMatrixZeros(TestCase):
    def test_set_zeroes(self):
        a = [[1, 1, 1], [0, 1, 2]]
        MatrixZeros.set_zeroes(a)
        self.assertEqual([[0, 1, 1], [0, 0, 0]], a)

    def test_set_zeroes_efficient(self):
        a = [[1, 1, 1], [0, 1, 2]]
        MatrixZeros.set_zeroes_efficient(a)
        self.assertEqual([[0, 1, 1], [0, 0, 0]], a)

        b = [[0, 0, 0, 5], [4, 3, 1, 4], [0, 1, 1, 4], [1, 2, 1, 3], [0, 0, 1, 1]]
        MatrixZeros.set_zeroes_efficient(b)
        self.assertEqual([[0, 0, 0, 0], [0, 0, 0, 4], [0, 0, 0, 0], [0, 0, 0, 3], [0, 0, 0, 0]], b)

        c = [[-4, -2147483648, 6, -7, 0], [-8, 6, -8, -6, 0], [2147483647, 2, -9, -6, -10]]
        MatrixZeros.set_zeroes_efficient(c)
        self.assertEqual([[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [2147483647, 2, -9, -6, 0]], c)
