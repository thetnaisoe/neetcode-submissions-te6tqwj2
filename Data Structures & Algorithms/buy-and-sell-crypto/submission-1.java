class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int res = 0;
        int max = 0;

        for(int r = 1; r < prices.length; r++){
            if(prices[r] < prices[l]){
                l = r;
            }
            res = prices[r] - prices[l];
            max = Math.max(max, res);
        }

        return max;
    }
}
