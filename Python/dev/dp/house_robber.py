class HouseRobber:
    @staticmethod
    def rob(nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # A[i] is total money up to house i. A[0] = nums[0], A[1] = max(nums[0], nums[1]),
        # A[n] = max(A[n-1], nums[n] + A[n-2])
        if not nums:
            return 0
        if len(nums) == 1:
            return nums[0]
        table = [0] * len(nums)
        table[0] = nums[0]
        table[1] = max(nums[0], nums[1])
        for i in range(2, len(nums)):
            table[i] = max(table[i-1], nums[i] + table[i-2])
        return table[len(nums) - 1]

    @staticmethod
    def rob(nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        if len(nums) == 1:
            return nums[0]
        prev_robbed = nums[0]
        prev_not_robbed = 0
        for i in range(1, len(nums)):
            temp = prev_robbed
            prev_robbed = prev_not_robbed + nums[i]
            prev_not_robbed = max(temp, prev_not_robbed)
        return max(prev_robbed, prev_not_robbed)
