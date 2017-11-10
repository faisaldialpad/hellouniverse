class ContainerWithMostWater:
    @staticmethod
    def calculate_max_area(height):
        """
        :type height: List[int]
        :rtype: int
        """
        if not height:
            return 0
        left = 0
        right = len(height) - 1
        max_area = 0
        while left < right:
            min_height = min(height[left], height[right])
            area = min_height * (right - left)
            if area > max_area:
                max_area = area
            # the lower height is moved. It can be safely moved because if A(l,r) denote the area between l and r,
            # and h[l] < h[r] so now we consider A(l+1,r). As a result, we missed considering A(l, r-1), A(l, r-2),
            # etc., but these areas will always be smaller than A(l,r) because area is calculated by the smaller of
            # h[l] and h[r], and for A(l, r-1), A(l, r-2), etc., l (the smaller height) remain the same and in addition,
            # width is smaller than (r-l)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return max_area
