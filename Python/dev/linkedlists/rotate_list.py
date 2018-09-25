class RotateList:
    def rotate_right(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        if not head or k == 0:
            return head

        length = 1
        current = head

        # Go to the last node while calculating length.
        while current.next:
            current = current.next
            length += 1

        # Make a circular linked list.
        current.next = head

        # Make sure to loop the circle less than once.
        k %= length

        # Break the circle at length - k
        k = length - k
        while k > 0:
            current = current.next
            k -= 1

        # current.next is the new head.
        head = current.next
        current.next = None
        return head

    # Definition for singly-linked list.
    class ListNode:
        def __init__(self, x):
            self.val = x
            self.next = None

        def to_list(self):
            t = self
            ret = []
            while t:
                ret.append(t.val)
                t = t.next
                if t == self:
                    raise RuntimeError('loop')
            return ret
