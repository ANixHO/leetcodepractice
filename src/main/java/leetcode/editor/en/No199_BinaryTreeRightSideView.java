  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  import java.util.ArrayList;
  import java.util.LinkedList;
  import java.util.List;
  import java.util.Queue;

  public class No199_BinaryTreeRightSideView{
      public static void main(String[] args) {
           Solution solution = new No199_BinaryTreeRightSideView().new Solution();
      }
/* 
[199]Binary Tree Right Side View
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

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode peek = queue.peek();
            res.add(peek.val);

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.right != null) queue.offer(node.right);
                if (node.left != null) queue.offer(node.left);
            }
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }