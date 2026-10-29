class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;               // cheaper day to buy
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;   // better day to sell
            }
        }

        return maxProfit;
    }
}