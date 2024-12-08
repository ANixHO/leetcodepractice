  package leetcode.editor.en;

  import java.util.Arrays;

  public class No238_ProductOfArrayExceptSelf{
      public static void main(String[] args) {
           Solution solution = new No238_ProductOfArrayExceptSelf().new Solution();
      }
/* 
[238]Product of Array Except Self
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        Arrays.fill(arr, 1);

        int curr = 1;
        for (int i = 0; i < len; i++) {
            arr[i] *= curr;
            curr *= nums[i];
        }

        curr = 1;
        for (int i = len - 1; i >= 0; i--) {
            arr[i] *= curr;
            curr *=nums[i];
        }
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }