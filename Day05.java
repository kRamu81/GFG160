class Solution {
public int maximumProfit(int prices[]) {
    int profit = 0;

    // Traverse the prices array to calculate profit for all possible transactions
    for (int i = 1; i < prices.length; i++) {
        // If the price today is higher than the previous day, sell for profit
        if (prices[i] > prices[i - 1]) {
            profit += prices[i] - prices[i - 1];
        }
    }

    return profit;
}
}
