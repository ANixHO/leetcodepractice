  package leetcode.editor.en;

  import java.util.ArrayList;
  import java.util.Iterator;
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
        /*
        * solution:
        * 1. for loop for iterate array
        * 2. while loop for find the consecutive numbers
        */
        List<String> res = new ArrayList<>();
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            boolean flg = false;

            while(i + 1 < len && nums[i] + 1 == nums[i+1]){
                i++;
                flg = true;
            }
            if (flg) sb.append("->").append(nums[i]);

            res.add(sb.toString());
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }