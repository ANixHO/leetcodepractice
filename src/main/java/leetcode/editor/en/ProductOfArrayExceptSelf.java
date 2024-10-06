package leetcode.editor.en;

import java.util.Arrays;

public class ProductOfArrayExceptSelf{
    public static void main(String[] args) {
         Solution solution = new ProductOfArrayExceptSelf().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);

        int cur = 1;

        for (int i = 0; i < n; i++) {
            arr[i] *= cur;
            cur *= nums[i];
        }

        cur = 1;

        for (int i = n -1; i >= 0 ; i--) {
            arr[i] *= cur;
            cur *= nums[i];
        }

        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}