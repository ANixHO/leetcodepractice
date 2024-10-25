package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree{
    public static void main(String[] args) {
        Solution solution = new AverageOfLevelsInBinaryTree().new Solution();
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
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> res = new ArrayList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            long curSum = 0;

            for (int i = 0; i < size; i ++){
                TreeNode node = queue.poll();
                curSum += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);

            }
            res.add((double) curSum / size);

        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}