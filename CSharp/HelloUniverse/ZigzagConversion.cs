using System;
using System.Collections.Generic;
using System.Text;

namespace HelloUniverse
{
    public static class ZigzagConversion
    {
        public static string Convert(string text, int rows)
        {
            if(string.IsNullOrEmpty(text) || rows <= 1)
            {
                return text;
            }

            var matrix = new List<StringBuilder>();
            for (var i = 0; i < rows; i++)
            {
                matrix.Add(new StringBuilder());
            }

            var j = 0;
            var k = 0;
            while(k < text.Length)
            {
                for (var i = 0; i < rows && k<text.Length;i++)
                {
                    var moduloJ = j % (rows - 1);
                    if(moduloJ == 0 || (rows - 1 - i == moduloJ)) //you gotta find the pattern based on examples
                    {
                        matrix[i].Append(text[k]);
                        k++;
                    }
                }
                j++;
            }

            var result = new StringBuilder();
            for (var i = 0; i < rows; i++)
            {
                result.Append(matrix[i]);
            }

            return result.ToString();
        }
    }
}
