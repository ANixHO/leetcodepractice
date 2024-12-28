  package leetcode.editor.en;

  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.Comparator;
  import java.util.List;

  public class No56_MergeIntervals{
      public static void main(String[] args) {
           Solution solution = new No56_MergeIntervals().new Solution();
      }
/* 
[56]Merge Intervals
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(array -> array[0]));
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < intervals.length ; i++) {
            if (list.isEmpty() ||
                intervals[i][0] > list.get(list.size()-1)[1]){

                list.add(new int[]{intervals[i][0], intervals[i][1]});
            } else {
                int prev = list.get(list.size()-1)[1];
                int curr = intervals[i][1];
                list.get(list.size()-1)[1] = Math.max(prev, curr);
            }
        }

        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }