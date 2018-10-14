from unittest import TestCase

from dev.maths.max_points import MaxPoints


class TestMaxPoints(TestCase):
    def test_max_points(self):
        points = [MaxPoints.Point(1, 1), MaxPoints.Point(2, 2), MaxPoints.Point(3, 3)]
        self.assertEquals(3, MaxPoints().max_points(points))

        points = [MaxPoints.Point(1, 1), MaxPoints.Point(3, 2), MaxPoints.Point(5, 3), MaxPoints.Point(4, 1),
                  MaxPoints.Point(2, 3), MaxPoints.Point(1, 4)]
        self.assertEquals(4, MaxPoints().max_points(points))

        points = [MaxPoints.Point(1, 1), MaxPoints.Point(2, 2), MaxPoints.Point(3, 3), MaxPoints.Point(2, 2)]
        self.assertEquals(4, MaxPoints().max_points(points))

        points = [MaxPoints.Point(0, 0), MaxPoints.Point(1, 1), MaxPoints.Point(0, 0)]
        self.assertEquals(3, MaxPoints().max_points(points))
