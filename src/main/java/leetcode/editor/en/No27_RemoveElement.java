  package leetcode.editor.en;
  public class No27_RemoveElement{
      public static void main(String[] args) {
           Solution solution = new No27_RemoveElement().new Solution();
      }
      // [27]Remove Element
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) nums[k++] = nums[i];
        }

        return k;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }