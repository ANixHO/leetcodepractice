package leetcode.editor.en;
public class JumpGameIi{
    public static void main(String[] args) {
        Solution solution = new JumpGameIi().new Solution();
    }
// [45]Jump Game II
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int jump(int[] nums) {
        int curEnd = 0;
        int curFarthest = 0;
        int res = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(curFarthest, nums[i] + i);

            if (i == curEnd){
                curEnd = curFarthest;
                res++;
            }
        }

        return res;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}