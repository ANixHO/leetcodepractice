package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

public class No108_ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new No108_ConvertSortedArrayToBinarySearchTree().new Solution();
    }
/* 
[108]Convert Sorted Array to Binary Search Tree
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
        public TreeNode sortedArrayToBST(int[] nums) {
            return helper(nums, 0, nums.length - 1);
        }

        private TreeNode helper(int[] nums, int left, int right) {
            if (right < left) return null;
            int mid = (left + right) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = helper(nums, left, mid - 1);
            node.right = helper(nums, mid + 1, right);
            return node;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}