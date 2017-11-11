class RemoveDupSorted:
    @staticmethod
    def remove(nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0

        result_index = 1  # first item is not duplicate
        while result_index < len(nums) and nums[result_index] != nums[result_index - 1]:  # find the 1st dup
            result_index += 1

        if result_index == len(nums):  # no duplicates
            return result_index

        #  item at result_index is the dup value, so we decrement
        result_index -= 1
        for i in range(result_index + 1, len(nums)):
            if nums[result_index] != nums[i]:
                result_index += 1
                nums[result_index] = nums[i]
        return result_index + 1  # need to return the length



