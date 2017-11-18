from unittest import TestCase

from dev.maths.roman_to_int import RomanToInt


class TestRomanToInt(TestCase):
    def test_convert(self):
        self.assertEqual(1, RomanToInt.convert('I'))
        self.assertEqual(2, RomanToInt.convert('II'))
        self.assertEqual(3, RomanToInt.convert('III'))
        self.assertEqual(4, RomanToInt.convert('IV'))
        self.assertEqual(5, RomanToInt.convert('V'))
        self.assertEqual(6, RomanToInt.convert('VI'))
        self.assertEqual(7, RomanToInt.convert('VII'))
        self.assertEqual(8, RomanToInt.convert('VIII'))
        self.assertEqual(9, RomanToInt.convert('IX'))
        self.assertEqual(10, RomanToInt.convert('X'))
        self.assertEqual(707, RomanToInt.convert('DCCVII'))
        self.assertEqual(900, RomanToInt.convert('CM'))
        self.assertEqual(1800, RomanToInt.convert('MDCCC'))
        self.assertEqual(890, RomanToInt.convert('DCCCXC'))
