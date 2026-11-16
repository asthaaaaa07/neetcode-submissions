class Solution {
    public int maxProfit(int[] prices) {
       /* int buy=0;
        
        int maxProfit=0;
        for(int sell=1;sell<prices.length;sell++){
            if (prices[buy]>prices[sell]){
                buy=sell;
            }else{
             
             maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);

             
            } 
        }
        return maxProfit;*/
         int left = 0;
        int maxProfit = 0;

        for (int right = 1; right < prices.length; right++) {

            if (prices[right] < prices[left]) {
                left = right;
            } else {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}
