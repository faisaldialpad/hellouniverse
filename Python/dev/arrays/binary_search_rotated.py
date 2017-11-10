class BinarySearchRotated:
    @staticmethod
    def search(nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        #  in an interview test this algorithm using smaller inputs like array of size 1, 2, 3, 4
        if not nums:
            return -1
        left = 0
        right = len(nums) - 1
        while left <= right:
            mid = int((left + right)/2)
            if target == nums[mid]:
                return mid
            if nums[left] <= nums[mid]:  # left half is properly sorted and right half is weird
                if nums[left] <= target < nums[mid]:
                    right = mid - 1
                else:
                    left = mid + 1
            else:  # right half is properly sorted and left half is weird
                if nums[mid] < target <= nums[right]:
                    left = mid + 1
                else:
                    right = mid - 1
        return -1
