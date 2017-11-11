class CountBits(object):
    @staticmethod
    def calculate_hamming_weight(n):
        """
        :type n: int
        :rtype: int
        """
        mask = 1
        count = 0
        for i in range(0, 32):
            if n & mask != 0:
                count += 1
            mask <<= 1
        return count

    @staticmethod
    def calculate_hamming_weight_optimized(n):
        """
        :type n: int
        :rtype: int
        """
        count = 0
        while n != 0:
            count += 1
            n &= (n-1)
        return count
