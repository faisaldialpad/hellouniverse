class InvertBinaryTree:
    def invert(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        #  can be solved iteratively using a queue
        if not root:
            return None  # already inverted
        left = root.left
        root.left = self.invert(root.right)
        root.right = self.invert(left)
        return root

    # Definition for a binary tree node.
    class TreeNode:
        def __init__(self, x):
            self.val = x
            self.left = None
            self.right = None