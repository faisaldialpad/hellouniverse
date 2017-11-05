from unittest import TestCase

from dev.strings.parentheses_generation import ParenthesesGeneration


class TestParenthesesGeneration(TestCase):
    def test_generate(self):
        self.assertEqual([], ParenthesesGeneration().generate(-1))
        self.assertEqual([], ParenthesesGeneration().generate(0))
        self.assertEqual(["()"], ParenthesesGeneration().generate(1))
        self.assertEqual(sorted(["(())", "()()"]), sorted(ParenthesesGeneration().generate(2)))
        self.assertEqual(sorted(["((()))", "()(())", "(())()", "(()())", "()()()"]),
                         sorted(ParenthesesGeneration().generate(3)))
        self.assertEqual(sorted(
            ['(((())))', '((()()))', '((())())', '((()))()', '(()(()))', '(()()())', '(()())()', '(())(())', '(())()()',
             '()((()))', '()(()())', '()(())()', '()()(())', '()()()()']),
                         sorted(ParenthesesGeneration().generate(4)))
