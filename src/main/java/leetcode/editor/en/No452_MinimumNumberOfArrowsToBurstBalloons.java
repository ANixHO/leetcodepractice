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

        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        int end = points[0][1];
        int arrows = 1;
        int len = points.length;

        for (int i = 1; i < len; i++) {
            if (points[i][0] > end){
                arrows++;
                end = points[i][1];
            }
        }

        return arrows;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }