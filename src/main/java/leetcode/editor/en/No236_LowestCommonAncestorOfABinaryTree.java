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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p) return p;
        if (root == q) return q;
        if (root == null) return null;

        // search p and q node recursively in the subtree
        // if there is p or q, it will return non null node
        // if left or right return null, target is not exist in that subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // both subtree returns non null
        // means both subtree contains both targets
        if (left != null && right != null) return root;

        // one subtree returns null
        // another subtree contains both targets
        if (left == null) return right;
        else return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }