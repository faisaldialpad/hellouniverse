class ArrayProductWithoutSelf:
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ret = [1] * len(nums)
        for i in range(1, len(nums)):
            ret[i] = ret[i - 1] * nums[i - 1]  # ret[i] has prod of all from left (nums[0]) to nums[i-1]

        prod_right = 1
        for i in range(len(nums) - 2, -1, -1):
            prod_right *= nums[i + 1]  # similarly has prod of all from right (nums[n-1])  to nums[i+1]
            ret[i] *= prod_right

        return ret
