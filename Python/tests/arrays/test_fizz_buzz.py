from unittest import TestCase

from dev.arrays.fizz_buzz import FizzBuzz


class TestFizzBuzz(TestCase):
    def test_get_fizz_buzz(self):
        self.assertEqual(["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"], FizzBuzz.get_fizz_buzz(15))
