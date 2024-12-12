package leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No15_ThreeSum {
    public static void main(String[] args) {
        Solution solution = new No15_ThreeSum().new Solution();
    }

    /*
    [15]3Sum
    */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res;

        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            int len = nums.length;

            res = new ArrayList<>();
            for (int i = 0; i < len - 2 && nums[i] <= 0; i++) {
                if (i == 0 || nums[i] != nums[i - 1]) {

                    twoSum(-nums[i], i + 1, nums);
                }
            }
            return res;
        }

        private void twoSum(int target, int left, int[] nums) {
            int right = nums.length - 1;

            while (right > left) {
                int sum = nums[left] + nums[right];

                if (sum > target) {
                    right--;
                    continue;
                }
                if (sum < target) {
                    left++;
                    continue;
                }

                List<Integer> curr = new ArrayList<>();
                curr.add(-target);
                curr.add(nums[left]);
                curr.add(nums[right]);
                res.add(curr);
                left++;
                right--;

                while (right >= left && nums[left] == nums[left - 1]) {
                    left++;
                }


            }


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
