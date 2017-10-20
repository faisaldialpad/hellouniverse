using System;
using System.Collections.Generic;
using System.Linq;

namespace HelloUniverse.Graph
{
    public static class AlienOrderTopologicalSort
    {
        public static string Sort(String[] words)
        {
            var adjacencyList = new Dictionary<char, HashSet<char>>();
            CreateGraph(words, adjacencyList);

            var states = new Dictionary<char, State>();
            foreach (var k in adjacencyList.Keys)
            {
                states[k] = State.White;
            }

            var topologicalOrder = new List<char>();
            foreach (var k in adjacencyList.Keys)
            {
                if (states[k] == State.White && !Dfs(k, adjacencyList, states, topologicalOrder))
                {
                    return string.Empty;
                }
            }

            topologicalOrder.Reverse();

            return new String(topologicalOrder.ToArray());
        }

        private static bool Dfs(
            char node,
            Dictionary<char, HashSet<char>> adjacencyList,
            Dictionary<char, State> states,
            List<char> topologicalOrder)
        {
            if (states[node] == State.Black)
            {
                return true;
            }

            if (states[node] == State.Grey) //it was previously visited but not completed, hence circle
            {
                return false;
            }

            states[node] = State.Grey;

            foreach (var i in adjacencyList[node])
            {
                if (!Dfs(i, adjacencyList, states, topologicalOrder))
                {
                    return false;
                }
            }

            states[node] = State.Black; //all its neibours are completed
            topologicalOrder.Add(node);
            return true;
        }

        // create graph by comparing letters on the columns
        private static void CreateGraph(String[] words, Dictionary<char, HashSet<char>> adjacencyList)
        {
            if (words == null && words.Length == 0)
            {
                return;
            }

            var sameFirstLetterMap = new Dictionary<char, List<string>>();
            var runningList = new List<char>();
            for (var i = words.Length - 1; i >= 0; i--) //first letter of a word comes before all first letters of the words after it.
            {
                if (string.IsNullOrEmpty(words[i]))
                {
                    continue;
                }

                var firstLetter = words[i][0];
                var remainingWordAfterFirstLetter = words[i].Substring(1);
                if (!string.IsNullOrEmpty(remainingWordAfterFirstLetter))
                {
                    if (sameFirstLetterMap.ContainsKey(firstLetter))
                    {
                        sameFirstLetterMap[firstLetter].Add(remainingWordAfterFirstLetter);
                    }
                    else
                    {
                        sameFirstLetterMap.Add(firstLetter, new List<string> { remainingWordAfterFirstLetter });
                    }
                }

                if (adjacencyList.ContainsKey(firstLetter))
                {
                    foreach (var l in runningList.Where(_ => _ != firstLetter))
                    {
                        adjacencyList[firstLetter].Add(l);
                    }

                }
                else
                {
                    adjacencyList[firstLetter] = new HashSet<char>(runningList.Where(_ => _ != firstLetter));
                }

                runningList.Add(firstLetter);
            }

            foreach (var kv in sameFirstLetterMap)
            {
                if (kv.Value.Count >= 1)
                {
                    kv.Value.Reverse();
                    CreateGraph(kv.Value.ToArray(), adjacencyList);
                }
            }
        }

        enum State
        {
            White, //not visited
            Black, // visited and all its neibours are visited
            Grey //visited but some of its neibours are not visited
        }


    }
}
