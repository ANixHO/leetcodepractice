  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  public class No114_FlattenBinaryTreeToLinkedList{
      public static void main(String[] args) {
           Solution solution = new No114_FlattenBinaryTreeToLinkedList().new Solution();
      }
/* 
[114]Flatten Binary Tree to Linked List
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
    TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }