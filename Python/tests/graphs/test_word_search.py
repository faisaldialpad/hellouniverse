from unittest import TestCase
from dev.graphs.word_search import WordSearch


class TestWordSearch(TestCase):
    def test_exist(self):
        self.assertTrue(WordSearch().exist(
            [["b", "a", "a", "b", "a", "b"],
             ["a", "b", "a", "a", "a", "a"],
             ["a", "b", "a", "a", "a", "b"],
             ["a", "b", "a", "b", "b", "a"],
             ["a", "a", "b", "b", "a", "b"],
             ["a", "a", "b", "b", "b", "a"],
             ["a", "a", "b", "a", "a", "b"]],
            "aabbbbabbaababaaaabababbaaba"))
