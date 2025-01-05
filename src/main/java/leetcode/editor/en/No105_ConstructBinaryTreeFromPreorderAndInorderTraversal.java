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
    Map<Integer, Integer> map;
    int preIdx;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        preIdx = 0;

        for (int i = 0; i < inorder.length; i ++){
            map.put(inorder[i], i);
        }

        return builder(0, preorder.length-1, preorder);
    }

    private TreeNode builder(int left, int right, int[] preorder){
        if (preIdx >= preorder.length) return null;
        if (left > right) return null;

        int val = preorder[preIdx++];
        TreeNode node = new TreeNode(val);
        int inIdx = map.get(val);
        node.left = builder(left, inIdx-1, preorder);
        node.right = builder(inIdx + 1, right, preorder);
        return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }