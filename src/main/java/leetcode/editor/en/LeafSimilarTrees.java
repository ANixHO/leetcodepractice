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

            getLeaf(root1, leaf1);
            getLeaf(root2, leaf2);


            return leaf1.equals(leaf2);

        }

        public void getLeaf(TreeNode root, List<Integer> leafList) {
            if(root == null){
                return;
            }

            if (root.left != null) {
                getLeaf(root.left, leafList);
            }

            if (root.right != null) {
                getLeaf(root.right, leafList);
            }

            if (root.left == null && root.right == null) {
                leafList.add(root.val);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}