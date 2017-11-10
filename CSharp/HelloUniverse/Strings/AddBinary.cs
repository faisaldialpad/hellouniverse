using System;
using System.Text;

namespace HelloUniverse.Strings
{
    public static class AddBinary
    {
        public static string Add(string a, string b)
        {
            if (string.IsNullOrEmpty(a))
            {
                return b;
            }

            if (string.IsNullOrEmpty(b))
            {
                return a;
            }
            var result = new StringBuilder();
            Add(a, b, a.Length - 1, b.Length - 1, false, result);

            var resultArr = result.ToString().ToCharArray();
            Array.Reverse(resultArr);
            return new string(resultArr);
        }

        private static void Add(string a, string b, int indexA, int indexB, bool carry, StringBuilder result)
        {
            if (indexA < 0 && indexB < 0)
            {
                if (carry)
                {
                    result.Append('1');
                }

                return;
            }

            var digitA = indexA < 0 ? '0' : a[indexA];
            var digitB = indexB < 0 ? '0' : b[indexB];

            var countDigits = carry ? 1 : 0;

            if (digitA == '1')
            {
                countDigits++;
            }

            if (digitB == '1')
            {
                countDigits++;
            }

            carry = countDigits >= 2; //new carry
            result.Append(countDigits % 2 == 0 ? '0' : '1');

            Add(a, b, indexA - 1, indexB - 1, carry, result);
        }
    }
}
