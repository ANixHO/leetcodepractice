  package leetcode.editor.en;

  import java.util.Arrays;

  public class No137_SingleNumberIi{
      public static void main(String[] args) {
           Solution solution = new No137_SingleNumberIi().new Solution();
      }
/* 
[137]Single Number II
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        int len = nums.length;
        int index = 0;

        Arrays.sort(nums);

        while (index < len - 2){
            if (nums[index] == nums[index + 1] && nums[index] == nums[index + 2]) {
                index += 3;
            } else {
                return nums[index];
            }
        }

        return nums[len - 1];

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }