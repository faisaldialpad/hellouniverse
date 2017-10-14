using System;
using NUnit.Framework;

namespace HelloUniverse.Tests
{
    [TestFixture]
    public class SymmetricTreeTests
    {
        [TestCase]
        public void CornerCases()
        {
            Assert.IsTrue(SymmetricTree.IsSymmetric(null));
            Assert.IsTrue(SymmetricTree.IsSymmetric(new SymmetricTree.TreeNode(5)));
        }

        [TestCase]
        public void SymmetricCases()
        {
            var t = new SymmetricTree.TreeNode(1);
            t.left= new SymmetricTree.TreeNode(2);
            t.right = new SymmetricTree.TreeNode(2);
            t.left.left = new SymmetricTree.TreeNode(3);
            t.left.right = new SymmetricTree.TreeNode(4);
            t.right.left = new SymmetricTree.TreeNode(4);
            t.right.right = new SymmetricTree.TreeNode(3);
            Assert.IsTrue(SymmetricTree.IsSymmetric(t));
        }

        [TestCase]
        public void NonSymmetricCases()
        {
            var t = new SymmetricTree.TreeNode(1);
            t.left = new SymmetricTree.TreeNode(2);
            t.right = new SymmetricTree.TreeNode(2);
            t.left.right = new SymmetricTree.TreeNode(3);
            t.right.right = new SymmetricTree.TreeNode(3);
            Assert.IsFalse(SymmetricTree.IsSymmetric(t));
        }
    }
}
