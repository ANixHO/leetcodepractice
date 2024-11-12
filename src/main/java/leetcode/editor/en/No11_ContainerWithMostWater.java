  package leetcode.editor.en;
  public class No11_ContainerWithMostWater{
      public static void main(String[] args) {
           Solution solution = new No11_ContainerWithMostWater().new Solution();
      }
      // [11]Container With Most Water
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;

        while(right > left){
            res = Math.max(res, (right - left) * Math.min(height[left], height[right]));

            if (height[right] >= height[left]){
                left++;
            } else{
                right--;
            }

        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }