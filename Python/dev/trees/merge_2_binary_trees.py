class Merge2BinaryTrees:
    def merge(self, t1, t2):
        """
        :type t1: TreeNode
        :type t2: TreeNode
        :rtype: TreeNode
        """
        #  can also be done iteratively by a stack
        if not t1:
            return t2  # or copy(t2) if new tree need to be created
        if not t2:
            return t1  # or copy(t1) if new tree need to be created
        t1.val += t2.val  # or t = TreeNode(t1.val + t2.val) if new tree need to be created
        t1.left = self.merge(t1.left, t2.left)  # or t.left = self.merge(t1.left, t2.left)
        t1.right = self.merge(t1.right, t2.right)  # or t.left = self.merge(t1.left, t2.left)
        return t1  # or return t for new tree

    # Definition for a binary tree node.
    class TreeNode:
        def __init__(self, x):
            self.val = x
            self.left = None
            self.right = None
