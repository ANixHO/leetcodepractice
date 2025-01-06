  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  public class No124_BinaryTreeMaximumPathSum{
      public static void main(String[] args) {
           Solution solution = new No124_BinaryTreeMaximumPathSum().new Solution();
      }
/* 
[124]Binary Tree Maximum Path Sum
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
    int maxSum = Integer.MIN_VALUE; // initialize the minimum value
    public int maxPathSum(TreeNode root) {
        pathSum(root);
        return maxSum;
    }
    private int pathSum(TreeNode node){
        // base case: if the node is null return 0
        if (node == null) return 0;

        // recursively calculate the max sum of left and right subtree
        // ignore the negative sums by taking the maximum with 0;
        int left = Math.max(0, pathSum(node.left));
        int right = Math.max(0, pathSum(node.right));

        // update the global max sum with the current node's contribution
        maxSum = Math.max(maxSum, left+right+node.val);

        // return the maximum path sum including current node and one of subtrees
        return Math.max(left , right) + node.val;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

  }