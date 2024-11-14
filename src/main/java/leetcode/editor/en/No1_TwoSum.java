  package leetcode.editor.en;

  import java.util.Arrays;
  import java.util.HashMap;
  import java.util.Map;

  public class No1_TwoSum{
      public static void main(String[] args) {
           Solution solution = new No1_TwoSum().new Solution();
      }
/* 
[1]Two Sum
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            if (map.containsKey(find)){
                return new int[]{map.get(find), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }