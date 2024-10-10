package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class LeafSimilarTrees {
    public static void main(String[] args) {
        Solution solution = new LeafSimilarTrees().new Solution();
    }
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
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> leaf1 = new ArrayList<>();
            List<Integer> leaf2 = new ArrayList<>();

            dfs(root1, leaf1);
            dfs(root2, leaf2);

            return leaf1.equals(leaf2);
        }

        private void dfs(TreeNode node, List<Integer> list){


            if (node == null) return;

            if (node.left != null){
                dfs(node.left, list);
            }

            if (node.right != null){
                dfs(node.right, list);
            }

            if (node.left == null && node.right == null) {
                list.add(node.val);
            }

        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}