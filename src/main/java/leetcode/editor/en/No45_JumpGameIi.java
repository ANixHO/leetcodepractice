  package leetcode.editor.en;
  public class No45_JumpGameIi{
      public static void main(String[] args) {
           Solution solution = new No45_JumpGameIi().new Solution();
      }
      // [45]Jump Game II
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int jump(int[] nums) {
        /*
            iterate the whole array
            while calculate the farthest position
            when index is farthest position, it means we need take one more step
            so res ++
         */
        int curEnd = 0;
        int curFartheset = 0;
        int res = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            curFartheset = Math.max(curFartheset, nums[i] + i);

            if (i == curEnd){
                curEnd = curFartheset;
                res++;
            }
        }

        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }