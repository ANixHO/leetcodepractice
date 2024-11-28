package leetcode.editor.en;

import java.util.Arrays;

public class No136_SingleNumber {
    public static void main(String[] args) {
        Solution solution = new No136_SingleNumber().new Solution();
    }

    /*
    [136]Single Number
    */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNumber(int[] nums) {
        int res = 0;

        for (int i : nums){
            res ^= i;
        }

        return res;

        /*
        if (nums.length == 1) return nums[0];

        Arrays.sort(nums);
        int index = 0;
        while (index < nums.length-1){
            if (nums[index] != nums[index + 1]){
                return nums[index];
            }
            index += 2;
        }

        return nums[nums.length-1];

         */
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}