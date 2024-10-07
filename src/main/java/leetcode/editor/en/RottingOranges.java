package leetcode.editor.en;

import java.util.ArrayDeque;
import java.util.Deque;

public class RottingOranges{
    public static void main(String[] args) {
         Solution solution = new RottingOranges().new Solution();
    }
// [994]Rotting Oranges
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int orangesRotting(int[][] grid) {

        int rlen = grid.length;
        int clen = grid[0].length;

        int[] rd = new int[]{1, -1, 0, 0};
        int[] cd = new int[]{0, 0, 1, -1};

        Deque<Pair> deque = new ArrayDeque<>();

        int res = 0;

        for (int i = 0; i < rlen; i++) {
            for (int j = 0; j < clen; j++) {
                if (grid[i][j] ==2) deque.add(new Pair(i,j));
            }
        }

        while (!deque.isEmpty()){
            int size = deque.size();
            boolean b = false;

            while (size-- > 0) {

                Pair cur = deque.pollFirst();

                for (int i = 0; i < 4; i++) {

                    int r = cur.row + rd[i];
                    int c = cur.col + cd[i];

                    if (r > -1 && r < rlen &&
                            c > -1 && c < clen &&
                            grid[r][c] == 1) {

                        grid[r][c] = 2;
                        deque.add(new Pair(r, c));
                        b = true;
                    }
                }
            }

            if (b) res++;
        }

        for (int i = 0; i < rlen; i++) {
            for (int j = 0; j < clen; j++) {
                if (grid[i][j] == 1) return -1;
            }
        }

        return res;
    }


}

class Pair {
        int col;
        int row;

        public Pair(int row, int col){
            this.col = col;
            this.row = row;
        }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}