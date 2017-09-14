using System;
using HelloUniverse;
using NUnit.Framework;

namespace HelloUniverse.Tests
{
	[TestFixture]
	public class StringPermutationTests
	{
		[Test]
		public void PrintPermutations_PermuteNull()
		{
			var output = StringPermutation.Permute(null);
			Assert.AreEqual(1, output.Count);
			Assert.AreEqual(null, output[0]);
		}

		[Test]
		public void PrintPermutations_PermuteEmpty()
		{
			var output = StringPermutation.Permute(string.Empty);
			Assert.AreEqual(1, output.Count);
			Assert.AreEqual(string.Empty, output[0]);
		}

		[Test]
		public void PrintPermutations_PermuteOne()
		{
			var output = StringPermutation.Permute("A");
			Assert.AreEqual(1, output.Count);
			Assert.AreEqual("A", output[0]);
		}

		[Test]
		public void PrintPermutations_PermuteTwo()
		{
			var output = StringPermutation.Permute("AB");
			Assert.AreEqual(2, output.Count);
			Assert.IsTrue(output.Contains("AB"));
			Assert.IsTrue(output.Contains("BA"));
		}

		[Test]
		public void PrintPermutations_PermuteThree()
		{
			var output = StringPermutation.Permute("ABC");
			Assert.AreEqual(6, output.Count);
			Assert.IsTrue(output.Contains("ABC"));
			Assert.IsTrue(output.Contains("ACB"));
			Assert.IsTrue(output.Contains("BAC"));
			Assert.IsTrue(output.Contains("BCA"));
			Assert.IsTrue(output.Contains("CAB"));
			Assert.IsTrue(output.Contains("CBA"));
		}
	}
}
