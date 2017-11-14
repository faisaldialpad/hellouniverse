class ValidPalindrome:
    @staticmethod
    def is_palindrome(s):
        """
        :type s: str
        :rtype: bool
        """
        if not s:
            return True
        left = 0
        right = len(s) - 1
        while left <= right:
            while left <= right and not s[left].isalnum():
                left += 1
            while left <= right and not s[right].isalnum():
                right -= 1
            if left > right:
                break
            if s[left].upper() != s[right].upper():
                return False
            left += 1
            right -= 1
        return True
