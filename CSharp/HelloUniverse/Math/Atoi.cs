namespace HelloUniverse.Math
{
    public static class Atoi
    {
        // leetoptimized
        public static int Convert(string str)
        {
            if (string.IsNullOrWhiteSpace(str))
            {
                return 0;
            }

            var neg = false;
            var start = 0;
            // ignore start space
            while (start < str.Length && str[start] == ' ')
            {
                start++;
            }
            //optionally check for +, -
            if (start < str.Length && str[start] == '-')
            {
                neg = true;
                start++;
            }
            else if (start < str.Length && str[start] == '+')
            {
                neg = false;
                start++;
            }

            int result = 0;
            while (start < str.Length && '0' <= str[start] && str[start] <= '9')
            {
                var digit = (str[start] - '0');

                //check if total will be overflow after 10 times and add digit
                if (int.MaxValue / 10 < result
                    || (int.MaxValue / 10 == result && int.MaxValue % 10 < digit))
                {
                    return neg ? int.MinValue : int.MaxValue;
                }

                result = result * 10 + digit;

                start++;
            }


            if (neg)
            {
                result = -result;
            }

            return result;
        }

    }
}
