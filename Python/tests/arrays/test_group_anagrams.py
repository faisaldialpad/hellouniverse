from unittest import TestCase
from dev.arrays.group_anagrams import GroupAnagrams


class TestGroupAnagrams(TestCase):
    def test_group(self):
        self.assertCountEqual([set(x) for x in GroupAnagrams.group(["eat", "tea", "tan", "ate", "nat", "bat"])],
                              [set(x) for x in [["ate", "eat", "tea"], ["nat", "tan"], ["bat"]]])

    def test_group_sorted(self):
        self.assertCountEqual([set(x) for x in GroupAnagrams.group_sorted(["eat", "tea", "tan", "ate", "nat", "bat"])],
                              [set(x) for x in [["ate", "eat", "tea"], ["nat", "tan"], ["bat"]]])
