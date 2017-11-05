class ParenthesesGeneration:
    def generate(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        return list(self.__generate(n))

    def __generate(self, n):
        if n <= 0:
            return set()
        if n == 1:
            return set(["()"])
        prev = self.__generate(n - 1)
        ret = set()
        for s in prev:
            for i in range(0, len(s) + 1):
                ret.add("{0}(){1}".format(s[:i], s[i:]))
        return ret
