from unittest import TestCase

from dev.trees.invert_binary_tree import InvertBinaryTree
from tests.trees.common import Common


class TestInvertBinaryTree(TestCase):
    def test_invert(self):
        t1 = InvertBinaryTree.TreeNode(4)
        t1.left = InvertBinaryTree.TreeNode(2)
        t1.right = InvertBinaryTree.TreeNode(7)
        t1.left.left = InvertBinaryTree.TreeNode(1)
        t1.left.right = InvertBinaryTree.TreeNode(3)
        t1.right.left = InvertBinaryTree.TreeNode(6)
        t1.right.right = InvertBinaryTree.TreeNode(9)

        t2 = InvertBinaryTree.TreeNode(4)
        t2.left = InvertBinaryTree.TreeNode(7)
        t2.right = InvertBinaryTree.TreeNode(2)
        t2.left.left = InvertBinaryTree.TreeNode(9)
        t2.left.right = InvertBinaryTree.TreeNode(6)
        t2.right.left = InvertBinaryTree.TreeNode(3)
        t2.right.right = InvertBinaryTree.TreeNode(1)
        self.assertEqual(Common.serialize(t2), Common.serialize(InvertBinaryTree().invert(t1)))
