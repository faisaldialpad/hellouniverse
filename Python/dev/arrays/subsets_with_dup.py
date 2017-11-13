class SubsetsWithDup:
    @staticmethod
    def calculate_subsets_with_dup(nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        ret = [[]]
        if not nums:
            return ret
        nums.sort()  # this is ok for subset because sort is nlogn and subset is 2^n
        for i in range(0, len(nums)):
            start_index = size if i > 0 and nums[i] == nums[i-1] else 0
            # if duplicate item start from last size else start from beginning
            # {1,2} -> {},{1},{2},{1,2} so for {1,2,2} we want to add 2 to {2}, and {1,2} so that the answer is
            # {1,2,2} -> {},{1},{2},{1,2},{2,2},{1,2,2}. It means the start index is 2 (the size of last iteration)
            size = len(ret)
            for j in range(start_index, size):
                if i == 0 or nums[i] != nums[i-1] or nums[i] in ret[j]:
                    new_sub_set = list(ret[j])
                    new_sub_set.append(nums[i])
                    ret.append(new_sub_set)
        return ret
