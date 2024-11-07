  package leetcode.editor.en;
  public class No122_BestTimeToBuyAndSellStockIi{
      public static void main(String[] args) {
           Solution solution = new No122_BestTimeToBuyAndSellStockIi().new Solution();
           solution.maxProfit(new int[]{7,1,5,3,6,4});
      }
      // [122]Best Time to Buy and Sell Stock II
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;

        for (int i = 1; i < prices.length; i++) {
           if (prices[i] > prices[i-1]  ){
               res += prices[i] - prices[i-1];
           }
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }