class ExcelColumn:
    @staticmethod
    def convert_title_to_number(s):
        """
        :type s: str
        :rtype: int
        """
        # this is similar to base 26 conversion
        result = 0
        for i in range(0, len(s)):
            val = ExcelColumn.to_number(s[i])
            result += pow(26, len(s) - i - 1) * val
        return result

    @staticmethod
    def convert_number_to_title(n):
        """
        :type n: int
        :rtype: str
        """
        result = []
        while n > 0:
            n -= 1
            result.append(ExcelColumn.to_title(n % 26))
            n = int(n / 26)
        result.reverse()
        return ''.join(result)

    @staticmethod
    def to_number(c):
        return ord(c) - ord('A') + 1

    @staticmethod
    def to_title(n):
        return chr(n + ord('A'))
