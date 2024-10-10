package leetcode.editor.en;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        Solution solution = new MaxNumberOfKSumPairs().new Solution();
    }

    //    [1679] Max Number of K-Sum pairs
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxOperations(int[] nums, int k) {
            int countZero = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= k) {
                    nums[i] = 0;
                    countZero++;
                }
            }

            Arrays.sort(nums);

            int left = 0;
            int right = nums.length - 1;

            int res = 0;

            while (left < right) {

                int cur = nums[left] + nums[right];

                if (cur == k) {
                    res++;
                    left++;
                    right--;
                } else if (cur > k) {
                    right--;
                } else if (cur < k) {
                    left++;
                }
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}