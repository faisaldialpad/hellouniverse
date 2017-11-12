class SingleNumber:
    @staticmethod
    def get_single_number(nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        result = 0
        for n in nums:
            result ^= n
        return result

    @staticmethod
    def get_single_number_no_bitwise(nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        return 2 * sum(set(nums)) - sum(nums)
