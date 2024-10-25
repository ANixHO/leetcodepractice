package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeZigzagLevelOrderTraversal().new Solution();
    }
// [103]Binary Tree Zigzag Level Order Traversal
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            if (root == null) return new ArrayList<>();

            List<List<Integer>> res = new LinkedList<>();
            Deque<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            boolean isFromLeft = true;

            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> list = new ArrayList<>();

                for (int i = 0; i < size ; i ++){
                    if (!isFromLeft) {
                        TreeNode node = queue.pollLast();
                        list.add(node.val);
                        if (node.right != null) queue.addFirst(node.right);
                        if (node.left != null) queue.addFirst(node.left);
                    } else {
                        TreeNode node = queue.pollFirst();
                        list.add(node.val);
                        if (node.left != null) queue.addLast(node.left);
                        if (node.right != null) queue.addLast(node.right);
                    }

                }

                isFromLeft = !isFromLeft;
                res.add(list);
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}