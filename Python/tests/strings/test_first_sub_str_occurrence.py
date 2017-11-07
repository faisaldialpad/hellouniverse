from unittest import TestCase

from dev.strings.first_sub_str_occurrence import FirstSubStrOccurrence


class TestFirstSubStrOccurrence(TestCase):
    def test_find(self):
        self.assertEqual(0, FirstSubStrOccurrence.find("abcd", ""))
        self.assertEqual(1, FirstSubStrOccurrence.find("abcd", "bc"))
        self.assertEqual(0, FirstSubStrOccurrence.find("abcd", "abcd"))
        self.assertEqual(-1, FirstSubStrOccurrence.find("abcd", "abcdd"))
        self.assertEqual(2, FirstSubStrOccurrence.find("abcd", "cd"))
        self.assertEqual(2, FirstSubStrOccurrence.find("hello", "ll"))
        self.assertEqual(-1, FirstSubStrOccurrence.find("aaaaa", "bba"))
