  package leetcode.editor.en;

  import java.util.Arrays;

  public class No169_MajorityElement{
      public static void main(String[] args) {
           Solution solution = new No169_MajorityElement().new Solution();
      }
/* 
[169]Majority Element
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }