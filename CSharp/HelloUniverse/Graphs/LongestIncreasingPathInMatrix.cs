using System;
using System.Collections.Generic;

namespace HelloUniverse.Graphs
{
    public static class LongestIncreasingPathInMatrix
    {
        public static int GetLongestIncreasingPath(int[,] matrix)
        {
            var rows = matrix.GetLength(0);
            var columns = matrix.GetLength(1);
            var order = GetTopologicalOrder(matrix, rows, columns);

            return GetLongestIncreasingPathUsingDynamicProgramming(matrix, rows, columns, order);

        }

        private static int GetLongestIncreasingPathUsingDynamicProgramming(
            int[,] matrix,
            int rows, 
            int columns,
            List<Tuple<int, int>> topologicalOrder)
        {
            var decisionMatrix = new int[rows, columns]; // initialize all 0 A[n] = 1 + max(A[k]) for all k neibougher of n
            foreach (var o in topologicalOrder)
            {
                var neighbours = GetNeighbours(o.Item1, o.Item2, matrix, rows, columns);
                var max = 0;
                foreach (var n in neighbours)
                {
                    if (decisionMatrix[n.Item1, n.Item2] > max)
                    {
                        max = decisionMatrix[n.Item1, n.Item2];
                    }
                }

                decisionMatrix[o.Item1, o.Item2] = max + 1; // for no neibours it is 1
            }

            var maxPath = 0;

            for (var i = 0; i < rows; i++)
            {
                for (var j = 0; j < columns; j++)
                {
                    if (decisionMatrix[i, j] > maxPath)
                    {
                        maxPath = decisionMatrix[i, j];
                    }
                }
            }

            return maxPath;
        }

        private static List<Tuple<int, int>> GetTopologicalOrder(int[,] matrix, int rows, int columns)
        {
            var visited = new bool[rows, columns]; // initialize all false. no cycle possible. So, no need for Grey state
            var topologicalOrder = new List<Tuple<int, int>>();
            for (var i = 0; i < rows; i++)
            {
                for (var j = 0; j < columns; j++)
                {
                    if (!visited[i, j])
                    {
                        Dfs(i, j, matrix, visited, rows, columns, topologicalOrder);
                    }
                }
            }

            return topologicalOrder;
        }

        private static void Dfs(int i, int j, int[,] matrix, bool[,] visited, int rows, int columns, List<Tuple<int, int>> order)
        {
            if (visited[i, j])
            {
                return;
            }

            visited[i, j] = true;

            var neighbours = GetNeighbours(i, j, matrix, rows, columns);

            foreach (var n in neighbours)
            {
                Dfs(n.Item1, n.Item2, matrix, visited, rows, columns, order);
            }

            order.Add(new Tuple<int, int>(i,j));
        }

        private static List<Tuple<int, int>> GetNeighbours(int i, int j, int[,] matrix, int rows, int columns)
        {
            var neighbours = new List<Tuple<int, int>>();
            var offsets = new List<Tuple<int, int>>()
            {
                new Tuple<int, int>(1, 0),
                new Tuple<int, int>(-1, 0),
                new Tuple<int, int>(0, 1),
                new Tuple<int, int>(0, -1)
            };

            foreach (var o in offsets)
            {
                var potentialNeighbour = new Tuple<int,int>(o.Item1 + i, o.Item2 + j);

                if (potentialNeighbour.Item1 < 0 || potentialNeighbour.Item1 >= rows
                    || potentialNeighbour.Item2 < 0 || potentialNeighbour.Item2 >= columns
                    || matrix[potentialNeighbour.Item1, potentialNeighbour.Item2] >= matrix[i, j]
                ) //neighbour must be smaller
                {
                    continue;
                }
                neighbours.Add(potentialNeighbour);
            }

            return neighbours;
        }

    }
}
