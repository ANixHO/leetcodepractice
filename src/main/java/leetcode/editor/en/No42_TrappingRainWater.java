  package leetcode.editor.en;
  public class No42_TrappingRainWater{
      public static void main(String[] args) {
           Solution solution = new No42_TrappingRainWater().new Solution();
      }
      // [42]Trapping Rain Water
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trap(int[] height) {
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;

        int left = 0;
        int right = height.length - 1;
        int res = 0;

        while (right > left){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            res += leftMax <= rightMax ? leftMax - height[left++] : rightMax - height[right--];
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }