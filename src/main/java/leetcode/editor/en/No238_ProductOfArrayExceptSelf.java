  package leetcode.editor.en;
  public class No238_ProductOfArrayExceptSelf{
      public static void main(String[] args) {
           Solution solution = new No238_ProductOfArrayExceptSelf().new Solution();
      }
      // [238]Product of Array Except Self
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] preProduct = new int[len];
        int[] postProdout = new int[len];
        int[] res = new int[len];

        int leftProduct = 1;
        int rightProduct = 1;

        for (int i = 0; i < len; i++) {
            preProduct[i] = leftProduct;
            leftProduct *= nums[i];

            postProdout[len - 1 -i] = rightProduct;
            rightProduct *= nums[len - 1 - i];
        }

        for (int i = 0; i < len; i++) {
            res[i] = preProduct[i] * postProdout[i];
        }

        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }