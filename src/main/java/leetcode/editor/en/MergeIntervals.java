package leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals{
    public static void main(String[] args) {
        Solution solution = new MergeIntervals().new Solution();
    }
// [56]Merge Intervals
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int len = intervals.length;
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < len; i++) {
           if (list.isEmpty() || intervals[i][0] > list.get(list.size() - 1)[1] ){
               int[] temp = new int[]{intervals[i][0], intervals[i][1]};
               list.add(temp);
           } else {
               int prevEnd = list.get(list.size() - 1)[1];
               int curEnd = intervals[i][1];
               list.get(list.size() - 1)[1] =  Math.max(prevEnd, curEnd);
           }

        }

        int[][] res = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}