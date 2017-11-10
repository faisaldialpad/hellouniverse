from unittest import TestCase

from dev.arrays.container_with_most_water import ContainerWithMostWater


class TestContainerWithMostWater(TestCase):
    def test_calculate_max_area(self):
        self.assertEqual(49, ContainerWithMostWater.calculate_max_area([1, 8, 6, 2, 5, 4, 8, 3, 7]))
