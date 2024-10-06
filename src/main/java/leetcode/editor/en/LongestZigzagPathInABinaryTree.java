package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

public class LongestZigzagPathInABinaryTree{
    public static void main(String[] args) {
         Solution solution = new LongestZigzagPathInABinaryTree().new Solution();
    }
// [1372]Longest ZigZag Path in a Binary Tree
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
    int count;

    public int longestZigZag(TreeNode root) {
        count = 0;
        dfs(root,'l', 0 );
        return count;
    }

    private void dfs(TreeNode node, char pre, int length){
        if (node == null) return;

        count = Math.max(length, count);

        dfs(node.left, 'l', pre != 'l' ? length + 1 : 1);
        dfs(node.right, 'r', pre != 'r'? length + 1 : 1);

    }


}
//leetcode submit region end(Prohibit modification and deletion)
    	
}