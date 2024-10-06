package leetcode.editor.en;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        Solution solution = new NonOverlappingIntervals().new Solution();
    }

    // [435]Non-overlapping Intervals
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {

            Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

            int res = 0;
            int prev = 0;

            for (int i = 1; i < intervals.length; i++) {
                if (intervals[prev][1] > intervals[i][0]) {
                    res ++;
                } else {
                    prev = i;
                }
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}