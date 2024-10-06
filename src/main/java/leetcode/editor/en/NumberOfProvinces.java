package leetcode.editor.en;
public class NumberOfProvinces{
    public static void main(String[] args) {
         Solution solution = new NumberOfProvinces().new Solution();
    }
// [547]Number of Provinces
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int province = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]){
                province ++;
                dfs(isConnected, visited, i);
            }
        }

        return province;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int i){
        visited[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !visited[j]){
                dfs(isConnected,visited,j);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}