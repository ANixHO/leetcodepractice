package leetcode.editor.en;

import com.sun.source.tree.Tree;
import leetcode.editor.en.utils.TreeNode;

public class No112_PathSum {
    public static void main(String[] args) {
        Solution solution = new No112_PathSum().new Solution();
    }
/* 
[112]Path Sum
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
        boolean res = false;
        int target;

        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) return res;
            target = targetSum;
            dfs(root, 0);
            return res;
        }

        private void dfs(TreeNode root, int prev) {
            int curr = prev + root.val;
            if (root.left == null && root.right == null) {
                if (target == curr) {
                    res = true;
                    return;
                }
            }

            if (root.left != null) dfs(root.left, curr);
            if (root.right != null) dfs(root.right, curr);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}