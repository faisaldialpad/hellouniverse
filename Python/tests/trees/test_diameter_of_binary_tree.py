from unittest import TestCase

from dev.trees.diameter_of_binary_tree import DiameterOfBinaryTree


class TestDiameterOfBinaryTree(TestCase):
    def test_calculate_diameter(self):
        t1 = DiameterOfBinaryTree.TreeNode(1)
        t1.left = DiameterOfBinaryTree.TreeNode(2)
        t1.right = DiameterOfBinaryTree.TreeNode(3)
        t1.left.left = DiameterOfBinaryTree.TreeNode(4)
        t1.left.right = DiameterOfBinaryTree.TreeNode(5)
        self.assertEqual(3, DiameterOfBinaryTree.calculate_diameter(t1))
