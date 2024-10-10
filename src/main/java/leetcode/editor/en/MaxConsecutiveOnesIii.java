package leetcode.editor.en;

public class MaxConsecutiveOnesIii {
    public static void main(String[] args) {
        Solution solution = new MaxConsecutiveOnesIii().new Solution();
    }

    //    [1004]Max Consecutive Ones III
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /*
            sliding window
            move the right pointer first until zero > k
            then move the left pointer until zero == k
            figure out whether it is the longest 1's
         */
        public int longestOnes(int[] nums, int k) {
            int max = 0;
            int zeros = 0;

            int right = 0;
            int left = 0;

            for (; right < nums.length; right++) {

                // when current number is zero, flip a zero to one, count the current number of zero
                if (nums[right] == 0) zeros ++;
//
//                when the number of flipped zero more than k, move the left pointer to the last number one
                while(zeros > k) {
                    if (nums[left] == 0) {
                        zeros --;
                    }
                    left ++;
                }

                max = Math.max(right - left + 1, max);
            }

            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}