package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

public class CountCompleteTreeNodes{
    public static void main(String[] args) {
        Solution solution = new CountCompleteTreeNodes().new Solution();
    }
// [222]Count Complete Tree Nodes
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
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left + right + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}