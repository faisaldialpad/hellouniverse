from unittest import TestCase

from dev.arrays.buy_sell_stock import BuySellStock


class TestBuySellStock(TestCase):
    def test_max_profit_one_transaction(self):
        self.assertEqual(5, BuySellStock.max_profit_one_transaction([7, 1, 5, 3, 6, 4]))
        self.assertEqual(0, BuySellStock.max_profit_one_transaction([7, 6, 4, 3, 1]))

    def test_max_profit_multi_transaction(self):
        self.assertEqual(7, BuySellStock.max_profit_multi_transaction([7, 1, 5, 3, 6, 4]))
        self.assertEqual(0, BuySellStock.max_profit_multi_transaction([7, 6, 4, 3, 1]))
        self.assertEqual(1, BuySellStock.max_profit_multi_transaction([1, 2]))

    def test_max_profit_multi_transaction_leet_solution(self):
        self.assertEqual(7, BuySellStock.max_profit_multi_transaction_leet_solution([7, 1, 5, 3, 6, 4]))
        self.assertEqual(0, BuySellStock.max_profit_multi_transaction_leet_solution([7, 6, 4, 3, 1]))
        self.assertEqual(1, BuySellStock.max_profit_multi_transaction_leet_solution([1, 2]))
