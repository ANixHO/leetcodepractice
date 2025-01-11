  package leetcode.editor.en;

  import javax.swing.plaf.IconUIResource;

  public class No200_NumberOfIslands{
      public static void main(String[] args) {
           Solution solution = new No200_NumberOfIslands().new Solution();
      }
/* 
[200]Number of Islands
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int row;
    int col;
    public int numIslands(char[][] grid) {
        // get the total rows and cols
        row = grid.length;
        col = grid[0].length;
        int res = 0;

        // iterate the grid, when meet the land (1) start dfs
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1'){
                    dfs(grid, i,j);
                    res++;
                }
            }
        }
        return res;
    }

    // dfs of graph, mark visited land as 2
    private void dfs(char[][] grid, int i, int j){
        // if beyond the boundary or meet the water / visited land, stop searching
        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] != '1') {
            return;
        }

        // mark the visited land as 2
        grid[i][j]  = '2';
        // dfs the adjacent lands
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }