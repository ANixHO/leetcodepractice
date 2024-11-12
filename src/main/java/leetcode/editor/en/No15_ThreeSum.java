package leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No15_ThreeSum {
    public static void main(String[] args) {
        Solution solution = new No15_ThreeSum().new Solution();
        solution.threeSum(new int[]{-1,0,1,2,-1,-4});
    }

    // [15]3Sum
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res;

        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            res = new ArrayList<>();
            for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
                if (i != 0 && nums[i] == nums[i - 1]) continue;
                twoSum(-nums[i], i + 1, nums);
            }
            return res;
        }

        private void twoSum(int target, int start, int[] nums) {
            int end = nums.length - 1;

            while (start < end) {
                if (nums[start] + nums[end] > target) {
                    end--;
                    continue;
                }

                if (nums[start] + nums[end] < target) {
                    start++;
                    continue;
                }

                List<Integer> curr = new ArrayList<>();
                curr.add(-target);
                curr.add(nums[start++]);
                curr.add(nums[end--]);
                res.add(curr);

                while (start <= end && nums[start] == nums[start - 1]) {
                    start++;
                }

            }

        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}