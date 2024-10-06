package leetcode.editor.en;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        Solution solution = new MaxNumberOfKSumPairs().new Solution();
    }

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

            int left = countZero;
            int right = nums.length - 1;
            int count = 0;

            while (left < right) {
                if (nums[left] + nums[right] == k) {
                    count++;
                    left++;
                    right--;
                } else if (nums[left] + nums[right] > k) {
                    right--;
                } else if (nums[left] + nums[right] < k) {
                    left ++;
                }
            }

            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}