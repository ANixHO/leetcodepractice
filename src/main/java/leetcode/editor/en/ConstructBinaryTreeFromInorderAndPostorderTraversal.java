package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal{
    public static void main(String[] args) {
        Solution solution = new ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
    }
// [106]Construct Binary Tree from Inorder and Postorder Traversal
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
    Map<Integer, Integer> map;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();

        for (int i = 0; i < postorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);

    }

    private TreeNode helper(int[] inorder, int inStart, int inEnd,
                            int[] postOrder, int postStart, int postEnd){
        if (inStart > inEnd) return null;

        TreeNode root = new TreeNode(postOrder[postEnd]);
        int inIndex = map.get(root.val);
        int leftSize = inIndex - inStart;
        int rightSize = inEnd - inIndex;
        root.left = helper(inorder, inStart, inIndex - 1, postOrder, postStart, postStart + leftSize - 1);
        root.right = helper(inorder, inIndex + 1, inEnd, postOrder, postEnd-rightSize, postEnd - 1);
        return root;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}