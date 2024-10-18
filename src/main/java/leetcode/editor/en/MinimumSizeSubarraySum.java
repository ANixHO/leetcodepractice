package leetcode.editor.en;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Solution solution = new MinimumSizeSubarraySum().new Solution();
    }

    // [209]Minimum Size Subarray Sum
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            // pointers, right is always equal or bigger than left
            int right = 0;
            int left = 0;

            int curSum = 0;
            int res = nums.length + 1;

            while (right < nums.length) {

                // move the right index forward and add that value to current sum
                curSum += nums[right];

                // check that is the current sum bigger than target
                // if so, remove the value that left index points, and move left forward
                // and repeat until find the minimum length
                while (curSum >= target) {
                    curSum -= nums[left];
                    res = Math.min(res, right - left + 1);
                    left ++;
                }
                right ++;
            }
            return res == nums.length + 1? 0 : res;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}