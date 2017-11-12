from unittest import TestCase

from dev.maths.plus_one import PlusOne


class TestPlusOne(TestCase):
    def test_increment(self):
        self.assertEqual([1], PlusOne.increment([]))
        self.assertEqual([1, 0], PlusOne.increment([9]))
