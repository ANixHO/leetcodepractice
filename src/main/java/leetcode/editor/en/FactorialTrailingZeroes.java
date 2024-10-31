package leetcode.editor.en;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        Solution solution = new FactorialTrailingZeroes().new Solution();
        solution.trailingZeroes(13);
    }

    // [172]Factorial Trailing Zeroes
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int trailingZeroes(int n) {
            int count = 0;
            while (n > 0) {
                n /= 5;
                count += n;
            }

            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}