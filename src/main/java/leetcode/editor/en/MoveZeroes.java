package leetcode.editor.en;
public class MoveZeroes{
    public static void main(String[] args) {
         Solution solution = new MoveZeroes().new Solution();
    }
// [283]Move Zeroes
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
        }

        for (;slow < nums.length ; slow++) {
            nums[slow] = 0;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}