using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

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

            return BuildTree(preorder, inorder, 0, preorder.Length - 1, 0, inorder.Length - 1);
        }
        private static TreeNode BuildTree(int[] preorder, int[] inorder, int sPre, int ePre, int sIn, int eIn)
        {
            if (sPre > ePre || sIn > eIn)
            {
                return null;
            }

            var root = new TreeNode(preorder[sPre]);
            var set = new HashSet<int>();
            var rootPositionInOrder = 0;
            for (var i = sIn; i <= eIn; i++)
            {
                if (inorder[i] == preorder[sPre])
                {
                    rootPositionInOrder = i;
                    break;
                }

                set.Add(inorder[i]);
            }

            var leftPreEnd = sPre + 1;
            while (leftPreEnd <= ePre && set.Contains(preorder[leftPreEnd]))
            {
                leftPreEnd++;
            }
            
            root.left = BuildTree(preorder, inorder, sPre+1, leftPreEnd - 1, sIn, rootPositionInOrder - 1);
            root.right = BuildTree(preorder, inorder, leftPreEnd, ePre, rootPositionInOrder + 1, eIn);

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
