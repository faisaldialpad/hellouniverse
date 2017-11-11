class ReverseBits:
    # @param n, an integer
    # @return an integer
    @staticmethod
    def reverse(n):
        ret = 0
        for i in range(0, 32):
            ret <<= 1  # this needs to be before the next line (to create room)
            ret |= (n & 1)  # last bit of n
            n >>= 1
        return ret
