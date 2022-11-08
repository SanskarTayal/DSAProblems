/*
 * Link To Problem:- https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * we can only sell after buying
 */

class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]-buyprice>maxprofit)
            {
                maxprofit=prices[i]-buyprice;
                continue;
            }
            if(prices[i]<buyprice)
            buyprice=prices[i];
        }
        return maxprofit;
    }
}