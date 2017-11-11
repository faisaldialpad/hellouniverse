class MajorityElement:
    @staticmethod
    def find_majority_element(nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # boyer-moore voting algorithm. Idea is if we cancel each item with any other item other than itself,
        # at the end the majority item will be available. This algorithm only works if majority element exists.
        # if no such item exists, this algorithm would still return a value. So, if the existence is not guaranteed
        # then we have to to another O(n) pass to check that the element returned is actually majority.
        # Btw, using a hash map is trivial solution.
        if not nums:
            return None
        majority = nums[0]
        count = 1
        for i in range(1, len(nums)):
            if majority == nums[i]:
                count += 1
            else:
                count -= 1
            if count == 0:
                majority = nums[i]
                count = 1
        return majority
