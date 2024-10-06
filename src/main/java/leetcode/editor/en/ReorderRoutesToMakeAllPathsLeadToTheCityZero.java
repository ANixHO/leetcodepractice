package leetcode.editor.en;

import java.sql.Array;
import java.util.*;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    public static void main(String[] args) {
        Solution solution = new ReorderRoutesToMakeAllPathsLeadToTheCityZero().new Solution();
    }

    // [1466]Reorder Routes to Make All Paths Lead to the City Zero
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {


        public int minReorder(int n, int[][] connections) {
            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }

            for (int[] con : connections) {
                int src = con[0];
                int des = con[1];
                adj.get(src).add(des);
                adj.get(des).add(-src);
            }

            return dfs(adj, new boolean[n], 0);
        }

        private int dfs(List<List<Integer>> adj, boolean[] visited, int src){
            int changes = 0;
            visited[src] = true;

            for(int node : adj.get(src)){
                if(!visited[Math.abs(node)]){
                    changes += (node > 0 ? 1 : 0);
                    changes += dfs(adj, visited, Math.abs(node));
                }
            }

            return changes;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}