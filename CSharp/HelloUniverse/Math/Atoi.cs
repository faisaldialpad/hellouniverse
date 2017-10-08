using System;
using System.Collections.Generic;
using System.Runtime.Remoting.Messaging;

namespace HelloUniverse.Math
{
    public static class Atoi
    {
        // Uptodate with leetcode discussion
        // neg will be taken care of by default
        // we can also use long result to check for overflow (if it is not between int.min and int.max)
        public static int Convert(string str)
        {
            str = str?.TrimStart(); //ignore initial whitespace
            if (string.IsNullOrEmpty(str))
            {
                return 0; // no conversion can be performed
            }
            
            var neg = false;
            var start = 0;
            //optionally check for +, -
            if (str[start] == '-')
            {
                neg = true;
                start++;
            }
            else if (str[start] == '+')
            {
                neg = false;
                start++;
            }

            if (start >= str.Length)
            {
                return 0; //no conversion can be performed
            }

            if ('0' > str[start] || str[start] > '9')
            {
                return 0; // no conversion can be performed. Does not start with number.
            }

            long result = 0;
            var overflow = false;
            for (var i = start; i < str.Length; i++) // it is not from end to start.
            {
                if ('0' <= str[i] && str[i] <= '9')
                {
                    var digit = (str[i] - '0');
                    var newResult = result * 10 + digit;
                    if ((newResult - digit) / 10 != result)
                    {
                        overflow = true;
                        break;
                    }

                    result = newResult;
                }
                else
                {
                    break; // break at the 1st bad char
                }
            }

            if (overflow)
            {
                return neg ? int.MinValue : int.MaxValue;
            }

            if (neg)
            {
                result = -result;
            }

            return (int)result;
        }
        
    }
}
