  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  public class No98_ValidateBinarySearchTree{
      public static void main(String[] args) {
           Solution solution = new No98_ValidateBinarySearchTree().new Solution();
           TreeNode root = new TreeNode(1);
           root.right = new TreeNode(1);
           solution.isValidBST(root);
      }
/* 
[98]Validate Binary Search Tree
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
    long prev = Long.MIN_VALUE;
    boolean isValid = true;
    public boolean isValidBST(TreeNode root) {
        if (root.left == null && root.right == null) return true;
        dfs(root);
        return isValid;
    }

    private void dfs(TreeNode root){
        if (root.left != null) {
            dfs(root.left);
        }

        if (root.val <= prev) isValid = false;
        prev = root.val;

        if (root.right != null) {
           dfs(root.right);
        }

    }


}
//leetcode submit region end(Prohibit modification and deletion)

  }