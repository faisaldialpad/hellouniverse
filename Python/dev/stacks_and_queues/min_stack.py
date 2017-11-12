class MinStack:
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.__stack = []
        self.__min_stack = []

    def push(self, x):
        """
        :type x: int
        :rtype: void
        """
        self.__stack.append(x)
        if len(self.__min_stack) == 0:
            self.__min_stack.append(x)
        else:
            self.__min_stack.append(min(self.__min_stack[len(self.__min_stack) - 1], x))

    def pop(self):
        """
        :rtype: void
        """
        if len(self.__min_stack) != 0:
            self.__min_stack.pop()
        if len(self.__stack) != 0:
            self.__stack.pop()  # why is this not returning!

    def top(self):
        """
        :rtype: int
        """
        if len(self.__stack) != 0:
            return self.__stack[len(self.__stack) - 1]
        else:
            return None

    def getMin(self):
        """
        :rtype: int
        """
        if len(self.__min_stack) != 0:
            return self.__min_stack[len(self.__min_stack) - 1]
        else:
            return None
