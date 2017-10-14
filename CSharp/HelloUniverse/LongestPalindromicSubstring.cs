using System;

namespace HelloUniverse
{
    public static class LongestPalindromicSubstring
    {
        public static string FindDynamicProgramming(string str)
        {
            if (string.IsNullOrEmpty(str))
            {
                return string.Empty;
            }

            var decisionMatrix = new bool[str.Length, str.Length];
            for (var i = str.Length - 1; i >= 0 ; i--)
            {
                for (var j = str.Length - 1; j >= i ; j--) //we need to run both loops backwards to have the dependant calculation completed for the current calculation 
                {
                    if (i == j)
                    {
                        decisionMatrix[i, j] = true; // same char is a palindrome
                    }
                    else if (i + 1 == j)
                    {
                        decisionMatrix[i, j] = str[i] == str[j]; // 2 subsequent chars are palendrome if they are same
                    }
                    else
                    {
                        decisionMatrix[i, j] = decisionMatrix[i + 1, j - 1] && (str[i] == str[j]); // string is a palindrome if both chars in both ends are same and the remaining string is palindrome
                    }
                }
            }

            var maxLength = 0;
            var startIndexForMaxLength = 0;

            //finding the biggest gap between i, j with decisionMatrix[i, j] == true
            for (var i = 0; i < str.Length; i++)
            {
                for (var j = i; j < str.Length; j++)
                {
                    if (decisionMatrix[i, j])
                    {
                        var currentLength = j - i + 1;
                        if (currentLength > maxLength)
                        {
                            maxLength = currentLength;
                            startIndexForMaxLength = i;
                        }
                    }
                }
            }

            return str.Substring(startIndexForMaxLength, maxLength);
        }

        public static string Find(string str)
        {
            if (string.IsNullOrEmpty(str))
            {
                return string.Empty;
            }

            var windowSize = str.Length;
            while (windowSize > 0)
            {
                for (var i = 0; i + windowSize <= str.Length; i++)
                {
                    if (IsPalindrome(str, i, i + windowSize - 1))
                    {
                        return str.Substring(i, windowSize);
                    }
                }
                windowSize--;
            }

            return string.Empty;
        }

        private static bool IsPalindrome(string str, int startIndex, int endIndex)
        {
            int midIndex = (int)System.Math.Ceiling((double)(endIndex + startIndex)/2);
            for (var i = startIndex; i < midIndex; i++)
            {
                if (str[i] != str[endIndex + startIndex - i]) // important
                {
                    return false;
                }
            }

            return true;
        }
    }
}
