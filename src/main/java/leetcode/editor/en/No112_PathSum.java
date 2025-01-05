  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  public class No112_PathSum{
      public static void main(String[] args) {
           Solution solution = new No112_PathSum().new Solution();
      }
/* 
[112]Path Sum
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

    boolean res = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        pathSum(root, targetSum, 0);
        return res;
    }
    private void pathSum(TreeNode node, int targetSum, int prevSum){
       int currSum = prevSum + node.val;
       if (node.left == null && node.right == null){
           if (currSum == targetSum) res = true;
       }

       if (node.left != null) {
           pathSum(node.left, targetSum, currSum);
       }
       if (node.right != null){
           pathSum(node.right, targetSum, currSum);
       }


    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }