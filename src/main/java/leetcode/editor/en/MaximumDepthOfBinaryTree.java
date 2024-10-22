package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new MaximumDepthOfBinaryTree().new Solution();
    }
// [104]Maximum Depth of Binary Tree
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
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;

            int left = 0;
            int right = 0;

            if (root.right != null){
                right = maxDepth(root.right);
            }

            if (root.left != null){
                left = maxDepth(root.left);
            }

            return Math.max(right, left) + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}