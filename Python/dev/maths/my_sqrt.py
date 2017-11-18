class MySqrt:
    @staticmethod
    def calculate_sqrt(x):
        """
        :type x: int
        :rtype: int
        """
        if x <= 1:
            return x  # no neg numbers
        # binary search
        start = 0
        end = int(x / 2) + 1  # sqrt of x is between 0 and x/2
        while True:  # this will always converge
            mid = int((end - start) / 2) + start
            if mid * mid > x:
                end = mid
            elif (mid + 1) * (mid + 1) > x:
                return mid  # if mid^2 is not bigger than x but (mid+1)^2 is then mid must be the answer
            else:
                start = mid

        return -1  # this should never happen
