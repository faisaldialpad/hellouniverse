using HelloUniverse.Helpers;
using System.Linq;

namespace HelloUniverse
{
    public class StringPermutation
    {
        private string _str;
        private IOutput _output;
        public StringPermutation(string str, IOutput output)
        {
            _str = str;
            _output = output;
        }

        /// <summary>
        /// Changes the string, so performs the opearation on a copy
        /// </summary>
        public void PrintPermutations()
        {
            var str = string.Copy(_str);
            Permute(str, 0, str.Length - 1);
        }
        private void Permute(string s, int start, int end)
        {
            if(start >= end)
            {
                _output.WriteLine(s);
                return;
            }
            for(var i= start; i <= end; i++)
            {
                var swapped = Swap(s, start, i);
                Permute(swapped, start+1, end);
            }
        }
        private string Swap(string s, int i, int j)
        {
            var arr = s.ToArray();
            var t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            return new string(arr);
        }
    }
}
