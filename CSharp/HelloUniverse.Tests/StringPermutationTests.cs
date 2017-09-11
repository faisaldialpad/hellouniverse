using System;
using HelloUniverse;
using HelloUniverseCore.Tests.Helpers;
using NUnit.Framework;

namespace HelloUniverseCore.Tests
{
    [TestFixture]
	public class StringPermutationTests
	{
		[Test]
		public void PrintPermutations_PermuteEmpty()
		{
			var output = new TestOutput();
			var strPerm = new StringPermutation(string.Empty, output);
			strPerm.PrintPermutations();
			Assert.AreEqual(1, output.Container.Count);
			Assert.AreEqual(string.Empty, output.Container[0]);
		}

		[Test]
		public void PrintPermutations_PermuteOne()
		{
			var output = new TestOutput();
			var strPerm = new StringPermutation("A", output);
			strPerm.PrintPermutations();
			Assert.AreEqual(1, output.Container.Count);
			Assert.AreEqual("A", output.Container[0]);
		}

		[Test]
		public void PrintPermutations_PermuteTwo()
		{
			var output = new TestOutput();
			var strPerm = new StringPermutation("AB", output);
			strPerm.PrintPermutations();
			Assert.AreEqual(2, output.Container.Count);
			Assert.IsTrue(output.Container.Contains("AB"));
			Assert.IsTrue(output.Container.Contains("BA"));
		}

		[Test]
		public void PrintPermutations_PermuteThree()
		{
			var output = new TestOutput();
			var strPerm = new StringPermutation("ABC", output);
			strPerm.PrintPermutations();
			Assert.AreEqual(6, output.Container.Count);
			Assert.IsTrue(output.Container.Contains("ABC"));
			Assert.IsTrue(output.Container.Contains("ACB"));
			Assert.IsTrue(output.Container.Contains("BAC"));
			Assert.IsTrue(output.Container.Contains("BCA"));
			Assert.IsTrue(output.Container.Contains("CAB"));
			Assert.IsTrue(output.Container.Contains("CBA"));
		}
	}
}
