class CountPrimes:
    @staticmethod
    def count(n):
        """
        :type n: int
        :rtype: int
        """
        not_primes = [False] * n  # prime by default
        count = 0
        for i in range(2, n):
            if not not_primes[i]:
                count += 1
                j = i  # important
                while i * j < n:
                    not_primes[i * j] = True
                    j += 1
        return count
