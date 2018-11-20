from unittest import TestCase
from dev.dp.jump_game import JumpGame


class TestJumpGame(TestCase):
    def test_can_jump(self):
        self.assertTrue(JumpGame().can_jump([2, 3, 1, 1, 4]))
        self.assertFalse(JumpGame().can_jump([3, 2, 1, 0, 4]))
