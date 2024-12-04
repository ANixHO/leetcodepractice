  package leetcode.editor.en;
  public class No122_BestTimeToBuyAndSellStockIi{
      public static void main(String[] args) {
           Solution solution = new No122_BestTimeToBuyAndSellStockIi().new Solution();
      }
/* 
[122]Best Time to Buy and Sell Stock II
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]){
                res += prices[i] - prices[i-1];
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }