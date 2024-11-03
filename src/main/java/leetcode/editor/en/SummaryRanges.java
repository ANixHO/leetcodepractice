package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        Solution solution = new SummaryRanges().new Solution();
    }

    //  [228]Summary Ranges
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> list = new ArrayList<>();
            int len = nums.length;

            for (int i = 0; i < len; i++) {
                StringBuilder sb = new StringBuilder();
                boolean flg = false;
                int last = 0;
                sb.append(nums[i]);

                while(i + 1 < len && nums[i] + 1 == nums[i+1]){
                    i++;
                    flg = true;
                    last = nums[i];
                }

                if (flg){
                    sb.append("->").append(last);
                }

                list.add(sb.toString());
            }

            return list;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}


















