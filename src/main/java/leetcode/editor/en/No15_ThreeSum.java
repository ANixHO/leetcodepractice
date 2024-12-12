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
           res = new ArrayList<>();
           Arrays.sort(nums);

            for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
                if (i == 0 || nums[i] != nums[i - 1]){
                    twoSum(i+1, -nums[i], nums);
                }
            }
            return res;

        }

        private void twoSum(int start, int target, int[] nums){
            int end = nums.length - 1;

            while(start < end) {
                int sum = nums[start] + nums[end];

                if (sum > target) {
                    end--;
                    continue;
                }

                if (sum < target){
                    start ++;
                    continue;
                }

                List<Integer> curr = new ArrayList<>();
                curr.add(-target);
                curr.add(nums[start]);
                curr.add(nums[end]);
                res.add(curr);
                start++;
                end--;

                while(start < end && nums[start] == nums[start - 1]){
                    start++;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
