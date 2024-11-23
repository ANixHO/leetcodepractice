  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  public class No236_LowestCommonAncestorOfABinaryTree{
      public static void main(String[] args) {
           Solution solution = new No236_LowestCommonAncestorOfABinaryTree().new Solution();
      }
/* 
[236]Lowest Common Ancestor of a Binary Tree
*/
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p) return p;
        if (root == q) return q;
        if (root == null) return null;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null ) return root;

        if (left == null) return right;
        else return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }