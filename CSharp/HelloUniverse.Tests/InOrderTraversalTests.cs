using System;
using System.Collections.Generic;
using NUnit.Framework;

namespace HelloUniverse.Tests
{
    [TestFixture]
    public class InOrderTraversalTests
    {
        public delegate List<int> InOrderDelegate(InOrderTraversal.TreeNode root);

        [TestCaseSource(nameof(TestCases))]
        public void CornerCases(InOrderDelegate traverseFunc)
        {
            Assert.AreEqual(new List<int>(), traverseFunc(null));
            Assert.AreEqual(new List<int>{3}, traverseFunc(new InOrderTraversal.TreeNode(3)));
        }

        [TestCaseSource(nameof(TestCases))]
        public void LeftTreeOnly(InOrderDelegate traverseFunc)
        {
            var r = new InOrderTraversal.TreeNode(1);
            r.left = new InOrderTraversal.TreeNode(2);
            r.left.left = new InOrderTraversal.TreeNode(3);
            r.left.left.left = new InOrderTraversal.TreeNode(4);
            Assert.AreEqual(new List<int> { 4, 3, 2, 1 }, traverseFunc(r));
        }

        [TestCaseSource(nameof(TestCases))]
        public void RightTreeOnly(InOrderDelegate traverseFunc)
        {
            var r = new InOrderTraversal.TreeNode(1);
            r.right = new InOrderTraversal.TreeNode(2);
            r.right.right = new InOrderTraversal.TreeNode(3);
            r.right.right.right = new InOrderTraversal.TreeNode(4);
            Assert.AreEqual(new List<int> { 1, 2, 3, 4 }, traverseFunc(r));
        }

        [TestCaseSource(nameof(TestCases))]
        public void NormalTree(InOrderDelegate traverseFunc)
        {
            var r = new InOrderTraversal.TreeNode(1);
            r.left = new InOrderTraversal.TreeNode(2);
            r.right = new InOrderTraversal.TreeNode(3);
            r.left.left = new InOrderTraversal.TreeNode(4);
            r.left.right = new InOrderTraversal.TreeNode(5);
            r.right.left = new InOrderTraversal.TreeNode(6);
            r.right.right = new InOrderTraversal.TreeNode(7);
            Assert.AreEqual(new List<int> { 4, 2, 5, 1, 6, 3, 7 }, traverseFunc(r));
        }

        private static IEnumerable<TestCaseData> TestCases
        {
            get
            {
                yield return
                    new TestCaseData(new InOrderDelegate(InOrderTraversal.InorderTraversalIterative)).SetName(
                        nameof(InOrderTraversal.InorderTraversalIterative));
                yield return
                    new TestCaseData(new InOrderDelegate(InOrderTraversal.InorderTraversalRecursive)).SetName(
                        nameof(InOrderTraversal.InorderTraversalRecursive));
            }
        }
    }
}
