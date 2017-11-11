class PowerOf3:
    @staticmethod
    def isPowerOfThree(n):
        """
        :type n: int
        :rtype: bool
        """
        return n > 0 and pow(3,19) % n == 0 # since 2^32 is apporx. 3^19, so n is a power of 3 if it devides 3^19
