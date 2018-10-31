from unittest import TestCase
from dev.arrays.top_k_frequent import TopKFrequent


class TestTopKFrequent(TestCase):
    def test_top_k_frequent(self):
        self.assertEquals([1, 2], TopKFrequent().top_k_frequent([1, 1, 1, 2, 2, 3], 2))
        self.assertEquals([1], TopKFrequent().top_k_frequent([1], 1))
