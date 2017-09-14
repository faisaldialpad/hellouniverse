using System;
using System.Collections.Generic;

namespace HelloUniverse
{
    public static class LongestNonRepeatingSubstring
    {
        public static int FindMaxLength(string str)
        {
            if (string.IsNullOrEmpty(str))
            {
                return 0;
            }

            var set = new HashSet<char>();
            var maxLength = 0;
            var start = 0; //window start
            var end = 0; //window end
            while (end < str.Length)
            {
                if (!set.Contains(str[end]))
                {
                    set.Add(str[end]);
                    maxLength = Math.Max(maxLength, end - start + 1);
                    end++;
                }
                else
                {
                    set.Remove(str[start]);
                    start++;
                }
            }

            return maxLength;
        }
    }
}
