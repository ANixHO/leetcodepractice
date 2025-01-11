package leetcode.editor.en;

public class No130_SurroundedRegions {
    public static void main(String[] args) {
        Solution solution = new No130_SurroundedRegions().new Solution();
    }

    /*
    [130]Surrounded Regions
    */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int row, col;

        public void solve(char[][] board) {
            row = board.length;
            col = board[0].length;

            // check is there any 'O' places at the first row and last row
            // if there is, dfs the associated 'O's and mark these to '1'
            for (int i = 0; i < row; i++) {
                if (board[i][0] == 'O') dfs(board, i, 0);
                if (board[i][col - 1] == 'O') dfs(board, i, col - 1);
            }

            // check is there any 'O' places at the first col and last col
            // if there is, dfs the connected 'O's and mark these to '1'
            for (int i = 0; i < col; i++) {
                if (board[0][i] == 'O') dfs(board, 0, i);
                if (board[row - 1][i] == 'O') dfs(board, row - 1, i);
            }

            // iterate the graph,
            // replace all 'O's to 'X'
            // replace all '1's to 'O'
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (board[i][j] == 'O') {
                        board[i][j] = 'X';
                    } else if (board[i][j] == '1') {
                        board[i][j] = 'O';
                    }
                }
            }
        }

        // dfs the connected 'O's that located at the edge of the board
        // mark them to '1'
        private void dfs(char[][] board, int i, int j) {
            if (i < 0 || i >= row ||
                    j < 0 || j >= col ||
                    board[i][j] != 'O') {
                return;
            }

            board[i][j] = '1';
            dfs(board, i, j - 1);
            dfs(board, i, j + 1);
            dfs(board, i - 1, j);
            dfs(board, i + 1, j);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}