package leetcode.editor.en;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Queue;

public class NearestExitFromEntranceInMaze {
    public static void main(String[] args) {
        Solution solution = new NearestExitFromEntranceInMaze().new Solution();
    }

    // [1926]Nearest Exit from Entrance in Maze
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int nearestExit(char[][] maze, int[] entrance) {
            int collen = maze[0].length;
            int rowlen = maze.length;

            int[] xd = new int[]{1, -1, 0, 0};
            int[] yd = new int[]{0, 0, 1, -1};

            Deque<int[]> deque = new ArrayDeque<>();

            deque.add(new int[]{entrance[0], entrance[1], 0});
            maze[entrance[0]][entrance[1]] = '+';

            while (!deque.isEmpty()){
                int[] temp = deque.pollFirst();
                int r = temp[0];
                int c = temp[1];
                int dis = temp[2];

                for (int i = 0; i < 4; i++) {
                    int x = r + xd[i];
                    int y = c + yd[i];

                    if (x == -1 || y == -1 || x == rowlen || y == collen ) continue;
                    if (maze[x][y] == '+') continue;
                    if (x == 0 || y == 0 || x == rowlen - 1 || y == collen -  1) return dis + 1;

                    maze[x][y] = '+';
                    deque.add(new int[]{x,y,dis+1});
                }


            }

            return -1;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}