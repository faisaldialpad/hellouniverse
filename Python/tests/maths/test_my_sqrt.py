from unittest import TestCase

from dev.maths.my_sqrt import MySqrt


class TestMySqrt(TestCase):
    def test_calculate_sqrt(self):
        self.assertEqual(1, MySqrt.calculate_sqrt(1))
        self.assertEqual(1, MySqrt.calculate_sqrt(2))
        self.assertEqual(1, MySqrt.calculate_sqrt(3))
        self.assertEqual(2, MySqrt.calculate_sqrt(4))
        self.assertEqual(3, MySqrt.calculate_sqrt(9))
        self.assertEqual(3, MySqrt.calculate_sqrt(10))
        self.assertEqual(2, MySqrt.calculate_sqrt(8))
        self.assertEqual(10, MySqrt.calculate_sqrt(100))
        self.assertEqual(100, MySqrt.calculate_sqrt(10000))
