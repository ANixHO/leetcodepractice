package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

public class No98_ValidateBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new No98_ValidateBinarySearchTree().new Solution();
    }
/* 
[98]Validate Binary Search Tree
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
        long prev = Long.MIN_VALUE;

        public boolean isValidBST(TreeNode root) {
            boolean left = root.left == null || isValidBST(root.left);

            if (prev >= root.val) return false;
            prev = root.val;

            boolean right = root.right == null || isValidBST(root.right);

            return left && right;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}