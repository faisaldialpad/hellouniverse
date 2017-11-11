class RotateArray:
    @staticmethod
    def rotate(nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        k %= len(nums)
        count = 0
        for start_index in range(0, len(nums)):
            if count == len(nums):
                break;
            last_value = nums[start_index]
            next_index = start_index
            while True:
                next_index = (next_index + k) % len(nums)
                temp = nums[next_index]
                nums[next_index] = last_value
                last_value = temp
                count += 1
                if next_index == start_index:  # a do-while loop
                    break
