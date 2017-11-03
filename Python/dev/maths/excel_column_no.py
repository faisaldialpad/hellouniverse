class ExcelColumnNo:
    @staticmethod
    def calculate(s):
        """
        :type s: str
        :rtype: int
        """
        # this is similar to base 26 conversion
        result = 0
        for i in range(0, len(s)):
            val = ord(s[i]) - ord('A') + 1
            result += pow(26, len(s) - i - 1) * val
        return result
