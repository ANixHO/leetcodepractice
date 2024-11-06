  package leetcode.editor.en;

  import java.util.Arrays;
  import java.util.HashMap;
  import java.util.Map;

  public class No169_MajorityElement{
      public static void main(String[] args) {
           Solution solution = new No169_MajorityElement().new Solution();
      }
      // [169]Majority Element
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
       int res = 0;
       int count = 0;

       for (int n : nums){
           if (count == 0) res = n;

           count += res == n ? 1 : -1;
       }

       return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }