class Trie:
    """ Implement a trie with insert, search, and startsWith methods.
    Note: You may assume that all inputs are consist of lowercase letters a-z.
    https://leetcode.com/problems/implement-trie-prefix-tree/description/
    """

    def __init__(self):
        self.root = TrieNode()

    def insert(self, word):
        """
        Inserts a word into the trie.
        :type word: str
        :rtype: void
        """
        cur = self.root
        for c in word:
            cur = cur.get_or_add_child(c)
        cur.has_last = True

    def search(self, word):
        """
        Returns if the word is in the trie.
        :type word: str
        :rtype: bool
        """
        cur = self.root
        for c in word:
            cur = cur.get_child(c)
            if not cur:
                return False
        return cur.has_last

    def starts_with(self, prefix):
        """
        Returns if there is any word in the trie that starts with the given prefix.
        :type prefix: str
        :rtype: bool
        """
        cur = self.root
        for c in prefix:
            cur = cur.get_child(c)
            if not cur:
                return False
        return True


class TrieNode:
    def __init__(self):
        self.children = {}
        self.has_last = False

    def get_child(self, k):
        return self.children.get(k)

    def get_or_add_child(self, k):
        child = self.get_child(k)
        if not child:
            child = TrieNode()
            self.children[k] = child

        return child
