  package leetcode.editor.en;
  public class No121_BestTimeToBuyAndSellStock{
      public static void main(String[] args) {
           Solution solution = new No121_BestTimeToBuyAndSellStock().new Solution();
      }
      // [121]Best Time to Buy and Sell Stock
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int res = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowest) lowest = prices[i];
            else if (prices[i] - lowest > res) res = prices[i] - lowest;
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }