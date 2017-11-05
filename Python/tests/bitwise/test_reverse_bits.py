from unittest import TestCase

from dev.bitwise.reverse_bits import ReverseBits


class TestReverseBits(TestCase):
    def test_reverse(self):
        self.assertEqual(964176192, ReverseBits.reverse(43261596))
