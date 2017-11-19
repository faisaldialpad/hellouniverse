class DiameterOfBinaryTree:
    @staticmethod
    def calculate_diameter(root):
        """
        :type root: TreeNode
        :rtype: int
        """

        # diameter through a node is the sum of the maxdepth of its left subtree and right subtree
        # but we need to calculate the diameter through each node and return the max of them

        def max_depth(node, dia):
            if not node:
                return 0
            left_depth = max_depth(node.left, dia)
            right_depth = max_depth(node.right, dia)
            if left_depth + right_depth > dia[0]:
                dia[0] = left_depth + right_depth
            return max(left_depth, right_depth) + 1

        diameter = [0]
        max_depth(root, diameter)
        return diameter[0]

    # Definition for a binary tree node.
    class TreeNode:
        def __init__(self, x):
            self.val = x
            self.left = None
            self.right = None
