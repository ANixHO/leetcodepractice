package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

import java.util.HashMap;

public class PathSumIii{
    public static void main(String[] args) {
         Solution solution = new PathSumIii().new Solution();
         TreeNode root = new TreeNode().arrayToTreeNode(new Integer[]{1000000000,1000000000, null,294967296,null,1000000000,null,1000000000,null,1000000000});
         solution.pathSum(root, 0);
    }
// [437]Path Sum III
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

//    int total = 0;
//    public int pathSum(TreeNode root, int sum) {
//        if(root == null) return 0;
//        helper(root, sum, 0);
//        pathSum(root.left, sum);
//        pathSum(root.right, sum);
//        return total;
//    }
//
//    void helper(TreeNode root, int sum, long curr) {
//        if(root == null) return;
//        curr += root.val;
//        if(curr == sum) total++;
//        helper(root.left, sum, curr);
//        helper(root.right, sum, curr);
//    }

    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {

        if (root == null) return 0;

        helper(root, 0, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return count;

    }


    private void helper(TreeNode node, long prefixSum, int targetSum){
        if (node == null) return;

        prefixSum += node.val;
        if (prefixSum == targetSum) count ++;

        helper(node.left, prefixSum, targetSum);
        helper(node.right, prefixSum, targetSum);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}