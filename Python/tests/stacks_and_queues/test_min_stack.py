from unittest import TestCase

from dev.stacks_and_queues.min_stack import MinStack


class TestMinStack(TestCase):
    def test_min_stack(self):
        st = MinStack()
        st.push(4)
        st.push(5)
        self.assertEqual(4, st.getMin())
        st.push(3)
        self.assertEqual(3, st.getMin())
        st.push(8)
        self.assertEqual(3, st.getMin())
        st.pop()
        self.assertEqual(3, st.getMin())
        st.pop()
        self.assertEqual(4, st.getMin())
        st.pop()
        self.assertEqual(4, st.getMin())
