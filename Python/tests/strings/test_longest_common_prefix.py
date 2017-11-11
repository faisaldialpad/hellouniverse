from unittest import TestCase

from dev.strings.longest_common_prefix import LongestCommonPrefix


class TestLongestCommonPrefix(TestCase):
    def test_calculate_lcp(self):
        self.assertEqual("abc", LongestCommonPrefix.calculate_lcp(["abcdef", "abcqdf", "abc", "abcd"]))
