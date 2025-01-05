package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

public class No106_ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public static void main(String[] args) {
        Solution solution = new No106_ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
    }
/* 
[106]Construct Binary Tree from Inorder and Postorder Traversal
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
        int inIdx, postIdx;

        public TreeNode buildTree(int[] inorder, int[] postorder) {
            inIdx = inorder.length - 1;
            postIdx = postorder.length - 1;
            return build(inorder, postorder, Integer.MAX_VALUE);
        }

        private TreeNode build(int[] inorder, int[] postorder, int limit) {
            if (postIdx < 0) return null;
            // iterate inorder descend, it means current node should be null
            if (inorder[inIdx] == limit){
                inIdx--;
                return null;
            }

            TreeNode node = new TreeNode(postorder[postIdx--]);
            node.right = build(inorder, postorder, node.val);
            node.left = build(inorder, postorder, limit);
            return node;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}