class FindDuplicate:
    def findDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # Similar to linedlist cycle detection.
        slow = nums[nums[0]]
        fast = nums[nums[nums[0]]]
        while slow != fast:
            slow = nums[slow]
            fast = nums[nums[fast]]

        fast = nums[0]
        while fast != slow:
            fast = nums[fast]
            slow = nums[slow]

        return fast