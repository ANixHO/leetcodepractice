package leetcode.editor.en;
public class FindPeakElement{
    public static void main(String[] args) {
         Solution solution = new FindPeakElement().new Solution();
    }
// [162]Find Peak Element
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length -1;

        while (right > left){
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1])
                left = mid + 1;
            else
                right = mid;

        }

        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}