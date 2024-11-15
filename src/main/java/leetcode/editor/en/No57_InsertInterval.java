  package leetcode.editor.en;

  import java.util.ArrayList;
  import java.util.List;

  public class No57_InsertInterval{
      public static void main(String[] args) {
           Solution solution = new No57_InsertInterval().new Solution();
      }
/* 
[57]Insert Interval
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int len = intervals.length;
        int i = 0;
        List<int[]> list = new ArrayList<>();

        while(i < len&& intervals[i][1] < newInterval[0] ){
            list.add(intervals[i++]);
        }

        while( i < len&&intervals[i][0] <= newInterval[1] ){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        list.add(newInterval);

        while(i < len){
            list.add(intervals[i++]);
        }

        int[][] res = new int[list.size()][];
        for (int j = 0; j < list.size(); j++) {
            res[j] = list.get(j);
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }