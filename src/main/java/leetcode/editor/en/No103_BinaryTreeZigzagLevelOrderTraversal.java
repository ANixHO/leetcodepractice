  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  import java.util.*;

  public class No103_BinaryTreeZigzagLevelOrderTraversal{
      public static void main(String[] args) {
           Solution solution = new No103_BinaryTreeZigzagLevelOrderTraversal().new Solution();
      }
/* 
[103]Binary Tree Zigzag Level Order Traversal
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isLeftToRight = true;

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            if (!isLeftToRight){
                Collections.reverse(list);
                isLeftToRight = true;
            } else {
                isLeftToRight = false;
            }
            res.add(list);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }