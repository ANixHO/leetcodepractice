package leetcode.editor.en;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBalloons{
    public static void main(String[] args) {
         Solution solution = new MinimumNumberOfArrowsToBurstBalloons().new Solution();
    }
// [452]Minimum Number of Arrows to Burst Balloons
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int end = points[0][1];
        int arrows = 1;

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end){
                arrows ++;
                end = points[i][1];
            }
        }

        return arrows;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}