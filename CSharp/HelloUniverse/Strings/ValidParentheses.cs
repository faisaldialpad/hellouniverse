using System;
using System.Collections.Generic;
using System.Linq;

namespace HelloUniverse.Strings
{
    public static class ValidParentheses
    {
        // Leetcode discussion done.
        public static bool IsValid(string s)
        {
            if (string.IsNullOrEmpty(s))
            {
                return false;
            }

            var stack = new Stack<char>();
            foreach (var c in s)
            {
                if (IsOpen(c))
                {
                    stack.Push(c);
                }
                else if (IsClosed(c))
                {
                    if (stack.Count == 0 || !DoesMatch(stack.Pop(), c))
                    {
                        return false;
                    }
                }
                else
                {
                    throw new Exception("Invalid Input."); //this program assumes that input is valid
                }
            }

            return stack.Count == 0;
        }

        public static bool IsValidEfficient(string s)
        {
            if (string.IsNullOrEmpty(s))
            {
                return false;
            }

            var stack = new Stack<char>();
            foreach (var c in s)
            {
                if (c == '(')
                {
                    stack.Push(')');
                }
                else if (c == '[')
                {
                    stack.Push(']');
                }
                else if (c == '{')
                {
                    stack.Push('}');
                }
                else if (stack.Count == 0 || stack.Pop() != c)
                {
                    return false;
                }
            }

            return stack.Count == 0;
        }
        private static bool IsOpen(char c)
        {
            return c == '(' || c == '[' || c == '{';
        }

        private static bool IsClosed(char c)
        {
            return c == ')' || c == ']' || c == '}';
        }

        private static bool DoesMatch(char c1, char c2)
        {
            return (c1 == '(' && c2 == ')')
                   || (c1 == '{' && c2 == '}')
                   || (c1 == '[' && c2 == ']');
        }
    }
}
