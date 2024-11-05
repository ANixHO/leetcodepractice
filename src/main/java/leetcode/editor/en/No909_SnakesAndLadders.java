package leetcode.editor.en;

import java.util.ArrayDeque;
import java.util.Deque;

public class No909_SnakesAndLadders {
    public static void main(String[] args) {
        Solution solution = new No909_SnakesAndLadders().new Solution();
    }

    // [909]Snakes and Ladders
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int snakesAndLadders(int[][] board) {
            int destination = board.length * board.length;
            boolean[] visited = new boolean[destination + 1];
            Deque<Integer> deque = new ArrayDeque<>();

            deque.add(1);
            visited[1] = true;
            int ans = 0;

            while (!deque.isEmpty()) {
                ans++;
                int size = deque.size();

                for (int i = 0; i < size; i++) {
                    int curr = deque.poll();
                    boolean added = false;

                    for (int j = 6; j > 0; j--) {
                        int newCell = curr + j;

                        if (newCell >= destination) {
                            return ans;
                        }

                        if (!visited[newCell]) {
                            int temp = getCell(board, newCell);

                            if (temp == destination) return ans;

                            if ((temp==-1 || temp == newCell) && !added ){
                                deque.offer(newCell);
                                added = true;
                            } else if (temp > 0){
                                deque.offer(temp);
                            }

                            visited[newCell] = true;

                        }
                    }
                }
            }

            return -1;
        }

        private int getCell(int[][] board, int newCell) {
            int n = board.length;
            int row = n - 1 - (newCell - 1) / n;
            int col = 0;

            if (n % 2 == 1) // If the number of rows is odd
                col = (row % 2 == 0 ? (newCell - 1) % n : n - 1 - (newCell - 1) % n); // Compute the column index based on row direction
            else // If the number of rows is even
                col = (row % 2 == 0 ? n - 1 - (newCell - 1) % n : (newCell - 1) % n); // Compute the column index based on row direction
            return board[row][col]; // Return the value at the calculated cell
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}