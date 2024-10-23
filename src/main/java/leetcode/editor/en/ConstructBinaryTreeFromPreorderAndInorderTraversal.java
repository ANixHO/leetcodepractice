package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal{
    public static void main(String[] args) {
        Solution solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
    }
// [105]Construct Binary Tree from Preorder and Inorder Traversal
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
    int preIndex = 0;
    Map<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(0, preorder.length - 1, preorder);

    }

    private TreeNode helper(int leftBound, int rightBound, int[] preOrder){
        if (preIndex >= preOrder.length ) return null;
        if (rightBound < leftBound) return null;

        TreeNode root = new TreeNode(preOrder[preIndex++]);
        int inIndex = map.get(root.val);
        root.left = helper(leftBound, inIndex - 1, preOrder);
        root.right = helper(inIndex + 1, rightBound, preOrder);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}