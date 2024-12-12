  package leetcode.editor.en;
  public class No209_MinimumSizeSubarraySum{
      public static void main(String[] args) {
           Solution solution = new No209_MinimumSizeSubarraySum().new Solution();
      }
/* 
[209]Minimum Size Subarray Sum
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int res = nums.length + 1;

        while (right < nums.length){
            sum += nums[right];
            while(sum >= target){
                res = Math.min(res, right - left + 1);
                sum -= nums[left++];
            }
            right ++;
        }
        return res == nums.length + 1 ? 0 : res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }