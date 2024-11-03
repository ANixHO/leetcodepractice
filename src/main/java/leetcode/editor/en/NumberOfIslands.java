package leetcode.editor.en;

public class NumberOfIslands {
    public static void main(String[] args) {
        Solution solution = new NumberOfIslands().new Solution();
    }

    // [200]Number of Islands
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int col;
        int row;

        public int numIslands(char[][] grid) {
            col = grid[0].length;
            row = grid.length;
            int count = 0;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (grid[i][j] == '1') {
                        dfs(grid, i, j);
                        count++;
                    }
                }
            }


            return count;
        }

        private void dfs(char[][] grid, int i, int j) {
            if (i < 0 || i >= row ||
                    j < 0 || j >= col ||
                    grid[i][j] != '1') {

                return;
            }

            grid[i][j] = '2';
            dfs(grid, i, j + 1);
            dfs(grid, i + 1, j);
            dfs(grid, i, j - 1);
            dfs(grid, i - 1, j);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}