using System;
using System.Collections.Generic;

namespace HelloUniverse
{
    public static class InOrderTraversal
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

        public static List<int> InorderTraversalIterative(TreeNode root)
        {
            var result = new List<int>();
            var st = new Stack<TreeNode>();
            var cur = root;
            while(st.Count != 0 || cur != null)
            {
                while(cur != null)
                {
                    st.Push(cur);
                    cur = cur.left;
                }

                cur = st.Pop();
                result.Add(cur.val);
                cur = cur.right;
            }

            return result;
        }

        public static List<int> InorderTraversalRecursive(TreeNode root)
        {
            if(root == null)
            {
                return new List<int>();
            }

            var left = InorderTraversalRecursive(root.left);
            var right = InorderTraversalRecursive(root.right);

            left.Add(root.val);
            left.AddRange(right);

            return left;
        }
    }
}
