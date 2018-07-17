from unittest import TestCase

from dev.arrays.sub_array_sum import SubArraySum


class TestSubArraySum(TestCase):
    def test_total_count(self):
        self.assertEquals(SubArraySum().total_count([1, 1, 1], 2), 2)
        self.assertEquals(SubArraySum().total_count([3, 4, 7, 2, -3, 1, 4, 2], 7), 4)
