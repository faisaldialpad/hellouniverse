using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;

namespace HelloUniverse.Tests
{
    [TestFixture]
    public class TreeFromPreorderInorderTests
    {
        [Test]
        public void CornerCases()
        {
            Assert.AreEqual(null, TreeFromPreorderInorder.BuildTree(null, null));
            Assert.AreEqual(null, TreeFromPreorderInorder.BuildTree(new int[0], new int[0]));
            Assert.AreEqual(new TreeFromPreorderInorder.TreeNode(5).val, TreeFromPreorderInorder.BuildTree(new int[]{5}, new int[]{5}).val);
        }

        [Test]
        public void NormalCases()
        {
            var t = TreeFromPreorderInorder.BuildTree(new[] {1, 2, 4, 5, 3, 6}, new[] {4, 2, 5, 1, 6, 3});
            Assert.AreEqual(1, t.val);
            Assert.AreEqual(2, t.left.val);
            Assert.AreEqual(3, t.right.val);
            Assert.AreEqual(4, t.left.left.val);
            Assert.AreEqual(5, t.left.right.val);
            Assert.AreEqual(6, t.right.left.val);
        }
    }
}
