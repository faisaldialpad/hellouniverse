"""
https://leetcode.com/problems/jump-game/description/
55. Jump Game

Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

Example 1:

Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum
             jump length is 0, which makes it impossible to reach the last index.
"""


class JumpGame(object):
    def can_jump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        return self.can_jump_opt(nums)

    def can_jump_dp(self, nums):
        result = [False] * len(nums)  # result[i] can reach to the last from i. So, result[0] is the answer.
        result[len(nums) - 1] = True  # Can jump last from last.

        for i in range(len(nums) - 2, -1, -1):
            # From 2nd to last start the loop.
            j = i + 1
            while j <= i + nums[i] and j < len(nums):
                if result[j]:
                    result[i] = True
                    break
                j += 1
        return result[0]

    def can_jump_opt(self, nums):
        last_good_index = len(nums) - 1
        for i in range(len(nums) - 2, -1, -1):
            if i + nums[i] >= last_good_index:
                last_good_index = i
        return last_good_index == 0
