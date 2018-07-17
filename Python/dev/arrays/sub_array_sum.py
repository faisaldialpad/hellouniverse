class SubArraySum:
    def total_count(self, nums, k):
        """
        https://leetcode.com/problems/subarray-sum-equals-k/description/
        O(n^2) time and O(1) space is acceptable. This, however, has O(n) time and O(n) space.
        Let's consider a simple case, when k = 0. In this case, first, we calculate the cumulative_sum up to each
        position of the array. Then, if 2 positions have the same cumulative_sum then the numbers between those
        positions must sum upto zero. For example:
        arr = [3, 4, 7, 2, -3, 1, 4, 2]
        cumulative_sum = [3, 7, 14, 16, 13, 14, 18, 20]

        So, [2, -3, 1] sub array sums to zero.

        Extending the same thought further, if the cumulative sum up to two indices, say i and j is at a difference of
        k i.e. if sum[i] - sum[j] = k, the sum of elements lying between indices i and j is k.

        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # count (sums to zero) == 1.
        cumulative_sum_map = {0: 1}
        count = 0
        cumulative_sum = 0
        for n in nums:
            cumulative_sum += n
            if cumulative_sum - k in cumulative_sum_map:
                # We can make a sub array with each previous positions.
                count += cumulative_sum_map.get(cumulative_sum - k)

            # Increment by 1 (with default=0).
            cumulative_sum_map[cumulative_sum] = cumulative_sum_map.get(cumulative_sum, 0) + 1
        return count
