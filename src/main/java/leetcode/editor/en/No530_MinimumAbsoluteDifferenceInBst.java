  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  public class No530_MinimumAbsoluteDifferenceInBst{
      public static void main(String[] args) {
           Solution solution = new No530_MinimumAbsoluteDifferenceInBst().new Solution();
           TreeNode root = new TreeNode(1);
           root.right = new TreeNode(2);
           solution.getMinimumDifference(root);
      }
/* 
[530]Minimum Absolute Difference in BST
*/
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res = Integer.MAX_VALUE;
    int prev = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode node){
        if (node == null) return;

        if (node.left != null) dfs(node.left);
        res = Math.min(res, Math.abs(node.val - prev));
        prev = node.val;
        if (node.right != null) dfs(node.right);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }