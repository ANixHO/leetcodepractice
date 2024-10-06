package leetcode.editor.en;

public class LongestSubarrayOf1sAfterDeletingOneElement {
    public static void main(String[] args) {
        Solution solution = new LongestSubarrayOf1sAfterDeletingOneElement().new Solution();
    }

    // [1493]Longest Subarray of 1's After Deleting One Element
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestSubarray(int[] nums) {
            int cur = 0;
            int pre = 0;
            int ans = 0;

            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == 1){
                    cur ++;
                }else {
                    ans = Math.max(ans, pre + cur);
                    pre = cur;
                    cur = 0;
                }
            }

            ans = Math.max(ans, pre + cur);
            return ans == nums.length ? ans -1: ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    // my solution 1
    public int mySolution(int[] nums){
        int max = 0;
        int left = 0;
        int del = 0;

        for (int right = 0; right < nums.length; right++) {

            if(nums[right] == 0) del ++;

            while(del > 1){
                if(nums[left] == 0){
                    del --;
                }
                left ++;
            }

            max = Math.max(max, right - left + 1 - del);
        }

        if(del == 0) max -= 1;
        return max;
    }

}