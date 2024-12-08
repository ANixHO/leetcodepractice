  package leetcode.editor.en;
  public class No45_JumpGameIi{
      public static void main(String[] args) {
           Solution solution = new No45_JumpGameIi().new Solution();
      }
/* 
[45]Jump Game II
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int jump(int[] nums) {
        int currEnd = 0;
        int currFarthest = 0;
        int steps = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            currFarthest = Math.max(currFarthest, nums[i] + i);

            if (i == currEnd){
                steps++;
                currEnd = currFarthest;
            }
        }
        return steps;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }