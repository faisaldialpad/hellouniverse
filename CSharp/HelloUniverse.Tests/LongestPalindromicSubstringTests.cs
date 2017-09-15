using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;

namespace HelloUniverse.Tests
{
    public class LongestPalindromicSubstringTests
    {
        public delegate string FindDelegate(string str);

        [TestCaseSource(nameof(TestCases))]
        public void CornerCases(FindDelegate findFunc)
        {
            Assert.AreEqual("", findFunc(""));
            Assert.AreEqual("", findFunc(null));
        }

        [TestCaseSource(nameof(TestCases))]
        public void NormalCases(FindDelegate findFunc)
        {
            Assert.AreEqual("a", findFunc("a"));
            Assert.AreEqual("aa", findFunc("aa"));
            Assert.AreEqual("a", findFunc("ab"));
            Assert.AreEqual("a", findFunc("abc"));
            Assert.AreEqual("aba", findFunc("aba"));
            Assert.AreEqual("aba", findFunc("abacd"));
            Assert.AreEqual("aba", findFunc("cdaba"));
            Assert.AreEqual("bab", findFunc("babad"));
            Assert.AreEqual("bb", findFunc("cbbd"));
        }

        private static IEnumerable<TestCaseData> TestCases
        {
            get
            {
                yield return
                    new TestCaseData(new FindDelegate(LongestPalindromicSubstring.Find)).SetName(
                        nameof(LongestPalindromicSubstring.Find));
                yield return
                    new TestCaseData(new FindDelegate(LongestPalindromicSubstring.FindDynamicProgramming)).SetName(
                        nameof(LongestPalindromicSubstring.FindDynamicProgramming));
            }

        }
    }
}
