package leetcode.editor.en;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution solution = new BestTimeToBuyAndSellStock().new Solution();
    }

    // [121]Best Time to Buy and Sell Stock
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            int res = 0;
            int minPrice = 10000;

            for (int cur : prices) {

                if (cur < minPrice){
                    minPrice = cur;
                } else if (cur - minPrice > res){
                    res = cur - minPrice;
                }
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}