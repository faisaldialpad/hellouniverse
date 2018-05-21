from unittest import TestCase

from dev.trees.trie import Trie


class TestTrie(TestCase):
    def test_trie(self):
        trie = Trie()
        trie.insert('abc')
        self.assertTrue(trie.starts_with(''))
        self.assertTrue(trie.starts_with('a'))
        self.assertTrue(trie.starts_with('ab'))
        self.assertTrue(trie.starts_with('abc'))
        self.assertTrue(trie.search('abc'))
        self.assertFalse(trie.search('ab'))
