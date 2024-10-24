package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeIterator {
    public static void main(String[] args) {
    }
// [173]Binary Search Tree Iterator
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
    class BSTIterator {

        Queue<Integer> list = new LinkedList<>();

        public BSTIterator(TreeNode root) {
            helper(root, list);
        }

        public int next() {
            return list.poll();
        }

        public boolean hasNext() {
            return list.peek() != null;
        }

        private void helper(TreeNode node, Queue<Integer> list) {
            if (node == null) return;

            helper(node.left, list);
            list.add(node.val);
            helper(node.right, list);
        }
    }

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
//leetcode submit region end(Prohibit modification and deletion)

}