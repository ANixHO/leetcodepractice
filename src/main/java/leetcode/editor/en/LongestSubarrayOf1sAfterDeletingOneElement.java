package leetcode.editor.en;

public class LongestSubarrayOf1sAfterDeletingOneElement {
    public static void main(String[] args) {
        Solution solution = new LongestSubarrayOf1sAfterDeletingOneElement().new Solution();
    }

    // [1493]Longest Subarray of 1's After Deleting One Element
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestSubarray(int[] nums) {
            int delete = 0;
            int res = 0;
            int left = 0;
            int right = 0;

            for (; right < nums.length; right ++) {
                if (nums[right] == 0) delete++;

                while (delete > 1) {
                    if (nums[left] == 0) {
                        delete--;
                    }
                    left ++;
                }

                res = Math.max(right - left, res);
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    // my solution 1
    }

}