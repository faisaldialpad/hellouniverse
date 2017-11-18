class RomanToInt:
    @staticmethod
    def convert(s):
        """
        :type s: str
        :rtype: int
        """
        roman_value_map = {'M': 1000,'D': 500 ,'C': 100,'L': 50,'X': 10,'V': 5,'I': 1}
        total = 0
        for i in range(0, len(s) - 1):
            if roman_value_map[s[i]] < roman_value_map[s[i + 1]]: # if prev is smaller than next
                total -= roman_value_map[s[i]]
            else:
                total += roman_value_map[s[i]]
        total += roman_value_map[s[len(s) - 1]]  # last is always added
        return total

