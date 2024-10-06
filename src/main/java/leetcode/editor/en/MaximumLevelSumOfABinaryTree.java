package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfABinaryTree {
    public static void main(String[] args) {
        Solution solution = new MaximumLevelSumOfABinaryTree().new Solution();
    }
// [1161]Maximum Level Sum of a Binary Tree
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
        public int maxLevelSum(TreeNode root) {
            if (root == null) return 0;

            int count = 0;
            int maxLevel = 0;
            int curLevel;
            int maxSum = Integer.MIN_VALUE;

            Queue<TreeNode> que = new LinkedList<>();
            que.add(root);
            count++;
            curLevel = 1;


            while (!que.isEmpty()) {
                int curSum = 0;
                int nextCount = 0;

                while (count != 0) {
                    TreeNode temp = que.poll();
                    count--;
                    curSum += temp.val;

                    if (temp.left != null) {
                        que.add(temp.left);
                        nextCount ++;
                    }

                    if (temp.right != null) {
                        que.add(temp.right);
                        nextCount ++;
                    }
                }

                if (curSum > maxSum) {
                    maxSum = curSum;
                    maxLevel = curLevel;
                }

                count = nextCount;
                curLevel ++;
            }

            return maxLevel;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}