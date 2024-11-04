package leetcode.editor.en;

import java.util.ArrayList;

public class No207_CourseSchedule {
    public static void main(String[] args) {
        Solution solution = new No207_CourseSchedule().new Solution();
    }

    // [207]Course Schedule
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        ArrayList<Integer>[] adj;
        int[] visited;

        public boolean canFinish(int numCourses, int[][] prerequisites) {
            adj = new ArrayList[numCourses];

            for (int i = 0; i < numCourses; i++) {
                adj[i] = new ArrayList<>();
            }

            for (int[] p : prerequisites){
                adj[p[0]].add(p[1]);
            }

            // unvisited : 0 ; visited : 1 ; complete : 2;
            visited = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                if (!dfs(i)) return false;
            }

            return true;
        }

        private boolean dfs(int node){
            if (visited[node] == 1){
                return false;
            }

            if (visited[node] == 2){
                return true;
            }

            visited[node] = 1;

            for (int n : adj[node]){
                if (!dfs(n)){
                    return false;
                }
            }

            visited[node] = 2;

            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}