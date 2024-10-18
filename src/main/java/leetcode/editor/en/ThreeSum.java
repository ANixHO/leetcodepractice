package leetcode.editor.en;

import java.util.*;

public class ThreeSum{
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
    }
// [15]3Sum
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // store result temporally in hash set as it will store only unique value
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();

        // i for first element of triplets
        // j for second
        // k for third
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            // while loop constrained by k > j, so that only iterate array once
            while(k > j){

                // when found the target elements, add these to set
                // and move j and k ahead
                if (nums[i] + nums[j] + nums[k] == 0){
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    // if triplets are bigger than 0, move k index backward to find smaller value
                } else if (nums[i] + nums[j] + nums[k] > 0){
                    k--;

                    // if triplets are less than 0, move j index forward to find bigger value
                } else {
                    j ++;
                }
            }
        }

        res.addAll(set);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}