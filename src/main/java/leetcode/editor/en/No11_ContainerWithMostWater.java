  package leetcode.editor.en;
  public class No11_ContainerWithMostWater{
      public static void main(String[] args) {
           Solution solution = new No11_ContainerWithMostWater().new Solution();
      }
/* 
[11]Container With Most Water
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int res = 0;

        while(right > left){
            res = Math.max(res, Math.min(height[left], height[right]) * (right - left));
            if (height[left] >= height[right]){
                right --;
            } else {
                left ++;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }