package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

import java.util.Stack;

public class CountGoodNodesInBinaryTree{
    public static void main(String[] args) {
         Solution solution = new CountGoodNodesInBinaryTree().new Solution();
    }
// [1448]Count Good Nodes in Binary Tree
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
    int count = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return count;
    }

    public void dfs(TreeNode node, int max){
        // depth first search
        if (node != null){
            if (node.val >= max){
                max = node.val;
                count++;
            }
            dfs(node.left, max);
            dfs(node.right, max);
        }

    }


}
//leetcode submit region end(Prohibit modification and deletion)
    	
}