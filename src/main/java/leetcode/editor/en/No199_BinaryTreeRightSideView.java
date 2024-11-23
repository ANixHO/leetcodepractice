package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No199_BinaryTreeRightSideView {
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
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            if (root == null) return new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            List<Integer> res = new ArrayList<>();

            queue.add(root);

            while (!queue.isEmpty()) {
                int size = queue.size();

                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();

                    if (i == 0) {
                        res.add(curr.val);
                    }

                    if (curr.right != null) queue.add(curr.right);
                    if (curr.left != null) queue.add(curr.left);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}