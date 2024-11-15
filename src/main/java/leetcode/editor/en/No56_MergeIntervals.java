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

        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        for (int i = 0; i < intervals.length; i++) {
            if (res.isEmpty() || intervals[i][0] > res.get(res.size()-1)[1]){
                res.add(new int[]{intervals[i][0], intervals[i][1]});
            }else {
                int prev = res.get(res.size() -1)[1];
                int curr = intervals[i][1];
                res.get(res.size() - 1)[1] = Math.max(prev, curr);
            }
        }

        int[][] ans = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }