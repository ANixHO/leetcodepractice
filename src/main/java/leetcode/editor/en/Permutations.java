package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        Solution solution = new Permutations().new Solution();
    }

    // [46]Permutations
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res;

        public List<List<Integer>> permute(int[] nums) {
            res = new ArrayList<>();
            backtrack(nums, 0);
            return res;
        }

        private void backtrack(int[] nums, int start) {
            if (start == nums.length - 1){
                List<Integer> comb = new ArrayList<>();
                for (int num : nums){
                    comb.add(num);
                }
                res.add(comb);
                return;
            }

            for (int i = start; i < nums.length; i++) {
                swap(nums, start, i);
                backtrack(nums, start + 1 );
                swap(nums, start, i);
            }

        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}