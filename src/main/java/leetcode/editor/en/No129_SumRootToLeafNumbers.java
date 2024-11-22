package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

public class No129_SumRootToLeafNumbers {
    public static void main(String[] args) {
        Solution solution = new No129_SumRootToLeafNumbers().new Solution();
    }
/* 
[129]Sum Root to Leaf Numbers
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
        int sum = 0;

        public int sumNumbers(TreeNode root) {
            dfs(root, 0);
            return sum;
        }

        private void dfs(TreeNode node, int prev) {
            int curr = prev * 10 + node.val;
            if (node.left == null && node.right == null) {
                sum += prev ;
                return;
            }

            if (node.left != null) dfs(node.left, curr);
            if (node.right != null) dfs(node.right,curr);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}