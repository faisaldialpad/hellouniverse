using System.Linq;
using System.Collections.Generic;

namespace HelloUniverse
{
    public class StringPermutation
    {
        public static IList<string> Permute(string str)
        {
            var result = new List<string>();
            Permute(str, 0, str.Length - 1, result);
            return result;
        }

        private static void Permute(string s, int start, int end, IList<string> result)
        {
            if(start >= end)
            {
                result.Add(s);
                return;
            }
            for(var i= start; i <= end; i++)
            {
                var swapped = Swap(s, start, i);
                Permute(swapped, start+1, end, result);
            }
        }

        private static string Swap(string s, int i, int j)
        {
            var arr = s.ToArray();
            var t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            return new string(arr);
        }
    }
}
