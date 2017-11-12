from unittest import TestCase

from dev.maths.count_and_say import CountAndSay


class TestCountAndSay(TestCase):
    def test_get_nth_count_and_say(self):
        obj = CountAndSay()
        self.assertEqual('1', obj.get_nth_count_and_say(1))
        self.assertEqual('11', obj.get_nth_count_and_say(2))
        self.assertEqual('21', obj.get_nth_count_and_say(3))
        self.assertEqual('1211', obj.get_nth_count_and_say(4))
        self.assertEqual('111221', obj.get_nth_count_and_say(5))
        self.assertEqual('312211', obj.get_nth_count_and_say(6))
