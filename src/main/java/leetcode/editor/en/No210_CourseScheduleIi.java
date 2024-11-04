package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class No210_CourseScheduleIi {
    public static void main(String[] args) {
        Solution solution = new No210_CourseScheduleIi().new Solution();
    }

    // [210]Course Schedule II
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<Integer> res;
        List<Integer>[] adj;
        int[] visited;

        public int[] findOrder(int numCourses, int[][] prerequisites) {
            res = new ArrayList<>();
            adj = new ArrayList[numCourses];
            visited = new int[numCourses];

            for (int i = 0; i < numCourses; i++) {
                adj[i] = new ArrayList<>();
            }

            for (int[] pre : prerequisites){
                adj[pre[0]].add(pre[1]);
            }

            for (int i = 0; i < numCourses; i++) {
                if (!dfs(i)) return new int[]{};
            }

            return res.stream().mapToInt(i -> i).toArray();
        }

        private boolean dfs(int node){
            if (visited[node] == 1) return false;
            if (visited[node] == 2) return true;

            visited[node] = 1;

            for (int i : adj[node]){
                if (!dfs(i)) return false;
            }

            visited[node] = 2;
            res.add(node);

            return true;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}