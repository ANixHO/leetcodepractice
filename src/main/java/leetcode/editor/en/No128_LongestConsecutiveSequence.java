package leetcode.editor.en;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class No128_LongestConsecutiveSequence {
    public static void main(String[] args) {
        Solution solution = new No128_LongestConsecutiveSequence().new Solution();
    }

    /*
    [128]Longest Consecutive Sequence
    */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestConsecutive(int[] nums) {
            if (nums.length <= 1) return nums.length;
            Arrays.sort(nums);

            int res = 0;
            int curr = 1;


            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    if (nums[i] == nums[i - 1] + 1) {
                        curr++;
                    } else {
                        res = Math.max(res, curr);
                        curr = 1;
                    }
                }


            }
            return Math.max(res, curr);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}