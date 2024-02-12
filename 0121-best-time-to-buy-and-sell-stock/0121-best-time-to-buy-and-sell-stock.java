class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int j = 0;
        int k = 1;
        for (int i = 0; k < prices.length; i++) {
            if (prices[j] > prices[k]) {
                j = k;
            } else {
                if (maxProfit < prices[k] - prices[j]) {
                    maxProfit = prices[k] - prices[j];
                }
            }
            k++;
        }
        return maxProfit;
    }
}