  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  import java.util.LinkedList;
  import java.util.Queue;

  public class No101_SymmetricTree{
      public static void main(String[] args) {
           Solution solution = new No101_SymmetricTree().new Solution();
      }
/* 
[101]Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        return isSame(root.left, root.right);
    }

    private boolean isSame(TreeNode p, TreeNode q){
        if (p == null || q == null) return p == q;
        return (p.val == q.val) && isSame(p.left, q.right) && isSame(p.right, q.left) ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }