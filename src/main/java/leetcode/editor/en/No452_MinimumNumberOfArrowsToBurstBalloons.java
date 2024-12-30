  package leetcode.editor.en;

  import java.util.Arrays;
  import java.util.Comparator;

  public class No452_MinimumNumberOfArrowsToBurstBalloons{
      public static void main(String[] args) {
           Solution solution = new No452_MinimumNumberOfArrowsToBurstBalloons().new Solution();
      }
/* 
[452]Minimum Number of Arrows to Burst Balloons
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(value -> value[1]));
        int currEnd = points[0][1];
        int arrows = 1;

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > currEnd){
                currEnd = points[i][1];
                arrows ++;
            }
        }
        return arrows;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }