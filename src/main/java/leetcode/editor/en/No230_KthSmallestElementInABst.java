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
    int index = 0;
    int target;
    int res = 0;
    public int kthSmallest(TreeNode root, int k) {
        target = k;
        dfs(root);
        return res;
    }
    private void dfs(TreeNode node){
        if (node == null) return ;

        if (node.left != null) dfs(node.left);
        index++;
        if (index == target) res = node.val;
        if (node.right!= null) dfs(node.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }