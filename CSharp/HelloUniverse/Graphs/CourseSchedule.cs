using System.Collections.Generic;

namespace HelloUniverse.Graphs
{
    public static class CourseSchedule
    {
        public static bool CanFinish(int numCourses, int[,] prerequisites)
        {
            var states = new State[numCourses];
            var adjacencyList = new HashSet<int>[numCourses];
            for (var i = 0; i < numCourses; i++)
            {
                adjacencyList[i]= new HashSet<int>();
                states[i] = State.White;
            }

            // this is how you do it 
            var rows = prerequisites.GetLength(0);
            for (var i = 0; i < rows; i++)
            {
                adjacencyList[prerequisites[i, 0]].Add(prerequisites[i, 1]);
            }

            for (var i = 0; i < numCourses; i++)
            {
                if (states[i] == State.White && !Dfs(i, adjacencyList, states))
                {
                    return false;
                }
            }

            return true;
        }

        private static bool Dfs(int node, HashSet<int>[] adjacencyList, State[] states)
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
                if (!Dfs(i, adjacencyList, states))
                {
                    return false;
                }
            }

            states[node] = State.Black; //all its neibours are completed

            return true;
        }

        enum State
        {
            White, //not visited
            Black, // visited and all its neibours are visited
            Grey //visited but some of its neibours are not visited
        }
    }
}
