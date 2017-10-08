using System.Collections.Generic;
using HelloUniverse.Strings;
using NUnit.Framework;

namespace HelloUniverse.Tests.Strings
{
    [TestFixture]
    public class ValidParenthesesTests
    {
        public delegate bool IsValidDelegate(string str);

        [TestCaseSource(nameof(TestCases))]
        public void CornerCases(IsValidDelegate isValid)
        {
            Assert.False(isValid(null));
            Assert.False(isValid(""));
            Assert.False(isValid("["));
            Assert.False(isValid("]"));
            Assert.True(isValid("[]"));
        }

        [TestCaseSource(nameof(TestCases))]
        public void NormalCases(IsValidDelegate isValid)
        {
            Assert.False(isValid("[(])"));
            Assert.False(isValid("[)"));
            Assert.True(isValid("[](){}"));
            Assert.True(isValid("[(){([])}](){}"));
        }

        private static IEnumerable<TestCaseData> TestCases
        {
            get
            {
                yield return
                    new TestCaseData(new IsValidDelegate(ValidParentheses.IsValid)).SetName(
                        nameof(ValidParentheses.IsValid));
                yield return
                    new TestCaseData(new IsValidDelegate(ValidParentheses.IsValidEfficient)).SetName(
                        nameof(ValidParentheses.IsValidEfficient));
            }
        }
    }
}
