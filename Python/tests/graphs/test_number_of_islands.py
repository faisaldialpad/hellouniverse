from unittest import TestCase

from dev.graphs.number_of_islands import NumberOfIslands


class TestNumberOfIslands(TestCase):
    def test_calculate(self):
        self.assertEquals(1, NumberOfIslands().calculate([['1', '1', '1', '1', '0'],
                                                          ['1', '1', '0', '1', '0'],
                                                          ['1', '1', '0', '0', '0'],
                                                          ['0', '0', '0', '0', '0']]))

        self.assertEquals(3, NumberOfIslands().calculate([['1', '1', '0', '0', '0'],
                                                          ['1', '1', '0', '0', '0'],
                                                          ['0', '0', '1', '0', '0'],
                                                          ['0', '0', '0', '1', '1']]))
