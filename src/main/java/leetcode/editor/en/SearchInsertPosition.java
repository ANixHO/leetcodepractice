package leetcode.editor.en;
public class SearchInsertPosition{
    public static void main(String[] args) {
        Solution solution = new SearchInsertPosition().new Solution();
    }
// [35]Search Insert Position
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int res = -1;

        while(right >= left){
            int mid = (right - left) / 2 + left;

            if (nums[mid] > target){
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                res = mid;
                break;
            }
            res = left;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}