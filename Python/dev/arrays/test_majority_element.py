from unittest import TestCase

from dev.arrays.majority_element import MajorityElement


class TestMajorityElement(TestCase):
    def test_find_majority_element(self):
        self.assertEqual(2, MajorityElement.find_majority_element([2, 2, 3, 5, 2, 2, 6]))
