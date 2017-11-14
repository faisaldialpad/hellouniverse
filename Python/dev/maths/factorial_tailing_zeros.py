class FactorialTrailingZeroes:
    def count_zeros(self, n):
        """
        :type n: int
        :rtype: int
        """
        #  n! = 1*2*...*n. Number of 2 and 5 factors will make a tailing 0.
        # Since number of 2 factors are way larger than number of 5 factors, we just need to count number of 5 factors
        # So, for n! we need to find how many numbers from 1 to n are divisible by 5.
        # But 25 has 2 of 5s one of which would be calculated by number of 5s and the other would be by number of 25s
        i = 5
        count = 0
        while i <= n:
            count += int(n/i)  # floor
            i *= 5
        return count
