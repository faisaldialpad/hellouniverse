class KthSmallestBst:
    def find_kth_smallest(self, root, k):
        """
        In order traversal of BST is sorted!
        A simpler solution would be to save in order traversal in an array arr and return arr[k - 1]
        This solution, however, stops the traversal as soon as the kth smallest is found.
        :type root: TreeNode
        :type k: int
        :rtype: int
        """
        k_ref = [k]
        return self.__in_order(root, k_ref)

    def __in_order(self, root, k_ref):
        if not root:
            return None
        left = self.__in_order(root.left, k_ref)
        if left is not None:
            return left
        k_ref[0] -= 1
        if k_ref[0] == 0:
            return root.val
        right = self.__in_order(root.right, k_ref)
        if right is not None:  # need to distinguish between 0 and None. That's why (if right:) is no good
            return right
        return None

    # Definition for a binary tree node.
    class TreeNode:
        def __init__(self, x):
            self.val = x
            self.left = None
            self.right = None