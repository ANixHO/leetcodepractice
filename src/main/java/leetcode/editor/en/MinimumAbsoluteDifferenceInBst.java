package leetcode.editor.en;

import com.sun.source.tree.Tree;
import leetcode.editor.en.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumAbsoluteDifferenceInBst{
    public static void main(String[] args) {
        Solution solution = new MinimumAbsoluteDifferenceInBst().new Solution();
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
    public int getMinimumDifference(TreeNode root) {
        int res = Integer.MAX_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            while(size-- > 0){
                TreeNode node = queue.poll();
                if (node.left!= null) {
                    res = Math.min(res, Math.abs(node.val - node.left.val));
                    queue.add(node.left);
                }
                if (node.right != null){
                    res = Math.min(res, Math.abs(node.val - node.right.val));
                    queue.add(node.right);
                }
            }
        }

        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}