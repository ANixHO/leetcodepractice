  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  import java.util.HashMap;
  import java.util.Map;

  public class No105_ConstructBinaryTreeFromPreorderAndInorderTraversal{
      public static void main(String[] args) {
           Solution solution = new No105_ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
      }
/* 
[105]Construct Binary Tree from Preorder and Inorder Traversal
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
    private int preIndex = 0;
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(0, preorder.length - 1, preorder);
    }
    private TreeNode helper(int leftB, int rightB, int[] preorder){
        if (preIndex >= preorder.length) return null;
        if (leftB > rightB) return null;

        TreeNode root = new TreeNode(preorder[preIndex++]);
        int inIndex = map.get(root.val);
        root.left = helper(leftB, inIndex - 1, preorder);
        root.right = helper(inIndex + 1, rightB, preorder);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }