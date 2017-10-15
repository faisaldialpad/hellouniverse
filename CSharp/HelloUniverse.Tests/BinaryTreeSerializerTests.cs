using System;
using System.Collections.Generic;
using NUnit.Framework;

namespace HelloUniverse.Tests
{
    [TestFixture]
    public class BinaryTreeSerializerTests
    {

        public delegate string SerializerDelegate(BinaryTreeSerializer.TreeNode root);
        public delegate BinaryTreeSerializer.TreeNode DeserializerDelegate(string tree);

        private static IEnumerable<TestCaseData> TreeSerializeDeserializeTestCases
        {
            get
            {
                var normalTree = new BinaryTreeSerializer.TreeNode(1)
                {
                    left = new BinaryTreeSerializer.TreeNode(2),
                    right = new BinaryTreeSerializer.TreeNode(3)
                    {
                        left = new BinaryTreeSerializer.TreeNode(6),
                        right = new BinaryTreeSerializer.TreeNode(7)
                    }
                };
                yield return
                    new TestCaseData(
                        new SerializerDelegate(BinaryTreeSerializer.SerializeUsingArray), 
                        new DeserializerDelegate(BinaryTreeSerializer.DeserializeUsingArray), 
                        new Tuple<string, BinaryTreeSerializer.TreeNode>("1,2,3,,,6,7", normalTree))
                    .SetName($"{nameof(normalTree)}-{nameof(BinaryTreeSerializer.SerializeUsingArray)}");

                yield return
                    new TestCaseData(
                        new SerializerDelegate(BinaryTreeSerializer.SerializeUsingPeorderWithNull),
                        new DeserializerDelegate(BinaryTreeSerializer.DeserializeUsingPeorderWithNull),
                        new Tuple<string, BinaryTreeSerializer.TreeNode>("1,2,,,3,6,,,7,,", normalTree))
                    .SetName($"{nameof(normalTree)}-{nameof(BinaryTreeSerializer.SerializeUsingPeorderWithNull)}");

                yield return
                    new TestCaseData(
                        new SerializerDelegate(BinaryTreeSerializer.SerializeUsingPeorderWithLeafMarked),
                        new DeserializerDelegate(BinaryTreeSerializer.DeserializeUsingPeorderWithLeafMarked),
                        new Tuple<string, BinaryTreeSerializer.TreeNode>("1,2*,3,6*,7*", normalTree))
                    .SetName($"{nameof(normalTree)}-{nameof(BinaryTreeSerializer.SerializeUsingPeorderWithLeafMarked)}");


                var completeTree = new BinaryTreeSerializer.TreeNode(1)
                {
                    left = new BinaryTreeSerializer.TreeNode(2)
                    {
                        left = new BinaryTreeSerializer.TreeNode(4),
                        right = new BinaryTreeSerializer.TreeNode(5)
                    },
                    right = new BinaryTreeSerializer.TreeNode(3)
                    {
                        left = new BinaryTreeSerializer.TreeNode(6),
                        right = new BinaryTreeSerializer.TreeNode(7)
                    }
                };
                yield return
                    new TestCaseData(
                        new SerializerDelegate(BinaryTreeSerializer.SerializeUsingArray), 
                        new DeserializerDelegate(BinaryTreeSerializer.DeserializeUsingArray),
                        new Tuple<string, BinaryTreeSerializer.TreeNode>("1,2,3,4,5,6,7", completeTree))
                    .SetName($"{nameof(completeTree)}-{nameof(BinaryTreeSerializer.SerializeUsingArray)}");
                yield return
                   new TestCaseData(
                       new SerializerDelegate(BinaryTreeSerializer.SerializeUsingPeorderWithNull),
                       new DeserializerDelegate(BinaryTreeSerializer.DeserializeUsingPeorderWithNull),
                       new Tuple<string, BinaryTreeSerializer.TreeNode>("1,2,4,,,5,,,3,6,,,7,,", completeTree))
                   .SetName($"{nameof(completeTree)}-{nameof(BinaryTreeSerializer.SerializeUsingPeorderWithNull)}");
                yield return
                   new TestCaseData(
                       new SerializerDelegate(BinaryTreeSerializer.SerializeUsingPeorderWithLeafMarked),
                       new DeserializerDelegate(BinaryTreeSerializer.DeserializeUsingPeorderWithLeafMarked),
                       new Tuple<string, BinaryTreeSerializer.TreeNode>("1,2,4*,5*,3,6*,7*", completeTree))
                   .SetName($"{nameof(completeTree)}-{nameof(BinaryTreeSerializer.SerializeUsingPeorderWithLeafMarked)}");

                var rightOnlyTree = new BinaryTreeSerializer.TreeNode(1)
                {
                    right = new BinaryTreeSerializer.TreeNode(3)
                    {
                        right = new BinaryTreeSerializer.TreeNode(7)
                    }
                };
                yield return
                    new TestCaseData(
                        new SerializerDelegate(BinaryTreeSerializer.SerializeUsingArray), 
                        new DeserializerDelegate(BinaryTreeSerializer.DeserializeUsingArray),
                        new Tuple<string, BinaryTreeSerializer.TreeNode>("1,,3,,,,7", rightOnlyTree))
                    .SetName($"{nameof(rightOnlyTree)}-{nameof(BinaryTreeSerializer.SerializeUsingArray)}");
                yield return
                    new TestCaseData(
                        new SerializerDelegate(BinaryTreeSerializer.SerializeUsingPeorderWithNull),
                        new DeserializerDelegate(BinaryTreeSerializer.DeserializeUsingPeorderWithNull),
                        new Tuple<string, BinaryTreeSerializer.TreeNode>("1,,3,,7,,", rightOnlyTree))
                        .SetName($"{nameof(rightOnlyTree)}-{nameof(BinaryTreeSerializer.SerializeUsingPeorderWithNull)}");
                yield return
                   new TestCaseData(
                       new SerializerDelegate(BinaryTreeSerializer.SerializeUsingPeorderWithLeafMarked),
                       new DeserializerDelegate(BinaryTreeSerializer.DeserializeUsingPeorderWithLeafMarked),
                       new Tuple<string, BinaryTreeSerializer.TreeNode>("1,,3,,7*", rightOnlyTree))
                       .SetName($"{nameof(rightOnlyTree)}-{nameof(BinaryTreeSerializer.SerializeUsingPeorderWithLeafMarked)}");

                var leftOnlyTree = new BinaryTreeSerializer.TreeNode(1)
                {
                    left = new BinaryTreeSerializer.TreeNode(2)
                    {
                        left = new BinaryTreeSerializer.TreeNode(4)
                    }
                };

                yield return
                    new TestCaseData(
                        new SerializerDelegate(BinaryTreeSerializer.SerializeUsingArray), 
                        new DeserializerDelegate(BinaryTreeSerializer.DeserializeUsingArray),
                        new Tuple<string, BinaryTreeSerializer.TreeNode>("1,2,,4", leftOnlyTree))
                    .SetName($"{nameof(leftOnlyTree)}-{nameof(BinaryTreeSerializer.SerializeUsingArray)}");
                yield return
                    new TestCaseData(
                        new SerializerDelegate(BinaryTreeSerializer.SerializeUsingPeorderWithNull),
                        new DeserializerDelegate(BinaryTreeSerializer.DeserializeUsingPeorderWithNull),
                        new Tuple<string, BinaryTreeSerializer.TreeNode>("1,2,4,,,,", leftOnlyTree))
                        .SetName($"{nameof(leftOnlyTree)}-{nameof(BinaryTreeSerializer.SerializeUsingPeorderWithNull)}");
                yield return
                   new TestCaseData(
                       new SerializerDelegate(BinaryTreeSerializer.SerializeUsingPeorderWithLeafMarked),
                       new DeserializerDelegate(BinaryTreeSerializer.DeserializeUsingPeorderWithLeafMarked),
                       new Tuple<string, BinaryTreeSerializer.TreeNode>("1,2,4*,,", leftOnlyTree))
                       .SetName($"{nameof(leftOnlyTree)}-{nameof(BinaryTreeSerializer.SerializeUsingPeorderWithLeafMarked)}");
            }
        }
        [TestCaseSource(nameof(TreeSerializeDeserializeTestCases))]
        public void SerializeAndDeserialize(SerializerDelegate serialize, DeserializerDelegate deserialize, Tuple<string, BinaryTreeSerializer.TreeNode> treeData)
        {
            Assert.AreEqual(treeData.Item1, serialize(treeData.Item2));
            var d = deserialize(treeData.Item1);
            Assert.IsTrue(AreEqual(treeData.Item2, d));
        }

        private bool AreEqual(BinaryTreeSerializer.TreeNode r1, BinaryTreeSerializer.TreeNode r2)
        {
            if (r1 == null && r2 == null)
            {
                return true;
            }

            if (r1 == null || r2 == null)
            {
                return false;
            }

            return r1.val == r2.val
                   && AreEqual(r1.left, r2.left)
                   && AreEqual(r1.right, r2.right);
        }

    }
}
