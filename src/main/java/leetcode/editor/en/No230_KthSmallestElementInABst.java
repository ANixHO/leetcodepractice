  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  public class No230_KthSmallestElementInABst{
      public static void main(String[] args) {
           Solution solution = new No230_KthSmallestElementInABst().new Solution();
      }
/* 
[230]Kth Smallest Element in a BST
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
    int res = 0;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return res;
    }

    private void dfs(TreeNode node, int k){
        if (node == null) return ;

        if (node.left != null) dfs(node.left, k);

        count ++;
        if (count == k) res = node.val;

        if (node.right != null) dfs(node.right, k);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }