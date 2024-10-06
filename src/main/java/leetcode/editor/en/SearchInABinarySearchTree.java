package leetcode.editor.en;

import com.sun.source.tree.Tree;
import leetcode.editor.en.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SearchInABinarySearchTree{
    public static void main(String[] args) {
         Solution solution = new SearchInABinarySearchTree().new Solution();
    }
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
    public TreeNode searchBST(TreeNode root, int val) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode curNode = queue.poll();

            if(curNode.val == val){
                return curNode;
            }

            if(curNode.left != null){
                queue.add(curNode.left);
            }

            if(curNode.right != null){
                queue.add(curNode.right);
            }
        }

        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}