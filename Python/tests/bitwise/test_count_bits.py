from unittest import TestCase

from dev.bitwise.count_bits import CountBits


class TestCountBits(TestCase):
    def test_calculate_hamming_weight(self):
        self.assertEqual(3, CountBits.calculate_hamming_weight(11))

    def test_calculate_hamming_weight_optimized(self):
        self.assertEqual(3, CountBits.calculate_hamming_weight_optimized(11))
