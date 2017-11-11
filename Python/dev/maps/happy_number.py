class HappyNumber(object):
    def is_happy(self, n):
        """
        obvious solution is to use a set!
        :type n: int
        :rtype: bool
        """
        slow = n
        fast = n
        while True:
            # this is how do-while is implemented (while True: stuff() if fail_condition: break)
            #  similar to cycle detection in linked lists
            slow = self.__next(slow)
            fast = self.__next(fast)
            fast = self.__next(fast)
            if slow == 1 or fast == 1:  # although checking just fast == 1 is enough
                return True
            elif slow == fast:
                return False

    @staticmethod
    def __next(n):
        total = 0
        while n > 0:
            rem = n % 10
            total += (rem * rem)
            n = int(n / 10)
        return total
