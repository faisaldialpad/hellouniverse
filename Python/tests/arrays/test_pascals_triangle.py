from unittest import TestCase

from dev.arrays.pascals_triangle import PascalsTriangle


class TestPascalsTriangle(TestCase):
    def test_generate(self):
        self.assertEqual([[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]], PascalsTriangle.generate(5))

    def test_get_row(self):
        self.assertEqual([1, 4, 6, 4, 1], PascalsTriangle.get_row(4))
