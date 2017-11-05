from unittest import TestCase

from dev.maths.count_primes import CountPrimes


class TestCountPrimes(TestCase):
    def test_count(self):
        self.assertEqual(0, CountPrimes.count(2))
        self.assertEqual(1, CountPrimes.count(3))  # 2
        self.assertEqual(2, CountPrimes.count(4))  # 2, 3
        self.assertEqual(3, CountPrimes.count(6))  # 2, 3, 5
        self.assertEqual(4, CountPrimes.count(10))  # 2, 3, 5, 7
