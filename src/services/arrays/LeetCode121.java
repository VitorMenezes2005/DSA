package services.arrays;

public class LeetCode121 {
    public static int maxProfit(int[] prices){
        int l = 0;
        int bestProfit = 0;

        for(int r=0; r<prices.length; r++){
            if(prices[r] < prices[l]){
                l = r;
            }else{
                int profile = prices[r] - prices[l];
                bestProfit = Math.max(bestProfit, profile);
            }
        }

        return bestProfit;
    }
}
