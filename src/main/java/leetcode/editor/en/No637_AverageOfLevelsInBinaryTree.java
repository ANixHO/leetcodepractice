  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  import java.util.ArrayList;
  import java.util.LinkedList;
  import java.util.List;
  import java.util.Queue;

  public class No637_AverageOfLevelsInBinaryTree{
      public static void main(String[] args) {
           Solution solution = new No637_AverageOfLevelsInBinaryTree().new Solution();
      }
      // [637]Average of Levels in Binary Tree
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                sum += curr.val;
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }

            res.add((double)sum / size);
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }