class GroupAnagrams:

    @staticmethod
    def group(strs):
        """
        Use this method when the range of the chars are known (like lowercase chars only).
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        group = {}
        for s in strs:
            key = [0] * 26
            for c in s:
                key[ord(c) - ord('a')] += 1
            key = tuple(key)
            if group.get(key):
                group[key].append(s)
            else:
                group[key] = [s]
        return group.values()

    @staticmethod
    def group_sorted(strs):
        """
        Use this method when the range of the chars are unknown.
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        group = {}
        for s in strs:
            key = tuple(sorted(s))
            if group.get(key):
                group[key].append(s)
            else:
                group[key] = [s]
        return group.values()
