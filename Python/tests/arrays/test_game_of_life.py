from unittest import TestCase
from dev.arrays.game_of_life import GameOfLife


class TestGameOfLife(TestCase):
    def test_get_next_generation(self):
        board = [
            [0, 1, 0],
            [0, 0, 1],
            [1, 1, 1],
            [0, 0, 0]
        ]

        GameOfLife().get_next_generation(board)
        self.assertEqual(board, [
            [0, 0, 0],
            [1, 0, 1],
            [0, 1, 1],
            [0, 1, 0]
        ])
