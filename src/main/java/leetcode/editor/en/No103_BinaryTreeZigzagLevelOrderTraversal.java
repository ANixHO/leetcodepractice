package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

import java.util.*;

public class No103_BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
    }
/* 
[103]Binary Tree Zigzag Level Order Traversal
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            if (root == null) return new ArrayList<>();

            Queue<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> res = new ArrayList<>();
            queue.add(root);
            boolean isReverse = false;

            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> list = new ArrayList<>();

                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    list.add(node.val);

                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
                if (isReverse) Collections.reverse(list);

                if (isReverse) isReverse = false;
                else isReverse = true;

                res.add(list);
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}