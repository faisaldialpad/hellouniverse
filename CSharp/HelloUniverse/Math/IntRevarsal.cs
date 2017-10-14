using System.Collections.Generic;

namespace HelloUniverse.Math
{
    public static class IntRevarsal
    {
        // Uptodate with leetcode discussion
        // neg will be taken care of by default
        // we can also use long result to check for overflow (if it is not between int.min and int.max)
        public static int Reverse(int num)
        {
            var result = 0;
            while (num != 0)
            {
                var mod = num % 10;
                var newrResult = result * 10 + mod;

                if ((newrResult - mod) / 10 != result) //overflow, because calculation is not same for overflow
                {
                    return 0;
                }

                result = newrResult;
                num = num / 10;
            }

            return result;
        }
        
    }
}
