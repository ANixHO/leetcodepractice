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
        List<int[]> list = new ArrayList<>();
        int len = intervals.length;
        int index = 0;
        while (index < len && intervals[index][1] < newInterval[0]){
            list.add(intervals[index++]);
        }

        while ( index < len && newInterval[1] >=intervals[index][0]){
            newInterval[0] = Math.min(intervals[index][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[index][1], newInterval[1]);
            index++;
        }

        list.add(newInterval);

        while(index < len){
            list.add(intervals[index++]);
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