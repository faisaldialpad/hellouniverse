from unittest import TestCase

from dev.maps.intersection import Intersection


class TestIntersection(TestCase):
    def test_intersect_with_dup(self):
        self.assertEqual([1, 2, 3, 2], Intersection.intersect_with_dup([2, 2, 5, 3, 1], [1, 11, 2, 4, 3, 40, 2]))

    def test_intersect_no_dup(self):
        self.assertEqual([1, 2, 3], Intersection.intersect_no_dup([2, 2, 5, 3, 1], [1, 11, 2, 4, 3, 40, 2]))
