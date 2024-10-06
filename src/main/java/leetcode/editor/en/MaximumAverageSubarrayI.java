package leetcode.editor.en;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        Solution solution = new MaximumAverageSubarrayI().new Solution();

        int[] nums = new int[]{1, 12, -5, -6, 50, 3};

        double d = solution.findMaxAverage(nums, 4);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMaxAverage(int[] nums, int k) {

            /*
                second
             */

            if (nums.length == 1) return nums[0];
            int n = nums.length;
            int max = Integer.MIN_VALUE;
            int cur = 0;

            int right = 0;
            int left = 0;

            for (; right < k -1; right++) {
                cur += nums[right];
            }

            for (;right < n; right ++){
                cur += nums[right];

                if (cur > max) max = cur;

                cur -= nums[left];
                left ++;
            }

            return (double)max / k;






            /*
                first
             */
//
//
//            int leftB = 0;
//            int rightB = k;
//            int maxSum = 0;
//            int curSum = 0;
//
//            for (int i = 0; i < k; i++) {
//                curSum += nums[i];
//            }
//
//            maxSum = curSum;
//
//            while (rightB < nums.length) {
//
//                curSum -= nums[leftB];
//                curSum += nums[rightB];
//
//                if (curSum > maxSum) {
//                    maxSum = curSum;
//                }
//
//                leftB++;
//                rightB++;
//            }
//
//            return (double) maxSum / k;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}