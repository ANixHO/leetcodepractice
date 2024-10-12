package leetcode.editor.en;

import java.util.Arrays;

public class MajorityElement{
    public static void main(String[] args) {
         Solution solution = new MajorityElement().new Solution();
    }
// [169]Majority Element
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        //  the element that appears more than n / 2 times
        //  always appears at the nums[n/2]
        // WTF! blow my mind!!!!
        return nums[nums.length/2];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}