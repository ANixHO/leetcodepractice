  package leetcode.editor.en;
  public class No121_BestTimeToBuyAndSellStock{
      public static void main(String[] args) {
           Solution solution = new No121_BestTimeToBuyAndSellStock().new Solution();
      }
/* 
[121]Best Time to Buy and Sell Stock
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy =prices[i];
            } else {
                profit =Math.max(profit, prices[i] - buy);
            }

        }
        return profit;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }