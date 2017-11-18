class BuySellStock:
    @staticmethod
    def max_profit_one_transaction(prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        max_profit = 0
        min_price = float('inf')
        for p in prices:
            if p < min_price:
                min_price = p
            profit = p - min_price
            if profit > max_profit:
                max_profit = profit
        return max_profit

    @staticmethod
    def max_profit_multi_transaction(prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        max_profit = 0
        total_profit = 0
        min_price = float('inf')
        for p in prices:
            if p < min_price:
                min_price = p
            profit = p - min_price
            if profit > max_profit:
                max_profit = profit
            else:
                total_profit += max_profit
                max_profit = 0
                min_price = p

        total_profit += max_profit
        return total_profit

    @staticmethod
    def max_profit_multi_transaction_leet_solution(prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        total_profit = 0
        for i in range(1, len(prices)):
            # for each pair of numbers if the 2nd is bigger than the 1st we can add the difference to the total profit.
            # check [1, 7, 2, 3, 6, 7, 6, 7] for example.
            if prices[i] > prices[i-1]:
                total_profit += prices[i] - prices[i-1]
        return total_profit
