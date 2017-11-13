class Permutations:
    @staticmethod
    def permute_distinct(nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # nums do not have duplicates
        # recursive algorithm is similar
        # at each iteration we add the new number to each of the positions of previous iterations
        # [1,2]->[[1,2], [2,1]] if the new item is 3 then we have to add 3 in before 1, middle of 1,2, and after 2 for
        # [1,2], and we have to repeat the same for [2,1].
        if not nums:
            return []
        ret = [[nums[0]]]
        for i in range(1, len(nums)):
            new_ret = []
            for j in range(0, len(ret)):
                for k in range(0, len(ret[j]) + 1):
                    new_ret.append(ret[j][:k] + [nums[i]] + ret[j][k:])
            ret = new_ret
        return ret

    @staticmethod
    def permute_dup(nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # nums can have duplicate but result cannot
        if not nums:
            return []
        ret = [[nums[0]]]
        for i in range(1, len(nums)):
            new_ret = []
            for j in range(0, len(ret)):
                for k in range(0, len(ret[j]) + 1):
                    new_ret.append(ret[j][:k] + [nums[i]] + ret[j][k:])
                    if k < len(ret[j]) and ret[j][k] == nums[i]:
                        # when we add the new number if it is equal to the item in the current position
                        # then we do not have to continue further.
                        # a set could easily solve this also.
                        break
            ret = new_ret
        return ret
