package leetcode.editor.en;
public class SearchInRotatedSortedArray{
    public static void main(String[] args) {
        Solution solution = new SearchInRotatedSortedArray().new Solution();
    }
// [33]Search in Rotated Sorted Array
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        return devideSearch(nums, target, 0, nums.length - 1);
    }

    private int devideSearch(int[] nums, int target, int start, int end){
        if (start > end) return -1;
        int mid = (end - start) / 2 + start;

        if (nums[mid] == target) return mid;

        if (nums[start] <= nums[mid]){
            if ((nums[start] <= target) && (nums[mid] >= target)){
                return devideSearch(nums, target, start, mid - 1);
            } else {
                return devideSearch(nums, target, mid + 1, end);
            }
        } else {
            if (nums[mid] <= target && target <= nums[end]){
                return devideSearch(nums, target, mid + 1, end);
            } else {
                return devideSearch(nums, target, start, mid - 1);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}