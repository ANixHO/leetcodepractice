  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  public class No226_InvertBinaryTree{
      public static void main(String[] args) {
           Solution solution = new No226_InvertBinaryTree().new Solution();
      }
/* 
[226]Invert Binary Tree
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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        invert(root);
        invertTree(root.left);
        invertTree(root.right);

        return root;

    }

    private void invert(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }