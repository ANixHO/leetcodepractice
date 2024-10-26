package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

public class KthSmallestElementInABst{
    public static void main(String[] args) {
        Solution solution = new KthSmallestElementInABst().new Solution();
    }
// [230]Kth Smallest Element in a BST
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
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return ans;
    }

    private void inOrder(TreeNode node, int k){
        if (node == null) return ;
        if (node.left != null) inOrder(node.left, k);

        count ++;
        if (count == k) ans = node.val;

        if (node.right != null) inOrder(node.right, k);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}