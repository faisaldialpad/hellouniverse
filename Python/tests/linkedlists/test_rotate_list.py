from unittest import TestCase
from dev.linkedlists.rotate_list import RotateList


class TestRotateList(TestCase):

    def test_rotate_right(self):
        head = RotateList.ListNode(1)
        head.next = RotateList.ListNode(2)
        head.next.next = RotateList.ListNode(3)
        head.next.next.next = RotateList.ListNode(4)
        head.next.next.next.next = RotateList.ListNode(5)
        self.assertEquals([4, 5, 1, 2, 3], RotateList().rotate_right(head, 2).to_list())

        head = RotateList.ListNode(0)
        head.next = RotateList.ListNode(1)
        head.next.next = RotateList.ListNode(2)
        self.assertEquals([2, 0, 1], RotateList().rotate_right(head, 4).to_list())
