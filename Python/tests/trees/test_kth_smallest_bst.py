from unittest import TestCase

from dev.trees.kth_smallest_bst import KthSmallestBst


class TestKthSmallestBst(TestCase):
    def test_find_kth_smallest(self):
        root = KthSmallestBst.TreeNode(32)
        root.left = KthSmallestBst.TreeNode(31)
        root.right = KthSmallestBst.TreeNode(48)
        root.left.left = KthSmallestBst.TreeNode(3)
        #  root.left.right = None
        root.right.left = KthSmallestBst.TreeNode(38)
        root.right.right = KthSmallestBst.TreeNode(49)
        root.left.left.left = KthSmallestBst.TreeNode(0)
        root.left.left.right = KthSmallestBst.TreeNode(16)
        self.assertEqual(0, KthSmallestBst().find_kth_smallest(root, 1))
        self.assertEqual(3, KthSmallestBst().find_kth_smallest(root, 2))
        self.assertEqual(16, KthSmallestBst().find_kth_smallest(root, 3))
        self.assertEqual(31, KthSmallestBst().find_kth_smallest(root, 4))
        self.assertEqual(32, KthSmallestBst().find_kth_smallest(root, 5))
        self.assertEqual(38, KthSmallestBst().find_kth_smallest(root, 6))
        self.assertEqual(48, KthSmallestBst().find_kth_smallest(root, 7))
        self.assertEqual(49, KthSmallestBst().find_kth_smallest(root, 8))
