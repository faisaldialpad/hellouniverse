from unittest import TestCase
from dev.trees.eval_reverse_polish import EvalRPN

class TestEvalRPN(TestCase):
    def test_eval(self):
        self.assertEqual(3, EvalRPN().eval(['1', '2', '+']))
        self.assertEqual(9, EvalRPN().eval(['3', '1', '2', '+', '*']))
        self.assertEqual(9, EvalRPN().eval(["2", "1", "+", "3", "*"]))
        self.assertEqual(6, EvalRPN().eval(["4", "13", "5", "/", "+"]))
        self.assertEqual(22, EvalRPN().eval(["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]))
