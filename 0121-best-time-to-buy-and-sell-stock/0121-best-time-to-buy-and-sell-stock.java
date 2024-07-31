class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, j = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[j] < prices[i + 1]) {
                if (maxProfit < prices[i + 1] - prices[j]) {
                    maxProfit = prices[i + 1] - prices[j];
                }
            } else {
                j = i + 1;
            }
        }

        return maxProfit;
    }
}