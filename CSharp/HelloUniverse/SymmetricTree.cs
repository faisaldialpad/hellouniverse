using System;
namespace HelloUniverse
{
    public class SymmetricTree
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

        public static bool IsSymmetric(TreeNode root)
        {
            if(root == null)
            {
                return true;
            }

            return IsMirror(root.left, root.right);
        }

        private static bool IsMirror(TreeNode r1, TreeNode r2)
        {
            if(r1 == null && r2 == null)
            {
                return true;
            }

            if(r1 == null || r2 == null)
            {
                return false;
            }

            return r1.val == r2.val
                     && IsMirror(r1.left, r2.right)
                     && IsMirror(r1.right, r2.left);
        }
    }
}
