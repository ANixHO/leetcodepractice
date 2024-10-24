package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

public class SumRootToLeafNumbers {
    public static void main(String[] args) {
        Solution solution = new SumRootToLeafNumbers().new Solution();
        Integer[] arr = new Integer[]{1,2,3};
        TreeNode root = new TreeNode().arrayToTreeNode(arr);
        solution.sumNumbers(root);
    }
// [129]Sum Root to Leaf Numbers
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
        private int sum = 0;

        public int sumNumbers(TreeNode root) {
            helper(root, 0);
            return sum;
        }

        private void helper(TreeNode node, int prevNum) {
            int curNum = prevNum * 10 + node.val;
            if (node.left == null && node.right == null) {
                sum += curNum;
                return;
            }

            if(node.left != null) helper(node.left, curNum);
            if(node.right != null) helper(node.right, curNum);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}