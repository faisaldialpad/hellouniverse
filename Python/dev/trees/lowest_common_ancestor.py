class LowestCommonAncestor(object):
    def get_lca_binary_tree(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        if not root or p == root or q == root:
            return root
        left = self.get_lca_binary_tree(root.left, p, q)
        right = self.get_lca_binary_tree(root.right, p, q)
        if left and right:
            return root
        if left:
            return left
        else:
            return

    def get_lca_bst(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        if not root or not p or not q:
            return None
        if p.val < root.val and q.val < root.val:
            return self.get_lca_bst(root.left, p, q)
        elif root.val < p.val and root.val < q.val:
            return self.get_lca_bst(root.right, p, q)
        else:
            return root

    # Definition for a binary tree node.
    class TreeNode:
        def __init__(self, x):
            self.val = x
            self.left = None
            self.right = None
