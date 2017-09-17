using System;
using System.Collections.Generic;
using System.Linq;

namespace HelloUniverse
{
    public static class ThreeSum
    {
        // n^2 algorithm (finding an algorithms < n^2 is open problem)
        public static IList<IList<int>> FindAll(int[] nums)
        {
            if(nums == null || nums.Length == 0)
            {
                return new List<IList<int>>();
            }

            var result = new HashSet<IList<int>>(new SortedListOf3EqualityComparer());
            var map = new Dictionary<int, int>();

            //handle zeros differently
            var numsWithoutZeros = new List<int>();
            var zeroCount = 0;

            for (var i = 0; i < nums.Length; i++)
            {
                if(nums[i] == 0)
                {
                    zeroCount++;
                }
                else if(map.ContainsKey(nums[i]))
                {
                    map[nums[i]]++;
                    numsWithoutZeros.Add(nums[i]);
                }
                else
                {
                    map[nums[i]] = 1;
                    numsWithoutZeros.Add(nums[i]);
                }
            }

            if(zeroCount >= 3)
            {
                AddToResultSet(result, 0, 0, 0);
            }

            for (var i = 0; i < numsWithoutZeros.Count;i++)
            {
                if(zeroCount > 0) //2 sum problem
                {
                    if(map.ContainsKey(-numsWithoutZeros[i]))
                    {
                        AddToResultSet(result, 0, numsWithoutZeros[i], -numsWithoutZeros[i]);
                    }
                }

                for (var j = i + 1; j < numsWithoutZeros.Count; j++)
                {
                    var key = -(numsWithoutZeros[i] + numsWithoutZeros[j]);
                    if(map.ContainsKey(key))
                    {
                        var val = map[key];
                        if(key == numsWithoutZeros[i])
                        {
                            val--;
                        }

                        if (key == numsWithoutZeros[j])
                        {
                            val--;
                        }

                        if(val > 0)
                        {
                            AddToResultSet(result, numsWithoutZeros[i], numsWithoutZeros[j], key);
                        }
                    }
                }
            }

            var resultList = result.ToList();
            resultList.Sort(new SortedListOf3Comparer()); //needed only for automatic submission

            return resultList;
        }

        private static void AddToResultSet(HashSet<IList<int>> set, int num1, int num2, int num3)
        {
            var list = new List<int> { num1, num2, num3 };
            list.Sort();
            set.Add(list);
        }

        class SortedListOf3EqualityComparer : IEqualityComparer<IList<int>>
        {
            public bool Equals(IList<int> x, IList<int> y)
            {
                if (x == null || y == null || x.Count != 3 || y.Count != 3)
                {
                    throw new Exception("Can only compare lists of size 3");
                }

                return x[0] == y[0]
                    && x[1] == y[1]
                    && x[2] == y[2];
            }

            public int GetHashCode(IList<int> obj)
            {
                if (obj == null || obj.Count != 3)
                {
                    throw new Exception("Can only compare lists of size 3");
                }

                return $"{obj[0]}{obj[1]}{obj[2]}".GetHashCode();
            }
        }

        class SortedListOf3Comparer : IComparer<IList<int>>
        {
            public int Compare(IList<int> x, IList<int> y)
            {
                if (x == null || y == null || x.Count != 3 || y.Count != 3)
                {
                    throw new Exception("Can only compare lists of size 3");
                }

                if(x[0] != y[0])
                {
                    return x[0].CompareTo(y[0]);
                }

                if (x[1] != y[1])
                {
                    return x[1].CompareTo(y[1]);
                }

                if (x[2] != y[2])
                {
                    return x[2].CompareTo(y[2]);
                }

                return 1.CompareTo(1);
            }
        }
    }
}
