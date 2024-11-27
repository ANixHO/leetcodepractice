  package leetcode.editor.en;
  public class No34_FindFirstAndLastPositionOfElementInSortedArray{
      public static void main(String[] args) {
           Solution solution = new No34_FindFirstAndLastPositionOfElementInSortedArray().new Solution();
      }
/* 
[34]Find First and Last Position of Element in Sorted Array
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};

        int left = 0;
        int right = nums.length -1;

        while (right >= left){
            int mid = left + (right - left ) / 2;
            if (nums[mid] > target){
                right = mid -1;
            } else if (nums[mid] < target){
                left = mid + 1;
            } else {
                return findRange(nums, target, mid);
            }
        }

        return new int[]{-1,-1};
    }

    private int[] findRange(int[] nums, int target, int index){
        int start = index;
        int end = index;

        while(start > 0 && nums[start - 1] == target) start --;
        while(end < nums.length - 1 && nums[end + 1] == target) end ++;
        return new int[]{start, end};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }