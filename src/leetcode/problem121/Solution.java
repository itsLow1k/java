package leetcode.problem121;

public class Solution {
    public static int maxProfit (int[] prices){
        int minPrice = prices[0];
        int profit = 0;
        int i = 1;
        while (i < prices.length){
            if (prices[i] < minPrice){
                minPrice = prices[i];
            } else if (prices[i] - minPrice > profit){
                profit = prices[i] - minPrice;
            }
            i++;
        }
        return profit;
    }
    public static void main(String[] args) {
        maxProfit(new int[] {2,4,1});
    }
}
