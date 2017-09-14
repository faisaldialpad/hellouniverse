using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;

namespace HelloUniverse.Tests
{
    public class LongestNonRepeatingSubstringTests
    {
        [Test]
        public void CornerCases()
        {
            Assert.AreEqual(0, LongestNonRepeatingSubstring.FindMaxLength(""));
            Assert.AreEqual(0, LongestNonRepeatingSubstring.FindMaxLength(null));
        }

        [Test]
        public void NormalCases()
        {
            Assert.AreEqual(1, LongestNonRepeatingSubstring.FindMaxLength("a"));
            Assert.AreEqual(1, LongestNonRepeatingSubstring.FindMaxLength("aa"));
            Assert.AreEqual(2, LongestNonRepeatingSubstring.FindMaxLength("ab"));
            Assert.AreEqual(2, LongestNonRepeatingSubstring.FindMaxLength("aba"));
            Assert.AreEqual(2, LongestNonRepeatingSubstring.FindMaxLength("aab"));
            Assert.AreEqual(2, LongestNonRepeatingSubstring.FindMaxLength("baa"));
            Assert.AreEqual(4, LongestNonRepeatingSubstring.FindMaxLength("aabcdcef"));
            Assert.AreEqual(3, LongestNonRepeatingSubstring.FindMaxLength("abcabcbb"));
            Assert.AreEqual(1, LongestNonRepeatingSubstring.FindMaxLength("bbbbb"));
            Assert.AreEqual(3, LongestNonRepeatingSubstring.FindMaxLength("pwwkew"));
        }
    }
}
