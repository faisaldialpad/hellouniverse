class CountAndSay:
    def get_nth_count_and_say(self, n):
        """
        :type n: int
        :rtype: str
        """
        result = "1"
        for i in range(2, n + 1):
            result = self.__get_count_and_say_str(result)
        return result

    @staticmethod
    def __get_count_and_say_str(n):
        """
        :type n: str
        :rtype: str
        """
        # this is not good for big numbers
        result = []
        digit_count = 1
        last_index = 0
        for i in range(1, len(n)):
            if n[i] == n[last_index]:
                digit_count += 1
            else:
                result.append(str(digit_count))
                result.append(str(n[last_index]))
                digit_count = 1
                last_index = i

        result.append(str(digit_count))
        result.append(str(n[last_index]))

        return "".join(result)

    @staticmethod
    def __get_count_and_say(n):
        """
        :type n: int
        :rtype: int
        """
        # this is not good for big numbers
        result = 0
        digit_count = 1
        last_digit = n % 10
        n = int(n / 10)
        while n != 0:
            digit = n % 10
            n = int(n / 10)
            if digit == last_digit:
                digit_count += 1
            else:
                result = result * 10 + last_digit
                result = result * 10 + digit_count  # add last_digit and digit_count in a reverse order
                digit_count = 1
                last_digit = digit

        result = result * 10 + last_digit
        result = result * 10 + digit_count  # add last_digit and digit_count in a reverse order

        ret = 0
        # reverse result and return
        while result != 0:
            ret = ret * 10 + (result % 10)
            result = int(result / 10)

        return ret
