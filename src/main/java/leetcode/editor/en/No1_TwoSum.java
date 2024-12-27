  package leetcode.editor.en;

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
        /*

         solution:
         1. use map to store the retrieved int and its index
         2. find the int in map equals to 'target - current int'

         */
        // key: int in nums
        // value : the index of int
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int find = target-nums[i];
            if (map.containsKey(find)){
                return new int[]{i, map.get(find)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }