  package leetcode.editor.en;
  public class No33_SearchInRotatedSortedArray{
      public static void main(String[] args) {
           Solution solution = new No33_SearchInRotatedSortedArray().new Solution();
      }
/* 
[33]Search in Rotated Sorted Array
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    private int helper(int[] nums, int target, int left, int right){
        if (left > right) return -1;

        int mid = (right - left) / 2 + left;

        if (nums[mid] == target) return mid;
        if (nums[left] <= nums[mid]){
            if (nums[left] <= target && nums[mid] >=target){
                return helper(nums, target, left, mid-1);
            } else {
                return helper(nums, target, mid + 1, right);
            }
        }else {
            if (nums[mid] <= target && target <= nums[right]){
                return helper(nums, target, mid + 1, right);
            } else {
                return helper(nums, target, left, mid - 1);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }