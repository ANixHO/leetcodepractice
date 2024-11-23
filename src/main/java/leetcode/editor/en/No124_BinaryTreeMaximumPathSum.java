  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  public class No124_BinaryTreeMaximumPathSum{
      public static void main(String[] args) {
           Solution solution = new No124_BinaryTreeMaximumPathSum().new Solution();
      }
/* 
[124]Binary Tree Maximum Path Sum
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
    private int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode node){
        if (node == null) return 0;

        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));

        res = Math.max(res, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }