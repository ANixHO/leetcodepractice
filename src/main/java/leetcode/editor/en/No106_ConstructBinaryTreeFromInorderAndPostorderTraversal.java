  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  public class No106_ConstructBinaryTreeFromInorderAndPostorderTraversal{
      public static void main(String[] args) {
           Solution solution = new No106_ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
      }
/* 
[106]Construct Binary Tree from Inorder and Postorder Traversal
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
    int postIdx = 0;
    int inIdx = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIdx = postorder.length - 1;
        inIdx = inorder.length - 1;
        return helper(inorder, postorder, Integer.MAX_VALUE);
    }

    private TreeNode helper(int[] inorder, int[] postorder, int limit){
        if (postIdx < 0) return null;
        if (inorder[inIdx] == limit){
            inIdx--;
            return null;
        }

        TreeNode root = new TreeNode(postorder[postIdx--]);
        root.right = helper(inorder,postorder, root.val);
        root.left = helper(inorder,postorder,limit);
        return root;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }