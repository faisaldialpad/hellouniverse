class FirstSubStrOccurrence:
    @staticmethod
    def find(haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        for i in range(0, len(haystack) - len(needle) + 1):
            k = i
            found = True
            for c in needle:
                if c != haystack[k]:
                    found = False
                    break
                k += 1
            if found:
                return i
        return -1


