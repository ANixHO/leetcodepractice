package leetcode.editor.en;

import com.sun.source.tree.Tree;
import leetcode.editor.en.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumAbsoluteDifferenceInBst{
    public static void main(String[] args) {
        Solution solution = new MinimumAbsoluteDifferenceInBst().new Solution();

        TreeNode root = new TreeNode().arrayToTreeNode(new Integer[]{236,104,701,null,227,null,911});
        solution.getMinimumDifference(root);
    }
// [530]Minimum Absolute Difference in BST
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int res = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        inOrder(root);
        return res;
    }

    private void inOrder(TreeNode node){
        if (node == null) return;
        if (node.left != null) inOrder(node.left);
        if (prev != null) res = Math.min(res, Math.abs(node.val - prev.val));
        prev = node;
        if (node.right !=null) inOrder(node.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}