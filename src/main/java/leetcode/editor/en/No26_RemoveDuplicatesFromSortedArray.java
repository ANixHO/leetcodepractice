package leetcode.editor.en;

import java.util.HashSet;
import java.util.Set;

public class No26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution solution = new No26_RemoveDuplicatesFromSortedArray().new Solution();
    }

    // [26]Remove Duplicates from Sorted Array
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeDuplicates(int[] nums) {
            int k = 0;
            int prev = -101;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > prev) {
                    nums[k++] = nums[i];
                    prev = nums[i];
                }
            }

            return k;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}