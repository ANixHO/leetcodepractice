  package leetcode.editor.en;

  import java.util.ArrayList;
  import java.util.List;

  public class No228_SummaryRanges{
      public static void main(String[] args) {
           Solution solution = new No228_SummaryRanges().new Solution();
      }
/* 
[228]Summary Ranges
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            boolean flg = false;
            sb.append(nums[i]);

            while (i + 1 < len && nums[i] + 1 == nums[i + 1]){
                i++;
                flg = true;
            }
            if (flg){
                sb.append("->").append(nums[i]);
            }
            res.add(sb.toString());
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }