"""
https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
150. Evaluate Reverse Polish Notation

Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Note:

Division between two integers should truncate toward zero.
The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.
Example 1:

Input: ["2", "1", "+", "3", "*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
Example 2:

Input: ["4", "13", "5", "/", "+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
Example 3:

Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
Output: 22
Explanation:
  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22


"""

class EvalRPN(object):
    def eval(self, tokens):
        """
        :type tokens: List[str]
        :rtype: int
        """
        r = self.create_tree_from_post_order(tokens)
        return self.in_order_eval(r)

    def create_tree_from_post_order(self, tokens):
        length = len(tokens)
        root = TNode(tokens[length - 1])
        cur = root
        stack = []
        i = length -2
        while i>=0:
            if not cur.right:
                cur.right = TNode(tokens[i])
                if not self.is_leaf(tokens[i]):
                    stack.append(cur)
                    cur = cur.right
                i-=1
            elif not cur.left:
                cur.left = TNode(tokens[i])
                if not self.is_leaf(tokens[i]):
                    stack.append(cur)
                    cur = cur.left
                i -= 1
            elif stack:
                cur = stack.pop()

        return root

    def in_order_eval(self, r):
        if r.is_leaf():
            return int(r.v)

        left = self.in_order_eval(r.left)
        right = self.in_order_eval(r.right)

        if r.v == '+':
            return left + right

        if r.v == '-':
            return left - right

        if r.v == '*':
            return left * right

        if r.v == '/':
            return int(left / right)


    def is_leaf(self, t):
        return t not in ["+", "-", "*", "/"]

class TNode(object):
    def __init__(self, v):
        self.v = v
        self.left = None
        self.right = None

    def is_leaf(self):
        return self.left is None and self.right is None
