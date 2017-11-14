from unittest import TestCase

from dev.strings.valid_palindrome import ValidPalindrome


class TestValidPalindrome(TestCase):
    def test_is_palindrome(self):
        self.assertTrue(ValidPalindrome.is_palindrome(" "))
        self.assertTrue(ValidPalindrome.is_palindrome("A man, a plan, a canal: Panama"))
        self.assertFalse(ValidPalindrome.is_palindrome("race a car"))
