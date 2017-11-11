using System;
using System.Collections.Generic;

namespace HelloUniverse
{
    public class TreeFromPreorderInorder
    {
        public class TreeNode
        {
            public int val;
            public TreeNode left;
            public TreeNode right;
            public TreeNode(int x)
            {
                val = x;
            }
        }

        public static TreeNode BuildTree(int[] preorder, int[] inorder)
        {
            if (preorder == null || preorder.Length == 0 || inorder == null || inorder.Length == 0)
            {
                return null;
            }

            if (preorder.Length != inorder.Length)
            {
                throw new Exception("Length of both arrays must be same");
            }
            var inOrderMap = new Dictionary<int, int>();
            for (var i = 0; i < inorder.Length; i++)
            {
                inOrderMap.Add(inorder[i], i);
            }


            return BuildTree(preorder, 0, preorder.Length -1, inOrderMap, 0, inorder.Length - 1);
        }
        private static TreeNode BuildTree(int[] preorder, int preStart, int preEnd, Dictionary<int, int> inOrderMap, int inStart, int inEnd)
        {
            if (preStart > preEnd || inStart > inEnd)
            {
                return null;
            }

            var root = new TreeNode(preorder[preStart]);
            var rootPositionInOrder = inOrderMap[root.val];
            var numsLeft = rootPositionInOrder - inStart;

            root.left = BuildTree(preorder, preStart+1, preStart + numsLeft, inOrderMap, inStart, rootPositionInOrder - 1);
            root.right = BuildTree(preorder, preStart + numsLeft + 1, preEnd, inOrderMap, rootPositionInOrder + 1, inEnd);

            return root;
        }

        /*
        // easy to understand solution
        public TreeNode BuildTree(int[] preorder, int[] inorder)
        {
            if (preorder == null || preorder.Length == 0 || inorder == null || inorder.Length == 0)
            {
                return null;
            }

            if (preorder.Length != inorder.Length)
            {
                throw new Exception("Length of both arrays must be same");
            }

            var root = new TreeNode(preorder[0]);
            var leftPreorder = new List<int>();
            var rightPreorder = new List<int>();
            var leftInorder = new List<int>();
            var rightInorder = new List<int>();
            var set = new HashSet<int>();
            var rootFound = false;
            foreach (var t in inorder)
            {
                if (t == preorder[0])
                {
                    rootFound = true;
                    continue;//skip this item because it is root
                }

                if (rootFound)
                {
                    rightInorder.Add(t);
                }
                else
                {
                    leftInorder.Add(t);
                    set.Add(t);
                }
            }

            for (var i = 1; i < preorder.Length; i++)
            {
                if (set.Contains(preorder[i]))
                {
                    leftPreorder.Add(preorder[i]);
                }
                else
                {
                    rightPreorder.Add(preorder[i]);
                }
            }

            root.left = BuildTree(leftPreorder.ToArray(), leftInorder.ToArray());
            root.right = BuildTree(rightPreorder.ToArray(), rightInorder.ToArray());

            return root;
        }
        */
    }
}
