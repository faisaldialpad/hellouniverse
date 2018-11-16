"""
https://leetcode.com/problems/game-of-life/description/
289. Game of Life

According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies, as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population..
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
Write a function to compute the next state (after one update) of the board given its current state. The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously.

Example:

Input:
[
  [0,1,0],
  [0,0,1],
  [1,1,1],
  [0,0,0]
]
Output:
[
  [0,0,0],
  [1,0,1],
  [0,1,1],
  [0,1,0]
]

Follow up:

Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?
"""


class GameOfLife:
    def get_next_generation(self, board):
        """
        :type board: List[List[int]]
        :rtype: void Do not return anything, modify board in-place instead.
        """
        # 00 -> first 0 is for next and 2nd 0 is for current. (both gens dead)
        # 01 -> Became dead from alive.
        # 10 -> Became alive from dead.
        # 11 -> both ges alive.
        for i in range(len(board)):
            for j in range(len(board[i])):
                neighbours = self.get_neighbours(board, i, j)
                live_count = len([x for x in neighbours if x & 1])
                if board[i][j] & 1:
                    # if current cell is alive.
                    if 2 <= live_count <= 3:
                        # Next gen lives
                        board[i][j] |= 2
                    # else: Next gen dies
                else:
                    # Current cell is dead
                    if live_count == 3:
                        # Next gen lives
                        board[i][j] |= 2
        for i in range(len(board)):
            for j in range(len(board[i])):
                # right shift everything. Make next gen current
                board[i][j] >>= 1

    def get_neighbours(self, board, i, j):
        offsets = [(-1, 0), (1, 0), (0, -1), (0, 1), (-1, -1), (1, -1), (-1, 1), (1, 1)]
        neighbours = [(i + x, j + y) for (x, y) in offsets if 0 <= i + x < len(board) and 0 <= j + y < len(board[i])]
        return [board[x][y] for (x, y) in neighbours]
