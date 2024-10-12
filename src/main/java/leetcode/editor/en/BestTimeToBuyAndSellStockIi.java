package leetcode.editor.en;

public class BestTimeToBuyAndSellStockIi {
    public static void main(String[] args) {
        Solution solution = new BestTimeToBuyAndSellStockIi().new Solution();
    }

    // [122]Best Time to Buy and Sell Stock II
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            int start = prices[0];
            int max = 0;

            for (int cur : prices) {
                if (cur > start) {
                    max += cur - start;
                }
                start = cur;
            }

            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}