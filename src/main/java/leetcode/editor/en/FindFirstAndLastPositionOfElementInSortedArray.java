package leetcode.editor.en;
public class FindFirstAndLastPositionOfElementInSortedArray{
    public static void main(String[] args) {
        Solution solution = new FindFirstAndLastPositionOfElementInSortedArray().new Solution();
    }
// [34]Find First and Last Position of Element in Sorted Array
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (right - left )/2 + left;

            if (nums[mid] < target){
                left = mid + 1;
            } else if(nums[mid] > target){
                right = mid - 1;
            } else {
                return findRange(nums, mid, target);
            }
        }

        return new int[]{-1, -1};
    }

    private int[] findRange(int[] nums, int mid, int target){
        int start = mid;
        int end = mid;

        while(start > 0 && nums[start-1] == target) start--;
        while(end < nums.length - 1 && nums[end + 1] == target) end ++;

        return new int[]{start, end};
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}