package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FlattenBinaryTreeToLinkedList{
    public static void main(String[] args) {
        Solution solution = new FlattenBinaryTreeToLinkedList().new Solution();
    }
// [114]Flatten Binary Tree to Linked List
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
    private Queue<TreeNode> queue = new LinkedList<>();
    public void flatten(TreeNode root) {
        addToQueue(root);

        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            temp.right = queue.peek();
            temp.left = null;
        }
    }

    private void addToQueue(TreeNode node){
        if (node == null) return;

        queue.add(node);
        addToQueue(node.left);
        addToQueue(node.right);

    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}