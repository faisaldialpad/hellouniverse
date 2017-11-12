class PlusOne:
    @staticmethod
    def increment(digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        carry = 1
        for i in range(len(digits) - 1, -1, -1):
            total = digits[i] + carry
            if total >= 10:
                carry = 1
                digits[i] = total % 10
            else:
                carry = 0
                digits[i] = total
        if carry == 0:
            return digits
        digits.insert(0, 1)
        return digits
