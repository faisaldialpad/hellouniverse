class ClimbStairs:
    @staticmethod
    def find_nth_fibo(n):
        """
        :type n: int
        :rtype: int
        """
        if n <= 1:
            return 1
        first = 1
        second = 2  # for real Fibonacci sequence this is 1
        for i in range(3, n+1):
            temp = first + second
            first = second
            second = temp
        return second
