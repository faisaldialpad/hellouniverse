class Merge2SortedArraysIntoFirst:
    @staticmethod
    def merge(nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        size = m + n
        while size >= 1 and m >= 1 and n >= 1:
            if nums1[m - 1] > nums2[n - 1]:
                nums1[size - 1] = nums1[m - 1]
                m -= 1
            else:
                nums1[size - 1] = nums2[n - 1]
                n -= 1
            size -= 1

        # if 2nd array still remaining, fill up the result with 2nd array
        # (if 1st array is remaining it would be in place already!)
        while n >= 1:
            nums1[n - 1] = nums2[n - 1]
            n -= 1
