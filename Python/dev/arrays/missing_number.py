class MissingNumber:
    @staticmethod
    def find(nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sum_nums =0
        sum_i =0
        for i in range(0, len(nums)):
            sum_nums += nums[i]
            sum_i += i
        sum_i += len(nums)
        return sum_i - sum_nums
