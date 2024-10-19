package leetcode.editor.en;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        Solution solution = new HappyNumber().new Solution();
    }

    // [202]Happy Number
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isHappy(int n) {
            int slow = getSumOfSquares(n);
            int fast = getSumOfSquares(getSumOfSquares(n));

            while (fast != 1 && fast != slow) {
                slow = getSumOfSquares(slow);
                fast = getSumOfSquares(getSumOfSquares(fast));
            }

            return fast == 1;
        }

        private int getSumOfSquares(int n) {
            int sum = 0;

            while (n != 0) {
                int digit = (n % 10);
                sum += digit * digit;
                n /= 10;
            }

            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}