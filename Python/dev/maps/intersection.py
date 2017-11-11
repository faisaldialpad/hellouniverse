class Intersection:
    @staticmethod
    def intersect_with_dup(nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        count_map = {}
        for n in nums1:
            if n in count_map:
                count_map[n] += 1
            else:
                count_map[n] = 1
        result = []

        for n in nums2:
            if n in count_map and count_map[n] > 0:
                count_map[n] -= 1
                result.append(n)

        return result

    @staticmethod
    def intersect_no_dup(nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        item_set = set()
        for n in nums1:
            item_set.add(n)

        result = []

        for n in nums2:
            if n in item_set:
                item_set.remove(n)
                result.append(n)

        return result
