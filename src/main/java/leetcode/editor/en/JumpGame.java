package leetcode.editor.en;

public class JumpGame {
    public static void main(String[] args) {
        Solution solution = new JumpGame().new Solution();
        solution.canJump(new int[]{3, 2, 1, 0, 4});
    }

    // [55]Jump Game
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canJump(int[] nums) {
            int cur = 0;
            boolean isCountForZero = false;
            nums[nums.length - 1] += 1;

            for (int i = nums.length - 1; i >= 0; i--) {

                if (!isCountForZero && nums[i] == 0) {
                    cur = 2;
                    isCountForZero = true;
                    continue;
                }
                if (isCountForZero && nums[i] >= cur) {
                    isCountForZero = false;
                } else {
                    cur++;
                }
            }


            if (isCountForZero) {
                return false;
            } else {
                nums[nums.length - 1] -= 1;
                return true;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}