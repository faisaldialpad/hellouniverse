class TopKFrequent:
    def top_k_frequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        freq_map = {}
        rev_feq_list = [None] * len(nums)  # This can maximally be len(nums). So, we can do bucket sort.
        for n in nums:
            freq_map[n] = freq_map.get(n, 0) + 1

        for key in freq_map.keys():
            index = freq_map[key] - 1 # 0 index based.
            if not rev_feq_list[index]:
                rev_feq_list[index] = []
            rev_feq_list[index].append(key)

        ret = []
        for i in range(len(rev_feq_list) - 1, -1, -1):
            if len(ret) >= k:
                break
            if rev_feq_list[i]:
                ret.extend(rev_feq_list[i])

        return ret
