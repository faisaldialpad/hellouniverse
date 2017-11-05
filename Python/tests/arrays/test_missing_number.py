from unittest import TestCase

from dev.arrays.missing_number import MissingNumber


class TestMissingNumber(TestCase):
    def test_find(self):
        self.assertEqual(2, MissingNumber.find([0, 1, 3]))
