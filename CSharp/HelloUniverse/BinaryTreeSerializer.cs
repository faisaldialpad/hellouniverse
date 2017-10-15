using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace HelloUniverse
{
    /*
     * There are few ways to do it:
     * 1. A tree can be represented as an array and then the array can be serialized and deserialized. 
     * Stright forward. Needs dynamic array. Lots of null values.  
     * 
     * 2. Serialized by doing inorder and preorder traversal. Then deserilization becomes this problem https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
     * This is easy to understand but requires double of space (specially if we are saving lots of data in the tree node).
     * 
     * 3. Serialized by doing preorder traversal only but saving the nulls otherwise we will not be able to construct the tree.
     * This is better than the previous solution because 
     * although the number of null nodes are likely to be more than the actual node in a tree, null takes less space to store than nodes with big data.
     * 
     * 4. Serialized by preorder traversal while not storing null and indicating the leaf nodes so that we know when to go to the right tree of the parent.
     * This is the most efficient.
     * 
     */
    public static class BinaryTreeSerializer
    {

        #region SerializeUsingArray (passed most test cases in leetcod, but memory limit exceeded)
        public static string SerializeUsingArray(TreeNode root)
        {
            var treeArray = new List<int?>();

            if (root == null)
            {
                return string.Empty;
            }

            var queue = new Queue<Tuple<TreeNode, int>>(); // node and its position in the array. BFS.
            queue.Enqueue(new Tuple<TreeNode, int>(root, 0));

            while (queue.Count != 0)
            {
                var q = queue.Dequeue();
                if (q.Item1.left != null)
                {
                    queue.Enqueue(new Tuple<TreeNode, int>(q.Item1.left, 2*q.Item2 + 1));
                }

                if (q.Item1.right != null)
                {
                    queue.Enqueue(new Tuple<TreeNode, int>(q.Item1.right, 2 * q.Item2 + 2));
                }

                while (treeArray.Count < q.Item2 + 1)
                {
                    treeArray.Add(null);
                }

                treeArray[q.Item2] = q.Item1.val;
            }

            return SerializeList(treeArray);
        }

        // Decodes your encoded data to tree.
        public static TreeNode DeserializeUsingArray(string data)
        {
            var treeArray = DeserializeList(data);
            return BuildTree(treeArray, 0);
        }

        private static TreeNode BuildTree(List<int?> treeAsList, int index)
        {
            if (treeAsList == null || index >= treeAsList.Count || !treeAsList[index].HasValue)
            {
                return null;
            }

            return new TreeNode(treeAsList[index].Value)
            {
                left = BuildTree(treeAsList, index*2 + 1),
                right = BuildTree(treeAsList, index*2 + 2)
            };
        }
        #endregion

        #region SerializeUsingPeorderWithNull (leetcode accepted)
        public static string SerializeUsingPeorderWithNull(TreeNode root)
        {
            var result = new List<int?>();
            SerializeUsingPeorderWithNullRecursive(root, result);
            return SerializeList(result);
        }

        public static TreeNode DeserializeUsingPeorderWithNull(string data)
        {
            var list = DeserializeList(data);
            var index = 0;
            return DeserializeUsingPeorderWithNullRecursive(list, ref index);
        }

        private static TreeNode DeserializeUsingPeorderWithNullRecursive(List<int?> list, ref int index)
        {
            if (list == null || index >= list.Count)
            {
                return null;
            }

            var current = list[index];
            index++; //current is processed (including null)

            if (!current.HasValue)
            {
                return null;
            }

            var node = new TreeNode(current.Value)
            {
                left = DeserializeUsingPeorderWithNullRecursive(list, ref index), //index will be updated after this call. All in the left subtree comes before any nodes in the right subtree for preorder.
                right = DeserializeUsingPeorderWithNullRecursive(list, ref index)
            };

            return node;
        }

        private static void SerializeUsingPeorderWithNullRecursive(TreeNode root, List<int?> result)
        {
            if (root == null)
            {
                result.Add(null);
                return;
            }

            result.Add(root.val);
            SerializeUsingPeorderWithNullRecursive(root.left, result);
            SerializeUsingPeorderWithNullRecursive(root.right, result);
        }
        #endregion

        #region SerializeUsingPeorderWithLeafMarked
        private const char Separator = ',';
        private const char LeafMarker = '*';
        public static string SerializeUsingPeorderWithLeafMarked(TreeNode root)
        {
            var result = new StringBuilder();
            SerializeUsingPeorderWithLeafMarkedRecursive(root, result);
            return result.Length == 0 ? string.Empty : result.ToString(1, result.Length - 1);
        }

        public static TreeNode DeserializeUsingPeorderWithLeafMarked(string data)
        {
            var index = 0;
            return DeserializeUsingPeorderWithLeafMarkedRecursive(data.Split(','), ref index);
        }

        private static TreeNode DeserializeUsingPeorderWithLeafMarkedRecursive(string[] list, ref int index)
        {
            if (list == null || index >= list.Length)
            {
                return null;
            }

            var current = list[index];
            index++; //current is processed (including null)

            if (string.IsNullOrEmpty(current))
            {
                return null;
            }

            var leaf = current.EndsWith("*");
            int n;
            if (leaf)
            {
                int.TryParse(current.Substring(0, current.Length - 1), out n);
                return new TreeNode(n);
            }

            int.TryParse(current, out n);
            var node = new TreeNode(n)
            {
                left = DeserializeUsingPeorderWithLeafMarkedRecursive(list, ref index), //index will be updated after this call. All in the left subtree comes before any nodes in the right subtree for preorder.
                right = DeserializeUsingPeorderWithLeafMarkedRecursive(list, ref index)
            };

            return node;
        }

        private static void SerializeUsingPeorderWithLeafMarkedRecursive(TreeNode root, StringBuilder result)
        {
            if (root == null)
            {
                result.Append(Separator);
                return;
            }

            result.Append(Separator);
            result.Append(root.val);

            if (root.left == null && root.right == null)
            {
                result.Append(LeafMarker);
                return;
            }

            SerializeUsingPeorderWithLeafMarkedRecursive(root.left, result);
            SerializeUsingPeorderWithLeafMarkedRecursive(root.right, result);
        }
        #endregion

        private static string SerializeList(List<int?> list)
        {
            return string.Join(",", list.Select(_ => _.HasValue ? _.ToString() : "").ToArray());
        }

        private static List<int?> DeserializeList(string s)
        {
            return s.Split(',').Select(_ =>
            {
                int v;
                if (!int.TryParse(_, out v))
                {
                    return null;
                }

                return (int?)v;
            }).ToList();
        }

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
    }
}
