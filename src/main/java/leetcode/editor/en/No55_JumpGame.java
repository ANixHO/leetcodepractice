  package leetcode.editor.en;
  public class No55_JumpGame{
      public static void main(String[] args) {
           Solution solution = new No55_JumpGame().new Solution();
      }
      // [55]Jump Game
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canJump(int[] nums) {
        /*
            basically, we just need to consider whether
            the 0 exists in the array range from index 0 to nums.length - 1

            when meet the 0, assign the curr for 2,
            because at least it needs 2 steps to step over the 0 and keep going

            and when we find out the number that bigger than curr value
            assign the boolean to false
            it means we can step over the next 0
         */
        int curr = 0;
        boolean isCountForZero = false;
        nums[nums.length - 1] += 1;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (!isCountForZero && nums[i] == 0){
                isCountForZero = true;
                curr = 2;
                continue;

            }

            if (isCountForZero && nums[i] >= curr){
                isCountForZero = false;
            }else {
                curr ++;
            }
        }

        nums[nums.length -1] -= 1;
        return !isCountForZero;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }