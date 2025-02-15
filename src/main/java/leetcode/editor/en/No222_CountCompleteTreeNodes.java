package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

public class No222_CountCompleteTreeNodes {
    public static void main(String[] args) {
        Solution solution = new No222_CountCompleteTreeNodes().new Solution();
    }
/* 
[222]Count Complete Tree Nodes
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
        public int countNodes(TreeNode root) {
            if (root == null) return 0;

            int left = root.left != null ? countNodes(root.left) : 0;
            int right = root.right != null ? countNodes(root.right) : 0;
            return left + right + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}