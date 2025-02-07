  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  public class No129_SumRootToLeafNumbers{
      public static void main(String[] args) {
           Solution solution = new No129_SumRootToLeafNumbers().new Solution();
      }
/* 
[129]Sum Root to Leaf Numbers
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
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;

        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode node, int prevSum){
        int currSum = prevSum * 10 + node.val;

        if (node.left == null && node.right == null){
            res += currSum;
        }

        if (node.left != null) dfs(node.left, currSum);
        if (node.right != null) dfs(node.right, currSum);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }