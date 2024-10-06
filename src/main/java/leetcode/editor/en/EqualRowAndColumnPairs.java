package leetcode.editor.en;

import java.util.*;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        Solution solution = new EqualRowAndColumnPairs().new Solution();
        solution.equalPairs(new int[][]{{1,11}, {11,1}});
    }

    // [2352]Equal Row and Column Pairs
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int equalPairs(int[][] grid) {
            Map<String, Integer> cols = new HashMap<>();
            int count = 0;

            for (int i = 0; i < grid.length; i++) {
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < grid.length; j++) {
                    // add 0 to each integer considering duplicated number
                    sb.append(grid[j][i]).append("0");
                }

                cols.put(sb.toString(), cols.getOrDefault(sb.toString(), 0) + 1);
            }

            for (int i = 0; i < grid.length; i++) {
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < grid.length; j++) {
                    // add 0 to each integer considering duplicated number
                    sb.append(grid[i][j]).append("0");
                }
                count += cols.getOrDefault(sb.toString(), 0);
            }

            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}