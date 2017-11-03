class HasDuplicate:
    @staticmethod
    def has_duplicate(nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        item_set = set()
        for n in nums:
            if n in item_set:
                return True
            else:
                item_set.add(n)
        return False
