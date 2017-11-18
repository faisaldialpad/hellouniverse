from unittest import TestCase

from dev.trees.merge_2_binary_trees import Merge2BinaryTrees
from tests.trees.common import Common


class TestMerge2BinaryTrees(TestCase):
    def test_merge(self):
        t1 = Merge2BinaryTrees.TreeNode(1)
        t1.left = Merge2BinaryTrees.TreeNode(3)
        t1.right = Merge2BinaryTrees.TreeNode(2)
        t1.left.left = Merge2BinaryTrees.TreeNode(5)

        t2 = Merge2BinaryTrees.TreeNode(2)
        t2.left = Merge2BinaryTrees.TreeNode(1)
        t2.right = Merge2BinaryTrees.TreeNode(3)
        t2.left.right = Merge2BinaryTrees.TreeNode(4)
        t2.right.right = Merge2BinaryTrees.TreeNode(7)

        t = Merge2BinaryTrees.TreeNode(3)
        t.left = Merge2BinaryTrees.TreeNode(4)
        t.right = Merge2BinaryTrees.TreeNode(5)
        t.left.left = Merge2BinaryTrees.TreeNode(5)
        t.left.right = Merge2BinaryTrees.TreeNode(4)
        t.right.right = Merge2BinaryTrees.TreeNode(7)

        self.assertEqual(Common.serialize(t), Common.serialize(Merge2BinaryTrees().merge(t1, t2)))
