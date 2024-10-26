package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ValidateBinarySearchTree().new Solution();
    }
// [98]Validate Binary Search Tree
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
        boolean isValid = true;
        long prev = Long.MIN_VALUE;

        public boolean isValidBST(TreeNode root) {
            if (root == null) return false;
            if (root.left == null && root.right == null) return true;
            inOrder(root);
            return isValid;
        }

        private void inOrder(TreeNode node) {
            if (node == null) return;
            if (node.left != null) inOrder(node.left);

            if (node.val <= prev) {
                isValid = false;
            }
            prev = node.val;
            if (node.right != null) inOrder(node.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}