  package leetcode.editor.en;
  public class No55_JumpGame{
      public static void main(String[] args) {
           Solution solution = new No55_JumpGame().new Solution();
      }
/* 
[55]Jump Game
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canJump(int[] nums) {
        int steps = 0;
        for (int i = nums.length-2; i >=0; i--) {
            if (nums[i] == 0 && steps == 0){
                steps = 1;
            }
            if (nums[i] < steps){
                steps++;
            } else {
                steps = 0;
            }
        }
        return steps == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }