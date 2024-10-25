package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversal().new Solution();
    }
// [102]Binary Tree Level Order Traversal
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) return new ArrayList<>();
            List<List<Integer>> res = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> list = new ArrayList<>();

                while (size-- > 0) {
                    TreeNode node = queue.poll();
                    if (node != null) {
                        list.add(node.val);
                        if (node.left != null) queue.add(node.left);
                        if (node.right != null) queue.add(node.right);
                    } ;
                }

                res.add(list);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}