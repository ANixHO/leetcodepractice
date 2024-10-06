package leetcode.editor.en;

import com.sun.source.tree.Tree;
import leetcode.editor.en.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeRightSideView().new Solution();
    }
// [199]Binary Tree Right Side View
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
        private int maxDepth = 0;
        private int curDepth = 0;
        private List<Integer> list;

        public List<Integer> rightSideView(TreeNode root) {
            list = new ArrayList<>();
            dfs(root, curDepth);
            return list;
        }

        private void dfs(TreeNode node, int curDepth) {
            if (node == null) return;

            curDepth ++;

            if (curDepth > maxDepth){
                list.add(node.val);
                maxDepth = curDepth;
            }

            dfs(node.right, curDepth);
            dfs(node.left, curDepth);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}